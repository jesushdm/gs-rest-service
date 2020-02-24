package com.example.restservice;

import java.util.Currency;
import java.util.concurrent.atomic.AtomicLong;

import org.joda.money.Money;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@RequestMapping("/account/create")
	public Account account(  @RequestParam(value = "name", defaultValue = "technest") String name,
							    @RequestParam(value = "currency", defaultValue = "EUR") Currency currency,
							    @RequestParam(value = "balance", defaultValue = "0")  double balance,
							    @RequestParam(value = "treasury", defaultValue = "false")  Boolean treasury
							) {
		
		Account myAccount = new Account ();
		myAccount.setName(name);
		myAccount.setCurrency(currency);
		myAccount.setBalance(balance);
		myAccount.setTreasury(treasury);		
		
		return    myAccount;
	}
}