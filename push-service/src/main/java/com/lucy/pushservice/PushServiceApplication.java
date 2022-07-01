package com.lucy.pushservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class PushServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushServiceApplication.class, args);
	}

	@GetMapping("/info")
	public String info(@Value("${server.port}") String port) {
		return "Push 서비스 Port: [" + port + "]";
	}

}
