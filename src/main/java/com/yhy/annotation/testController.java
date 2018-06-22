package com.yhy.annotation;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class testController {
	
	@RequestMapping("/hello")
	public String helloWord() {
		return "hello word";
	}
	
	@RequestMapping("/hello/{myContent}")
	public String helloContent(@PathVariable("myContent") String content) {
		return content;
	}
}
