package moneycalculator.ui;

import moneycalculator.model.Money;

public interface MoneyViewer {
    
    public Money getMoney();
    
    public void setMoney(Money money);
    
    public void show();
    
}
