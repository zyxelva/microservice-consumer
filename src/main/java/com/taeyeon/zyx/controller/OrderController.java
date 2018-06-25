package com.taeyeon.zyx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 订单微服务
 * @author roy
 *
 */
@RestController
//@RequestMapping("/order")
public class OrderController {

	private final Logger logger = LoggerFactory.getLogger(OrderController.class);


	@Autowired
	private RestTemplate restTemplate;

	@Value("${user.url}")
	private String getUserByIdUrl;

	//	@RequestMapping("/user/getById/{userId}")
	//	public Object getUserById(@PathVariable("userId") String userId){
	//		System.out.println("++++++++++++++++++++++++++Hello world,"+userId);
	//		logger.debug("param userId : {}", userId);
	//
	//		//String url = "http://localhost:8089/user/getById?id=" + userId;// 硬编码
	//		String url = getUserByIdUrl + "?id=" + userId;
	//
	//		Object result = restTemplate.getForObject(url, Object.class);
	//		logger.debug("param result : {}", result);
	//
	//		return result;
	//	}

	@RequestMapping("/testG/{name}")
	public String testHello(@PathVariable("name")String name) {
		return "Hello world,"+name;
	}

	@RequestMapping("/user/getById")
	public Object getUserById2(String userId){
		//System.out.println("2222222222222222222Hello world,"+userId);
		logger.debug("param userId : {}", userId);

		//String url = "http://localhost:8089/user/getById?id=" + userId;// 硬编码
		String url = getUserByIdUrl + "?id=" + userId;

		String result = restTemplate.getForObject(url, String.class);
		logger.debug("param result : {}", result);

		return result;
	}

}
