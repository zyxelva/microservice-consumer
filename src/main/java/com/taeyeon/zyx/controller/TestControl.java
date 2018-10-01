package com.taeyeon.zyx.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taeyeon.zyx.api.TestApi;

@Api(tags = "老师信息-zyx")
@RestController
public class TestControl implements TestApi {

	@Override
	@RequestMapping("/testHello/{name}")
	public String testHello(@PathVariable("name")String name) {
		return "Hello world,"+name;
	}

}
