package com.example.voronina;


import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetricsService {

    private final Counter helloCounter;

    @Autowired
    public MetricsService(MeterRegistry meterRegistry) {
        this.helloCounter = meterRegistry.counter("myapp.hello.requests");
    }

    public void incrementHelloCounter() {
        helloCounter.increment();
    }
}
