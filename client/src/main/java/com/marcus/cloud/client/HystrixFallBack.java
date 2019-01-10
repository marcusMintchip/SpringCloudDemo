package com.marcus.cloud.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@EnableTurbine
public class HystrixFallBack {

    @HystrixCommand(fallbackMethod = "defaultAfterFall")
    public Object fallback() {
        return 1 / 0;
    }

    public Object defaultAfterFall() {
        return "String";
    }
}
