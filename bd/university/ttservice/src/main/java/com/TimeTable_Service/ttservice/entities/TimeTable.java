package com.TimeTable_Service.ttservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="timetable")
public class TimeTable {
    @Id
    int id;
    String courseName;
    int stime;
    int endtime;
    String insName;
    String day;
}
