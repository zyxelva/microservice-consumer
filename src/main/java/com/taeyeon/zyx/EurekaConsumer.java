package com.taeyeon.zyx;

import com.taeyeon.zyx.filter.ResourceBaseUrlFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ImportResource("classpath:/spring/applicationContext.xml")
public class EurekaConsumer {

	public static void main(String[] args) {
		System.out.println("++++++++++++++++++++++EurekaConsumer Start+++++++++++++++++++++++++");
		SpringApplication.run(EurekaConsumer.class, args);
		System.out.println("======================EurekaConsumer Start is Done=========================");
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
		c.setIgnoreUnresolvablePlaceholders(true);
		return c;
	}

	@Bean
	public FilterRegistrationBean resourceBaseUrlFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new ResourceBaseUrlFilter());
		registration.addUrlPatterns("/*");
		registration.setName("resourceBaseUrlFilter");
		registration.setOrder(2);
		return registration;
	}
}
