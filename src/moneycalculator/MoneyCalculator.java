package moneycalculator;

import java.io.IOException;
import java.text.ParseException;
import moneycalculator.control.ExchangeMoneyControl;
import moneycalculator.persistence.CurrencySetLoader;
import moneycalculator.persistence.DBCurrencySetLoader;
import moneycalculator.persistence.DBExchangeRateLoader;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.ui.ConsoleCurrencyDialog;
import moneycalculator.ui.ConsoleDateDialog;
import moneycalculator.ui.ConsoleMoneyDialog;
import moneycalculator.ui.ConsoleMoneyViewer;

public class MoneyCalculator {

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        moneyCalculator.execute();
    }

    public void execute() throws IOException, ParseException, ClassNotFoundException {
        ConsoleMoneyDialog moneyDialog = new ConsoleMoneyDialog();
        ConsoleCurrencyDialog currencyDialog = new ConsoleCurrencyDialog();
        ConsoleDateDialog dateDialog = new ConsoleDateDialog();
        ConsoleMoneyViewer moneyViewer = new ConsoleMoneyViewer();
        CurrencySetLoader CurrencySetLoader = DBCurrencySetLoader.getInstance();
        ExchangeRateLoader exchangeRateLoader = DBExchangeRateLoader.getInstance();
        ExchangeMoneyControl exchangeMoneyControl = new ExchangeMoneyControl(moneyDialog, currencyDialog, moneyViewer, exchangeRateLoader, dateDialog, CurrencySetLoader);
        exchangeMoneyControl.execute();
    }

}
