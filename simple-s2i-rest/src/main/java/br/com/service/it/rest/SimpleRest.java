package br.com.service.it.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRest {

	@GetMapping("/api/whereami")
	public String whereami() {
		return String.format("Hello from %s", System.getenv().getOrDefault("HOSTNAME", "localhost"));
	}
}
