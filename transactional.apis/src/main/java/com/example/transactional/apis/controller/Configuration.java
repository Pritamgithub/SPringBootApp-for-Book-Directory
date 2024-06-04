package com.example.transactional.apis.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

public class Configuration {
	@Bean
	public WebClient webClient() {
		return WebClient.builder().baseUrl("addressBaseUrl").build();
	}
}
