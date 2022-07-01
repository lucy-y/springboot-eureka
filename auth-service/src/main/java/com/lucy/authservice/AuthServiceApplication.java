package com.lucy.authservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}

	@GetMapping("/info")
	public String info(@Value("${server.port}") String port) {
		return "Auth 서비스 Port: [" + port + "]";
	}

	@GetMapping("/config")
	public String config(@Value("${message.owner}") String messageOwner,
						 @Value("${message.content}") String messageContent) {
		return "Configuration File's Message Owner: " + messageOwner + "\n"
				+ "Configuration File's Message Content: " + messageContent;
	}
}
