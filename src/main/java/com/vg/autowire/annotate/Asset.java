package com.vg.autowire.annotate;

import org.springframework.stereotype.Component;

@Component
public class Asset {

	public Asset() {
		System.out.println(" Inside Asset constructor");
	}
	
	public void checkAssetType() {

		System.out.println(" Asset type MoneyMarket");
	}

}
