package ch.tbz.m320.Fanzun.V3;

public class ZurichStockExchange implements StockExchange {
    @Override
    public double getStockPrice(String stockSymbol) {
        switch (stockSymbol) {
            case "Microsoft":
                return 120.0;
            case "Google":
                return 80.0;
            case "Apple":
                return 150.0;
            case "Amazon":
                return 200.0;
            default:
                return 0.0;
        }
    }
}


