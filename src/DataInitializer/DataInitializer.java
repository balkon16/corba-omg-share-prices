package DataInitializer;

import StockExchangeService.StockPrice;
import model.StockPriceImpl;

import java.util.HashMap;

public class DataInitializer {

    public DataInitializer() {}

    private static final HashMap<String, StockPrice[]> stockExchangeData = new HashMap();

    public static HashMap<String, StockPrice[]> initializeData(){

        StockPrice sp1 = new StockPriceImpl("CCC", 120.12, "PLN", 1622713390, "WSE");
        StockPrice sp2 = new StockPriceImpl("PZU", 51.18, "PLN", 1622713390, "WSE");
        stockExchangeData.put("WSE", new StockPrice[]{sp1, sp2});

        StockPrice sp3 = new StockPriceImpl("TSL", 520.99, "USD", 1622713390, "NYSE");
        StockPrice sp4 = new StockPriceImpl("AAPL", 600.91, "USD", 1622713390, "NYSE");
        stockExchangeData.put("NYSE", new StockPrice[]{sp3, sp4});

        return stockExchangeData;
    }
}
