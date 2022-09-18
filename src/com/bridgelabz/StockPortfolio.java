/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 * I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of
Share, and Share Price
c. Logic -> Calculate the value of each stock and the total value
d. O/P -> Print the Stock Report.
 */
public class StockPortfolio extends StocksMain {
	
	
	 int reliance;
	 int tatamotors;
	 int tesla;
	
	public void tataMotors() {
		STOCK_NAME = "TATA MOTORS";
		NO_OF_SHARE = 100;
		SHARE_PRICE = 300;
		tatamotors = NO_OF_SHARE * SHARE_PRICE;
		System.out.println("The stock value of TATA MOTORS is: " + tatamotors);
	}
	
	public void Reliance( ) {
		STOCK_NAME = "Reliance";
		NO_OF_SHARE = 200;
		SHARE_PRICE = 2000;
		reliance = NO_OF_SHARE * SHARE_PRICE;
		System.out.println("The stock value of Reliance is: " + reliance);
	}
	
	public void Tesla() {
		STOCK_NAME = "Tesla";
		NO_OF_SHARE = 50;
		SHARE_PRICE = 3000;
		tesla = NO_OF_SHARE * SHARE_PRICE;
		System.out.println("The stock value of Tesla is: " + tesla);
	}
	
	public void totalValueStockReport() {
		TOTAL_VALUE_OF_STOCK = tatamotors + reliance + tesla;
		System.out.println("The total value of stocks are: " + TOTAL_VALUE_OF_STOCK);
	}
}
