package moneycalculator.control;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Money;
import moneycalculator.model.MoneyExchanger;
import moneycalculator.persistence.CurrencySetLoader;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.ui.console.ConsoleCurrencyDialog;
import moneycalculator.ui.console.ConsoleDateDialog;
import moneycalculator.ui.console.ConsoleMoneyDialog;
import moneycalculator.ui.console.ConsoleMoneyViewer;

public class ExchangeMoneyControl {

    private ConsoleMoneyDialog moneyDialog;
    private ConsoleCurrencyDialog currencyDialog;
    private ConsoleMoneyViewer moneyViewer;
    private ExchangeRateLoader exchangeRateLoader;
    private ConsoleDateDialog dateDialog;
    private CurrencySetLoader currencySetLoader;

    public ExchangeMoneyControl(ConsoleMoneyDialog moneyDialog, ConsoleCurrencyDialog currencyDialog, ConsoleMoneyViewer moneyViewer, ExchangeRateLoader exchangeRateLoader, ConsoleDateDialog dateDialog) {
        this.moneyDialog = moneyDialog;
        this.currencyDialog = currencyDialog;
        this.moneyViewer = moneyViewer;
        this.exchangeRateLoader = exchangeRateLoader;
        this.dateDialog = dateDialog;
    }
    
    public void execute() throws IOException, ParseException {
        Date date = readDate();
        Money money = readMoney();
        Currency currency = readCurrency();
        ExchangeRate exchangeRate = exchangeRateLoader.load(date, money.getCurrency(), currency);
        money = MoneyExchanger.exchange(money, exchangeRate);
        moneyViewer.setMoney(money);
        moneyViewer.show();
    }

    private Date readDate() throws IOException, ParseException {
        dateDialog.excute();
        return dateDialog.getDate();
    }

    private Money readMoney() throws IOException {
        moneyDialog.excute();
        return moneyDialog.getMoney();
    }

    private Currency readCurrency() throws IOException {
        currencyDialog.excute();
        return currencyDialog.getCurrency();
    }
}
