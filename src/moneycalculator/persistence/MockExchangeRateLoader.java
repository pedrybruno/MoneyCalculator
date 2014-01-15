package moneycalculator.persistence;

import java.util.Date;
import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Number;

public class MockExchangeRateLoader implements ExchangeRateLoader{

    private static MockExchangeRateLoader instance;

    public MockExchangeRateLoader() {
    }

    public static MockExchangeRateLoader getInstance() {
        if(instance == null)
            instance = new MockExchangeRateLoader();
        return instance;
    }
    
    @Override
    public ExchangeRate load(Currency fromCurrency, Currency toCurrency) {
        return load(new Date(), fromCurrency, toCurrency);
    }

    @Override
    public ExchangeRate load(Date date, Currency fromCurrency, Currency toCurrency) {
        return new ExchangeRate(date, new Number(2.5), fromCurrency, toCurrency);
    }

}
