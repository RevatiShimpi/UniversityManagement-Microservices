package com.TimeTable_Service.ttservice.repository;

import com.TimeTable_Service.ttservice.entities.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TTRepository  extends JpaRepository<TimeTable,Long> {
    List<TimeTable> Findbyday(String day);
}
