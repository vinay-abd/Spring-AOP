package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Service1 
{
	public String returnString()
	{
		return "application returning this as a string....";
	}
	
	public void getData()
	{
		System.out.println("you are getting data.....");
	}
}
