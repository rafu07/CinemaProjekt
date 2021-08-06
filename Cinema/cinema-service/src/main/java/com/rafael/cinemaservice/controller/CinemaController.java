package com.rafael.cinemaservice.controller;

import com.rafael.cinemaservice.CinemaServiceApplication;
import com.rafael.cinemaservice.VO.ResponseTemplateVO;
import com.rafael.cinemaservice.entity.Cinema;
import com.rafael.cinemaservice.service.CinemaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cinemas")
@Slf4j
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;


    @PostMapping("/")
    private Cinema saveCinema(@RequestBody Cinema cinema){
      log.info("inside saveCinema of CinemaController");
        return  cinemaService.saveCinema(cinema);
    }


    @GetMapping("/{id}")
public ResponseTemplateVO getEmployeeWithCinema(@PathVariable("id") Long cinemaId){
        log.info("inside getEmployeeWithCinema of CinemaController");
        return  cinemaService.getEmployeeWithCinema(cinemaId);
}


}
