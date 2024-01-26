package ch.tbz.m320.Fanzun.V3;

public class NYStockExchange implements StockExchange {
    @Override
    public double getStockPrice(String stockSymbol) {
        switch (stockSymbol) {
            case "Microsoft":
                return 100.0;
            case "Google":
                return 70.0;
            case "Apple":
                return 130.0;
            case "Amazon":
                return 180.0;
            default:
                return 0.0;
        }
    }
}

