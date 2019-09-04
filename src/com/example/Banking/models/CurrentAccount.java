package com.example.Banking.models;

import com.example.Banking.common.Account;

public class CurrentAccount implements Account {

	@Override
	public String createAccount() {
		// TODO Auto-generated method stub
		return "Current Account created";
	}
	
	@Override
	public String getCardDetails() {
		return null;
	}

}
