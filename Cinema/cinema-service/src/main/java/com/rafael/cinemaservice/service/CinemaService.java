package com.rafael.cinemaservice.service;


import com.rafael.cinemaservice.VO.Employee;
import com.rafael.cinemaservice.VO.ResponseTemplateVO;
import com.rafael.cinemaservice.entity.Cinema;
import com.rafael.cinemaservice.repository.CinemaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Slf4j
public class CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Cinema saveCinema(Cinema cinema) {
        log.info("inside saveCinema of CinemaService");
    return  cinemaRepository.save(cinema);
    }

    public ResponseTemplateVO getEmployeeWithCinema(Long cinemaId) {
        log.info("inside getEmployeeWithCinema of CinemaService");
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        Cinema cinema = cinemaRepository.findByCinemaId(cinemaId);
        Iterator<Long> idIterator = cinema.getEmployeeList().iterator();
        List<Employee> employeeList = new ArrayList<>();
        while(idIterator.hasNext()){
            Long currentId = idIterator.next();
            employeeList.add(restTemplate.getForObject("http://EMPLOYEE-SERVICE/employees/" + currentId,Employee.class ));
        }

        responseTemplateVO.setEmployee(employeeList);
        responseTemplateVO.setCinema(cinema);

    return responseTemplateVO;
    }
}
