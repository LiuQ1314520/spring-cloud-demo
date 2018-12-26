package com.uaf.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class SchedualServiceHiHystric implements  SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry "+name;
    }
}