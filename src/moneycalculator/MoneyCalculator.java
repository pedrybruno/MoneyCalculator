package moneycalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import javax.swing.UnsupportedLookAndFeelException;
import moneycalculator.control.ExchangeMoneyControl;
import moneycalculator.control.command.Command;
import moneycalculator.control.command.CommandActionListener;
import moneycalculator.control.command.CommandCalculate;
import moneycalculator.control.command.CommandRegister;
import moneycalculator.persistence.CurrencySetLoader;
import moneycalculator.persistence.DBCurrencySetLoader;
import moneycalculator.persistence.DBExchangeRateLoader;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.ui.console.ConsoleCurrencyDialog;
import moneycalculator.ui.console.ConsoleDateDialog;
import moneycalculator.ui.console.ConsoleMoneyDialog;
import moneycalculator.ui.console.ConsoleMoneyViewer;
import moneycalculator.ui.swing.ApplicationFrame;

public class MoneyCalculator {

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        moneyCalculator.executeSwing();
    }

    public static void executeConsole() throws IOException, ParseException, ClassNotFoundException {
        ConsoleMoneyDialog moneyDialog = new ConsoleMoneyDialog();
        ConsoleCurrencyDialog currencyDialog = new ConsoleCurrencyDialog();
        ConsoleDateDialog dateDialog = new ConsoleDateDialog();
        ConsoleMoneyViewer moneyViewer = new ConsoleMoneyViewer();
        CurrencySetLoader currencySetLoader = DBCurrencySetLoader.getInstance();
        currencySetLoader.load();
        ExchangeRateLoader exchangeRateLoader = DBExchangeRateLoader.getInstance();
        ExchangeMoneyControl exchangeMoneyControl = new ExchangeMoneyControl(moneyDialog, currencyDialog, moneyViewer, exchangeRateLoader, dateDialog);
        exchangeMoneyControl.execute();
    }

    public static void executeSwing() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        CurrencySetLoader currencySetLoader = DBCurrencySetLoader.getInstance();
        currencySetLoader.load();
        final CommandRegister commandRegister = new CommandRegister();
        CommandActionListener actionListener = new CommandActionListener() {

            @Override
            public ActionListener getActionListener(final String action) {
                return new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        commandRegister.getActionMap(action).execute();
                    }
                };
            }
        };

        final ApplicationFrame frame = new ApplicationFrame(actionListener);

        commandRegister.setActionMap("calculate", new CommandCalculate(
                frame.getMoneyViewer(),
                frame.getMoneyPanel(),
                frame.getCurrencyPanel(),
                frame.getDatePanel()));

        commandRegister.setActionMap("exit", new Command() {

            @Override
            public void execute() {
                frame.dispose();
            }
        });
    }
}
