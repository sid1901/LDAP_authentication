package com.opencodez.adldapdemo.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TppBlockController {

	//@Autowired
	//private TppBlockService accountBalanceService;

	@RequestMapping(value = "/tpp/{tppId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void retrieveAccountBalance(@PathVariable("tppId") String tppId){
		System.out.println("In Controller...");
	}
}
