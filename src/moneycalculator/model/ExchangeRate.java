package moneycalculator.model;

import java.util.Date;

public class ExchangeRate {

    private Date date;
    private Number rate;
    private Currency fromCurrency, toCurrency;

    public ExchangeRate(Date date, Number rate, Currency fromCurrency, Currency toCurrency) {
        this.date = date;
        this.rate = rate;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public Date getDate() {
        return date;
    }

    public Number getRate() {
        return rate;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }
}
