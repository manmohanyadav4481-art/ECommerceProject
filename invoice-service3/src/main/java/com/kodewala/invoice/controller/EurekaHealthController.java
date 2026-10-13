package com.kodewala.invoice.controller;

import com.kodewala.invoice.service.EurekaHealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EurekaHealthController {

    private final EurekaHealthService eurekaHealthService;

    public EurekaHealthController(
            EurekaHealthService eurekaHealthService) {
        this.eurekaHealthService = eurekaHealthService;
    }

    @GetMapping("/eureka-status")
    public Map<String, String> getEurekaStatus() {
        return Map.of(
                "eurekaServer",
                eurekaHealthService.checkStatus()
        );
    }
}