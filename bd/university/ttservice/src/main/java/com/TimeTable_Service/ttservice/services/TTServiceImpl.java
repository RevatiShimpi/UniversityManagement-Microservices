package com.TimeTable_Service.ttservice.services;

import com.TimeTable_Service.ttservice.entities.TimeTable;
import com.TimeTable_Service.ttservice.repository.TTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TTServiceImpl {
    @Autowired
    private TTRepository ttrepo;

    private List<TimeTable> Findbyday(String d){
        return ttrepo.Findbyday(d);
    }


}
