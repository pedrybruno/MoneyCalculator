package moneycalculator.ui.console;

import moneycalculator.model.Money;
import moneycalculator.ui.MoneyViewer;

public class ConsoleMoneyViewer implements MoneyViewer {
    
    private Money money;

    public ConsoleMoneyViewer() {
    }

    public ConsoleMoneyViewer(Money money) {
        this.money = money;
    }

    @Override
    public Money getMoney() {
        return money;
    }

    @Override
    public void setMoney(Money money) {
        this.money = money;
    }

    @Override
    public void show() {
        System.out.println(money);
    }
    
    

}
