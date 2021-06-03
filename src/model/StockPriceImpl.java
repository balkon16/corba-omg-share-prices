package model;

import StockExchangeService._StockPriceImplBase;

public class StockPriceImpl extends _StockPriceImplBase {

    private String ticker;
    private Double price;
    private String currency;
    private int measurementDateTime;
    private String stockExchange;

    public StockPriceImpl(String ticker, Double price, String currency, int measurementDateTime, String stockExchange) {
        this.ticker = ticker;
        this.price = price;
        this.currency = currency;
        this.measurementDateTime = measurementDateTime;
        this.stockExchange = stockExchange;
    }

    @Override
    public String ticker() {
        return this.ticker;
    }

    @Override
    public void ticker(String newTicker) {
        this.ticker = newTicker;
    }

    @Override
    public double price() {
        return this.price;
    }

    @Override
    public void price(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public String currency() {
        return this.currency;
    }

    @Override
    public void currency(String newCurrency) {
        this.currency = newCurrency;
    }

    @Override
    public int measurementDateTime() {
        return this.measurementDateTime;
    }

    @Override
    public void measurementDateTime(int newMeasurementDateTime) {
        this.measurementDateTime = newMeasurementDateTime;
    }

    @Override
    public String stockExchange() {
        return this.stockExchange;
    }

    @Override
    public void stockExchange(String newStockExchange) {
        this.stockExchange = newStockExchange;
    }


}
