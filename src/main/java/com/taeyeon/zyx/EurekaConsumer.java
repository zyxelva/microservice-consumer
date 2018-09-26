package com.taeyeon.zyx;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumer {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaConsumer.class).web(true).run(args);
	}
}
