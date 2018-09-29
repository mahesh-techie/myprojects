package com.mytutorial.controller;

import java.math.BigDecimal;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mytutorial.model.Account;

@RestController
@RequestMapping("/v1/forecasting")
public class AccountController {
	
	@RequestMapping(value="/accounts", 
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Account[] getAccounts() {
		Account[] accounts = new Account[] {
				new Account("1", "John", BigDecimal.valueOf(1001)),
				new Account("2", "Jane", BigDecimal.valueOf(1002))
		};
		
		return accounts;
	}

}
