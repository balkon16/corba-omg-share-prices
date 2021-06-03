package model;

import DataInitializer.DataInitializer;
import StockExchangeService.StockPrice;
import StockExchangeService._ServiceImplBase;
import org.omg.CORBA.ORB;

import java.util.*;

public class ServiceImpl extends _ServiceImplBase {

    private ORB orb;

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    HashMap<String, StockPrice[]> stockData = DataInitializer.initializeData();

    @Override
    public String getAvailableStockExchanges() {
        return stockData.keySet().toString();
    }

    @Override
    public StockPrice getLastQuotationByTickerAndStockExchange(String ticker, String stockExchange) {
        if (stockData.containsKey(stockExchange)) {
            StockPrice[] stockPricesByExchange = stockData.get(stockExchange);
            List<StockPrice> stocks = Arrays.asList(stockPricesByExchange);
            return stocks
                    .stream()
                    .filter(s -> s.ticker().equals(ticker))
                    .max(Comparator.comparing(StockPrice::measurementDateTime))
                    .orElse(null);
        } else {
            return null;
        }
    }

    @Override
    public boolean addNewQuotation(StockPrice stockPrice, String stockExchange) {
        if (stockData.containsKey(stockExchange)) {
            StockPrice[] stockPrices = stockData.get(stockExchange);
            ArrayList<StockPrice> stockPriceArrayList = new ArrayList<StockPrice>(Arrays.asList(stockPrices));
            stockPriceArrayList.add(stockPrice);
            stockData.put(stockExchange, stockPriceArrayList.toArray(stockPrices));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean addNewStockExchange(String stockExchange) {
        stockData.putIfAbsent(stockExchange, new StockPrice[]{});
        return true;
    }
}
