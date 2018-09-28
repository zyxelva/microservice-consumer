package com.taeyeon.zyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumer {
	public static void main(String[] args) {
		System.out.println("++++++++++++++++++++++EurekaConsumer Start+++++++++++++++++++++++++");
		SpringApplication.run(EurekaConsumer.class, args);
		System.out.println("======================EurekaConsumer Start is Done=========================");
	}
}
