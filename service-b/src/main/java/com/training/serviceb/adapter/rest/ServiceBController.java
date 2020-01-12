package com.training.serviceb.adapter.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/call-other")
public class ServiceBController {
	private final RestTemplate restTemplate;

	public ServiceBController(RestTemplate restTemplate) {

		this.restTemplate = restTemplate;
	}

	@GetMapping
	public String greeting() {
		return restTemplate.getForObject("http://service-a/greeting", String.class);
	}

}
