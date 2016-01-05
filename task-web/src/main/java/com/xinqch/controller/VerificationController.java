package com.xinqch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("valid")
public class VerificationController{
	
	@RequestMapping("index")
	public String validIndex(){
		
		return "";
	}
	
}