package moneycalculator.model;

public class MoneyExchanger {
    public static Money exchange(Money money, ExchangeRate exchangeRate){
        return new Money(money.getAmount().multiply(exchangeRate.getRate()), exchangeRate.getToCurrency());
    }
}
