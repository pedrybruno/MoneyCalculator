package moneycalculator.persistence;

import moneycalculator.model.Currency;
import moneycalculator.model.CurrencySet;

public class MockCurrencySetLoader implements CurrencySetLoader{
    
    private static MockCurrencySetLoader instance;

    public MockCurrencySetLoader() {
    }

    public static MockCurrencySetLoader getInstance() {
        if (instance == null)
            instance = new MockCurrencySetLoader();
        return instance;
    }

    @Override
    public void load() {
        CurrencySet.getInstance().add(new Currency ("EUR", "Euro" , "€"));
    }
    
    
    
}
