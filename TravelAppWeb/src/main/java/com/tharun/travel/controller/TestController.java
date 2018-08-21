package com.tharun.travel.controller;

import com.tharun.travel.service.TestServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = "com.tharun.travel")
@RequestMapping(value = "/test", produces = "application/json")
public class TestController {

    @Autowired
    TestServiceClass testServiceClass;

    @RequestMapping(value = "/method", method = RequestMethod.GET)
    public String testMethod() {
        return "Spring Working! " + testServiceClass.getData();
    }
}
