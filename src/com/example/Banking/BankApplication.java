package com.example.Banking;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.Banking.common.Account;

public class BankApplication {
	public static void main(String [] args) {
		System.out.println("Hello Spring!!");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Account account = context.getBean("myAccount", Account.class);
		System.out.println(account.createAccount());
		System.out.println(account.getCardDetails());
		
		context.close();
		
	}
}
