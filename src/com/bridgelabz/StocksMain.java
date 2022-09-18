/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 * 
 * a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
Print a Stock Report with the total value of each Stock and the total value of
Stock.
b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of
Share, and Share Price
c. Logic -> Calculate the value of each stock and the total value
d. O/P -> Print the Stock Report.
e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read
from the input file. Have functions in the Class to calculate the value of each
stock and the value of total stocks.
 *
 */
public class StocksMain {

	/**
	 * @param args
	 */
	
	public static String STOCK_NAME;
	public static int NO_OF_SHARE;
	public static int SHARE_PRICE;
	public static int TOTAL_VALUE_OF_STOCK;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("---------------");
		Stock stockList = new Stock();
		stockList.displayList();
		System.out.println("---------------");
		StockPortfolio stockReport = new StockPortfolio();
		stockReport.tataMotors();
		stockReport.Reliance();
		stockReport.Tesla();
		
		System.out.println("---------------");
		stockReport.totalValueStockReport();
		
	}

}
