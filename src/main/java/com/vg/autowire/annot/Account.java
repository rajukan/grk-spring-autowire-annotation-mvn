package com.vg.autowire.annot;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	public Account() {
		System.out.println(" Inside Account constructor");
	}
	
	public void checkBalance() {
		System.out.println(" Inside check Balance ");
	}

}
