package com.example.MyDocuments;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.MyDocuments.service.SearchEngine;

@Configuration
public class TestConfiguration {
	
	@Bean
	SearchEngine getEngine() {
		return new StaticSearchEngine();
	}
}
