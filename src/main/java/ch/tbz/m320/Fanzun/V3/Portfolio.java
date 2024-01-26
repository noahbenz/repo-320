package ch.tbz.m320.Fanzun.V3;

import java.util.List;

public class Portfolio {
    private List<Stock> stocks;
    private StockExchange stockExchange;

    public Portfolio(List<Stock> stocks, StockExchange stockExchange) {
        this.stocks = stocks;
        this.stockExchange = stockExchange;
    }

    public void printStockValuesCHF() {
        for (Stock stock : stocks) {
            double price = stockExchange.getStockPrice(stock.getSymbol());
            System.out.println("Stock: " + stock.getSymbol() + ", Price in CHF: " + price);
        }
    }

    public void printStockValuesUSD() {
        for (Stock stock : stocks) {
            double price = stockExchange.getStockPrice(stock.getSymbol());
            System.out.println("Stock: " + stock.getSymbol() + ", Price in USD: " + price);
        }
    }
}
