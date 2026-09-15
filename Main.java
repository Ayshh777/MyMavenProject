package com.porfolio.app;

	import com.portfolio.app.model.Asset;

	//import com.portfolioproject.model.Stock;
	import java.util.*;

	public class Main {

	    public static void main(String[] args)
	    {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("=====================================");
	        System.out.println("Stock Portfolio Management Project");
	        System.out.println("=====================================");
	        
	        
	        System.out.println("Enter AssetId");
	        String assetId=sc.nextLine();
	        
	        System.out.println("Enter AssetName");
	        String assetName=sc.nextLine();
	        
	        System.out.println("Enter purchasePrice");
	        double purchasePrice=sc.nextDouble();
	        //Creating the object
	        Asset user=new Asset(assetId,assetName,purchasePrice);
	        user.display();
	        
	    }
	}