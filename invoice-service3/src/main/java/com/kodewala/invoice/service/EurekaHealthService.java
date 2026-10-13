package com.kodewala.invoice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class EurekaHealthService {

    private final RestClient restClient;

    public EurekaHealthService(
            @Value("${eureka.client.service-url.defaultZone}")
            String eurekaUrl) {

        this.restClient = RestClient.builder()
                .baseUrl(eurekaUrl.replaceAll("/+$", ""))
                .build();
    }

    public String checkStatus() {
        try {
            restClient.get()
                    .uri("/apps")
                    .retrieve()
                    .toBodilessEntity();

            return "UP";
        } catch (Exception exception) {
            return "DOWN";
        }
    }
}