package com.example.externalconfig;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ExternalConfigApplication {
	
	@Autowired
	Environment env;

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(ExternalConfigApplication.class, args)) {
			ExternalConfigApplication app = ctx.getBean(ExternalConfigApplication.class);
			app.printProperties();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void printProperties() {
		System.out.println("-------------------------------------------");
		String[] profiles = env.getActiveProfiles();
		if (!ArrayUtils.isEmpty(profiles)) {
			System.out.println("active profiles : " + Arrays.stream(profiles).collect(Collectors.joining(",")));
			System.out.println("spring.datasource.url : " + env.getProperty("spring.datasource.url"));
			System.out.println("spring.datasource.driverClassName : " + env.getProperty("spring.datasource.driverClassName"));
			System.out.println("spring.datasource.tomcat.max-age : " + env.getProperty("spring.datasource.tomcat.max-age"));
		}
		System.out.println("spring.jpa.properties.hibernate.show_sql : " + env.getProperty("spring.jpa.properties.hibernate.show_sql"));
		System.out.println("-------------------------------------------");
	}

}
