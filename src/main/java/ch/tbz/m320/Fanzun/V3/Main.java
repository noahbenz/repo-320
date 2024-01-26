package ch.tbz.m320.Fanzun.V3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Task a
        StockExchange nyStockExchange = new NYStockExchange();
        StockExchange zurichStockExchange = new ZurichStockExchange();

        List<Stock> stocksTaskA = Arrays.asList(new Stock("Microsoft"), new Stock("Google"));
        Portfolio nyStock = new Portfolio(stocksTaskA, nyStockExchange);
        Portfolio zhStock = new Portfolio(stocksTaskA, zurichStockExchange);
        nyStock.printStockValuesUSD();
        zhStock.printStockValuesCHF();

        System.out.println("------------------------------------------------");

        // Task b
        List<Stock> stocksTaskB = Arrays.asList(new Stock("Microsoft"), new Stock("Google"), new Stock("Apple"), new Stock("Amazon"));
        Portfolio usdStock = new Portfolio(stocksTaskB, nyStockExchange);
        Portfolio chfStock = new Portfolio(stocksTaskB, zurichStockExchange);
        System.out.println("----------------------Stocks in USD----------------------");
        usdStock.printStockValuesUSD();
        System.out.println("----------------------Stocks in CHF----------------------");
        chfStock.printStockValuesCHF();
    }
}
