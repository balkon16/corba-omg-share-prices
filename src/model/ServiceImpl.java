package model;

import DataInitializer.DataInitializer;
import StockExchangeService.StockPrice;
import StockExchangeService._ServiceImplBase;
import org.omg.CORBA.ORB;

import java.util.HashMap;

public class ServiceImpl extends _ServiceImplBase {
    private ORB orb;
    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    HashMap<String, StockPrice[]> stockData = DataInitializer.initializeData();

    @Override
    public String[] getAvailableStockExchanges() {
        return stockData.keySet().toArray(new String[0]);
    }

    @Override
    public StockPrice getLastQuotation(String ticker, String stockExchange) {
        // TODO: zaimplementować odpowiednią wersję
        return null;
    }

    @Override
    public boolean addNewQuotation(StockPrice stockPrice, String stockExchange) {
        // TODO: zaimplementować odpowiednią wersję
        return false;
    }

    @Override
    public boolean addNewStockExchange(String stockExchange) {
        // TODO: zaimplementować odpowiednią wersję
        return false;
    }
}
