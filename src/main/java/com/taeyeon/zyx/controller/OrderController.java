package com.taeyeon.zyx.controller;

import com.taeyeon.zyx.dto.TbClientReportDto;
import com.taeyeon.zyx.feign.FeignController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


/**
 * 订单微服务
 * @author roy
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController {

	private final Logger logger = LoggerFactory.getLogger(OrderController.class);


	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private FeignController feignController;

	@Value("${user.url}")
	private String remoteURL;

	@GetMapping("/testHello/{name}")
	public String testHello(@PathVariable("name")String name) {
		return "Hello world,"+name;
	}

	@GetMapping("/user/getReportById")
	public TbClientReportDto getReportById(@RequestParam("id") Long id){
		System.out.println("================this is one=====================");
		String url = remoteURL+"getReportById/" + id;
		TbClientReportDto tbClientReportDto = restTemplate.getForObject(url, TbClientReportDto.class);
		return tbClientReportDto;
	}

	@GetMapping("/user/getReportById2")
	public ResponseEntity<TbClientReportDto> getReportById2(@RequestParam("id") Long id){
		System.out.println("================this is two=====================");
		String url = remoteURL+"getReportById2/" + id;
		ResponseEntity<TbClientReportDto> tbClientReportDto = restTemplate.getForEntity(url, TbClientReportDto.class);
		return tbClientReportDto;
	}

	@GetMapping("/user/getReportByIdWithFeign")
	public TbClientReportDto getReportByIdWithFeign(@RequestParam("id") Long id){
		System.out.println("================this is getReportByIdWithFeign=====================");
//		String url = remoteURL+"getReportById/" + id;
		TbClientReportDto tbClientReportDto = feignController.getReportById(id);
		return tbClientReportDto;
	}

}
