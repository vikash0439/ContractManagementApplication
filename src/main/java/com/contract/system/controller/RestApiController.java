package com.contract.system.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RestApiController{
	
	 @GetMapping(value = "/searchService")
	    public String searchService(HttpServletRequest request, @RequestParam("service") String service) {
	    	System.out.print("Service layer : "+service);
	    	String s = "abcdef";
			return s; 	            
	    }

}
