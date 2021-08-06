package com.rafael.cinemaservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cinemaId;
    private String cinemaName;
    @ElementCollection
    List<Long> employeeList;



}
