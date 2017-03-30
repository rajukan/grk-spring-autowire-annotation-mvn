package com.vg.autowire.annotate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public  class Fund {
	
	//Every fund belongs to a AssetClass
	private Asset asset; 

	//Autowire at constructor and avoid public getter and setter methods
	@Autowired
	public Fund(Asset asset) {
		this.asset=asset;
	}
	
	public void checkAssetType() {
		asset.checkAssetType();
	}
	

}
