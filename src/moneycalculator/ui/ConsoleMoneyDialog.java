package moneycalculator.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import moneycalculator.model.Currency;
import moneycalculator.model.Money;
import moneycalculator.model.Number;

public class ConsoleMoneyDialog {
    
    private Money money;
    
    public Money excute() throws IOException {
        Currency currency;
        Number amount = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean gotCorrect = false;
        while(!gotCorrect){
            try{
                System.out.println("Introduzca una cantidad de dinero");
                amount = new Number(Double.parseDouble(reader.readLine())) {};
                gotCorrect = true;
            }catch(Exception e){
                System.out.println();
                System.out.println("Error: no se ha introducido una cantidad de dinero");
                System.out.println();
                continue;
            }
        }
        ConsoleCurrencyDialog currencyDialog = new ConsoleCurrencyDialog();
        currency = currencyDialog.excute();
        money = new Money(amount, currency);
        return money;
    }

    public Money getMoney() {
        return money;
    }
    
}
