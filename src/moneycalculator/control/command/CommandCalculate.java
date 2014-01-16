package moneycalculator.control.command;

import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Money;
import moneycalculator.model.MoneyExchanger;
import moneycalculator.persistence.DBExchangeRateLoader;
import moneycalculator.ui.CurrencyDialog;
import moneycalculator.ui.MoneyDialog;
import moneycalculator.ui.MoneyViewer;
import moneycalculator.ui.swing.DatePanel;

public class CommandCalculate extends Command {

    private final MoneyViewer moneyViewer;
    private final MoneyDialog moneyDialog;
    private final CurrencyDialog currencyDialog;
    private final DatePanel dateDialog;

    public CommandCalculate(MoneyViewer moneyViewer, MoneyDialog moneyDialog, CurrencyDialog currencyDialog, DatePanel dateDialog) {
        this.moneyViewer = moneyViewer;
        this.moneyDialog = moneyDialog;
        this.currencyDialog = currencyDialog;
        this.dateDialog = dateDialog;
    }
    
    @Override
    public void execute() {
        try{
            Money money = moneyDialog.getMoney();
            Currency currency = currencyDialog.getCurrency();
            ExchangeRate exchangeRate = DBExchangeRateLoader.getInstance().load(money.getCurrency(), currency);
            moneyViewer.setMoney(MoneyExchanger.exchange(money, exchangeRate));
            moneyViewer.show();
        }
        catch (Exception e){
        }
    }

}
