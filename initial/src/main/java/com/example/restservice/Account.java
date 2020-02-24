package com.example.restservice;

import java.util.Currency;

import org.joda.money.Money;

public class Account {
	String name;
	Currency currency;
	Money balance;
	Boolean treasury;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Money getBalance() {
		return balance;
	}
	public void setBalance(Money balance) {
		this.balance = balance;
	}
	public Boolean getTreasury() {
		return treasury;
	}
	public void setTreasury(Boolean treasury) {
		this.treasury = treasury;
	}
	
	
	//constructor
	public Account(String name, 	Currency currency,  Money balance, 	Boolean treasury ) {
		this.name = name;
		this.currency = currency;
		this.balance = balance;
		this.treasury = true;
	}

	
}
