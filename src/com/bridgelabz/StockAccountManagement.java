package com.bridgelabz;
import java.util.Scanner;
import java.util.ArrayList;


public class StockAccountManagement {

    static int Num_of_Stocks;
    static ArrayList<Stock> stocksArray = new ArrayList<Stock>();

    public static void stock_portfolio() {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<Num_of_Stocks; i++)
        {
            System.out.println("Stock " +(++i));
            System.out.println("Please enter the share name: ");
            String Share_Name = sc.next();

            System.out.println("Please enter the number of shares to be brought of the selected stock: ");
            int Num_of_Shares = sc.nextInt();

            System.out.println("Please enter the price of the shares to be brought: ");
            int Share_Price = sc.nextInt();

            Stock stock_obj = new Stock(Share_Name, Num_of_Shares, Share_Price);
            //stock_obj.stock_value();
            //stock_obj.all_stocks_value();
            stocksArray.add(stock_obj);
        }
        System.out.println(stocksArray);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of stocks to buy: ");
        Num_of_Stocks = sc.nextInt();

        stock_portfolio();

    }
}
