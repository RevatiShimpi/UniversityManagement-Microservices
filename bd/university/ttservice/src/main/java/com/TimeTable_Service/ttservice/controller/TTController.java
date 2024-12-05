package com.TimeTable_Service.ttservice.controller;

import com.TimeTable_Service.ttservice.entities.TimeTable;
import com.TimeTable_Service.ttservice.services.TTService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.List;

@RestController
@RequestMapping("/api/timetable")
public class TTController {

    private TTService ttService;

    @GetMapping("/{dayofweek}")
    private ResponseEntity<List<TimeTable>> gettt(@PathVariable("dayofweek") String day){
        List<TimeTable> tt=ttService.Findbyday(day);
        if(tt.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(tt);
        }
        return ResponseEntity.ok(tt);
    }
}
