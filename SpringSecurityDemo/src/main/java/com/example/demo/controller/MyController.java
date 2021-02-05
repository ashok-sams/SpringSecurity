package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/hello1")
	@ResponseBody
	public String demo()
	{
		return "Hello i m ashok";
	}
}
