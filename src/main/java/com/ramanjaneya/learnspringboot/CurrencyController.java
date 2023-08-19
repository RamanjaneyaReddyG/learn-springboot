package com.ramanjaneya.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

	@Autowired
	private CurrencyServiceConfiguration currency_service;
	
	@RequestMapping("/currency-service")
	public CurrencyServiceConfiguration retrieveAllCurrencyConfiguration()
	{
		return currency_service;
	}
}
