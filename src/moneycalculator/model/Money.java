package moneycalculator.model;

public class Money {
    
    Number amount;
    Currency currency;

    public Money(Number amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Number getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return (getAmount().toString() + getCurrency().getCode());
    }
}
