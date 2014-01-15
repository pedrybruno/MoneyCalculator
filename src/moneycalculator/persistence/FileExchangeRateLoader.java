package moneycalculator.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;

public class FileExchangeRateLoader implements ExchangeRateLoader{
    
    private static FileExchangeRateLoader instance;

    public FileExchangeRateLoader() {
    }

    public static FileExchangeRateLoader getInstance() {
        if(instance == null)
            instance = new FileExchangeRateLoader();
        return instance;
    }
    
    public static ArrayList<ExchangeRate> load(String filename){
        ArrayList<ExchangeRate> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
            while(true){
                String string=reader.readLine(); 
                if(string==null) break; 
                ExchangeRate exchangeRate = new ExchangeRate(null, null, null, null);
                //ExchangeRate exchangeRate = new ExchangeRate(DateFormat.(string.split(",")[0]), string.split(",")[1], string.split(",")[2]);
                list.add(exchangeRate);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado un fichero con ese nombre");
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un problema leyendo el fichero");
        }
        return list;      
    }

    @Override
    public ExchangeRate load(Currency fromCurrency, Currency toCurrency) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExchangeRate load(Date date, Currency fromCurrency, Currency toCurrency) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
