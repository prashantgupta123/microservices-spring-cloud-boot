package com.springcloud.zipkindistributedtracingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZipkinDistributedTracingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinDistributedTracingServerApplication.class, args);
    }
}
