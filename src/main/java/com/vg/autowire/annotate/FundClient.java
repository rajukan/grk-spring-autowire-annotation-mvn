package com.vg.autowire.annotate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public  class FundClient {
	
	public void byConstructor() {
		ApplicationContext ctx =new ClassPathXmlApplicationContext( 
				"asset_annot.xml");
		
		Fund f = (Fund) ctx.getBean("fund");
		f.checkAssetType();
	}

	public static void main(String[] args) {

		FundClient clt = new FundClient();
		clt.byConstructor();
		
	}
}
