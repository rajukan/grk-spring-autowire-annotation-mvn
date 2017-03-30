package com.vg.autowire.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public  class Client {
	
	public void byConstructor() {
		ApplicationContext ctx =new ClassPathXmlApplicationContext( 
				"investor_annot.xml");
		
		Investor inv = (Investor) ctx.getBean("investor");
		inv.checkAccountBalance();
	}

	public static void main(String[] args) {

		Client clt = new Client();
		clt.byConstructor();
		
	}
}
