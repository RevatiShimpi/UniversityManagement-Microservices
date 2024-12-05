package com.TimeTable_Service.ttservice.services;

import com.TimeTable_Service.ttservice.entities.TimeTable;

import java.util.List;

public interface TTService {

    List<TimeTable> Findbyday(String day);
}
