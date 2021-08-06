package com.rafael.cinemaservice.VO;

import com.rafael.cinemaservice.entity.Cinema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private Cinema cinema;
    @ElementCollection
    private List<Employee> employee;




}
