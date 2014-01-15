package moneycalculator.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencySet;

public class FileCurrencySetLoader implements CurrencySetLoader {
    
    private static FileCurrencySetLoader instance;
    private String filename;

    public FileCurrencySetLoader() {
    }
    
    public static FileCurrencySetLoader getInstance() {
        if (instance == null)
            instance = new FileCurrencySetLoader();
        return instance;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    @Override
    public void load() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
            while(true){
                String currency = reader.readLine();
                if(currency==null) break;
                if(!currency.contains(","))continue;
                CurrencySet.getInstance().add(new Currency(currency.split(",")[0], currency.split(",")[1], currency.split(",")[2]));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado un fichero con ese nombre");
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un problema leyendo el fichero");
        }
    }
    

}
