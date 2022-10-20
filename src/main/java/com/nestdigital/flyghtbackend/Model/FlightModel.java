package com.nestdigital.flyghtbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flights")
public class FlightModel {

    @Id
    @GeneratedValue

    private int id;

    public FlightModel(int id, String flightName, String origin, int capacity) {
        this.id = id;
        this.flightName = flightName;
        this.origin = origin;
        this.capacity = capacity;
    }

    private String flightName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public FlightModel() {
    }

    private String origin;
    private int capacity;
}

