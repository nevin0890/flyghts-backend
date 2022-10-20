package com.nestdigital.flyghtbackend.controller;

import com.nestdigital.flyghtbackend.Model.FlightModel;
import com.nestdigital.flyghtbackend.dao.FlightDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightDao Dao;

   @CrossOrigin(origins = "*")
   @PostMapping(path = "/flightEntry",consumes = "application/json", produces = "application/json")
    public String flightEntry(@RequestBody FlightModel flight) {
        System.out.println(flight.toString());
        Dao.save(flight);
        return "{status:'success'}";

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewflyghts")
    public List<FlightModel> viewFlights(){
        return (List<FlightModel>) Dao.findAll();
    }

}
