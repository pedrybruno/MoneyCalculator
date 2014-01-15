package moneycalculator.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Number;

public class DBExchangeRateLoader implements ExchangeRateLoader{
    
    private static DBExchangeRateLoader instance;
    Connection connection;
    
    public DBExchangeRateLoader() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/MoneyCalculator","root","");
        } catch (SQLException ex) {}
    }

    public static DBExchangeRateLoader getInstance() throws ClassNotFoundException {
        if (instance == null) {
            instance = new DBExchangeRateLoader();
        }
        return instance;
    }
    

    @Override
    public ExchangeRate load(Currency fromCurrency, Currency toCurrency) {
        return load(new Date(), fromCurrency, toCurrency);
    }

    @Override
    public ExchangeRate load(Date date, Currency fromCurrency, Currency toCurrency) {
        return new ExchangeRate(date, new Number(getExchangeRateFromDB(toCurrency, fromCurrency, connection, date)) {}, fromCurrency, toCurrency);
    }

    private double getExchangeRateFromDB(Currency toCurrency, Currency fromCurrency, Connection connection, Date date) {
        try {
            String query = "SELECT * FROM exchanges WHERE exchanges.fromCurrency=\"" + fromCurrency.getCode() + "\" AND exchanges.toCurrency=\"" + toCurrency.getCode() + "\"";
            ResultSet resulSet;
            resulSet = connection.createStatement().executeQuery(query);
            while (resulSet.next())
            return resulSet.getDouble("rate");
        } catch (SQLException ex){
            ex.getMessage();
        }
        return 0;
    }
}
