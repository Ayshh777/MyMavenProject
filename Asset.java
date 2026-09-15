package com.portfolio.app.model;

public class Asset {
	    private String assetId;
	    private String assetName;
	    private double purchasePrice;

	    // Constructor
	    public Asset(String assetId, String assetName, double purchasePrice) {

	        this.assetId = assetId;
	        this.assetName = assetName;
	        this.purchasePrice = purchasePrice;
	    
		}

		public String getAssetId() {
	        return assetId;
	    }

	    public String getAssetName() {
	        return assetName;
	    }

	    public double getPurchasePrice() {
	        return purchasePrice;
	    }

		public void display() {
			System.out.println("Asset ID:" + assetId);
			System.out.println("Asset Name:" + assetName);
			System.out.println("Purchase Price:" + purchasePrice);
		}

	    
	
	
		

	}
