package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class ResourceConroller
{
	@Autowired
	private Service1 service1;
	
	@RequestMapping("/get")
	public String returnString()
	{
		return service1.returnString();
	}

	@RequestMapping("/data")
	public void getData()
	{
		service1.getData();
	}
}
