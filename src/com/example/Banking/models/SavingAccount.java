package com.example.Banking.models;

import com.example.Banking.common.Account;
import com.example.Banking.common.Card;

public class SavingAccount implements Account {
	
	private Card card;
	
	public void setDebitCard(Card card) {
		this.card = card;
	}
	
	@Override
	public String createAccount() {
		// TODO Auto-generated method stub
		return "Saving Account created";
	}
	
	@Override
	public String getCardDetails() {
		return this.card.getCardDetails();
	}

}
