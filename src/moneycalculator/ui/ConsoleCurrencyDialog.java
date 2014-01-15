package moneycalculator.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencySet;

public class ConsoleCurrencyDialog {

    private Currency currency;
    
    public Currency excute() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean gotCorrect = false;
        while(true){
            System.out.println("Introduzca el código de una divisa");
            currency = CurrencySet.getInstance().get(reader.readLine());
            if (currency != null) break;    
            System.out.println();
            System.out.println("Error: no se ha introducido un código de divisa válido");
            System.out.println();
        }
    return currency;
    }

    public Currency getCurrency() {
        return currency;
    }
    
}
