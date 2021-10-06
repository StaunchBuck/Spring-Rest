package com.tech.spring.rest.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	@GetMapping(path="/hello-world")
	public String getHelloWorld() {
		return "Hello World2";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean getHelloWorldBean() {
		return new HelloWorldBean("Hello World3"); //if you dont have getter for message then it would show error when you hit this endpoint
	}
	
	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public HelloWorldBean getHelloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World %s", name)); 
	}
}
