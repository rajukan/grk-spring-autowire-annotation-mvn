package com.vg.autowire.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public  class Investor {
	//Investor HAS A account
	//Autowire field with public getter and setter methods
	@Autowired
	private Account acnt; //Autowire is default byType

	
	public void checkAccountBalance() {
		acnt.checkBalance();
	}
	
	public Account getAcnt() {
		return acnt;
	}
	public void setAcnt(Account account) {
		System.out.println(" inject account in investor class ");
		this.acnt = account;
	}

}
