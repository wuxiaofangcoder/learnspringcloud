package com.example.eurekafeignclient;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "eureka-client",configuration = Fe)
public interface EurekaClientFeign {
}
