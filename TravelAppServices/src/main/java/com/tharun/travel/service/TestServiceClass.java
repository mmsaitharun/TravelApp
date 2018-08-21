package com.tharun.travel.service;

import org.springframework.stereotype.Repository;

@Repository
public class TestServiceClass {

    public String getData() {
        return "Data from Service";
    }
}
