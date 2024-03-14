package com.example.voronina.controller;


import com.example.voronina.MetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private final MetricsService metricsService;

    @Autowired
    public AppController(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    @GetMapping("/hello")
    public String hello() {
        metricsService.incrementHelloCounter();
        return "Hello World!";
    }
}
