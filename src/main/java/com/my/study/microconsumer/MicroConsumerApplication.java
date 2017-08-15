package com.my.study.microconsumer;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MicroConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroConsumerApplication.class, args);
	}
}