package com.certimaster.k8sdemo;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/api/sample")
    public SampleResponse sample() {
        return new SampleResponse(
                "k8s-demo",
                "UP",
                "Sample API is running",
                Instant.now());
    }

    public record SampleResponse(
            String service,
            String status,
            String message,
            Instant timestamp) {
    }
}
