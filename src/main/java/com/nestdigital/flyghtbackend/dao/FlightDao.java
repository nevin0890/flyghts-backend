package com.nestdigital.flyghtbackend.dao;

import com.nestdigital.flyghtbackend.Model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {

}

