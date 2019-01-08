package com.example.externalconfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "app")
public class AppConfig {
	private String name;
	private MyProperty myProperty = new MyProperty();
	
	@Data
	@NoArgsConstructor
	public class MyProperty {
		private String ipAddress;
		private int port;
	}
}
