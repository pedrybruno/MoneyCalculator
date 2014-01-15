package moneycalculator.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencySet;

public class DBCurrencySetLoader implements CurrencySetLoader{

    private static DBCurrencySetLoader instance;
    Connection connection;

    public DBCurrencySetLoader() throws ClassNotFoundException {
    try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/MoneyCalculator","root","");
        } catch (SQLException ex) {}
    }

    public static DBCurrencySetLoader getInstance() throws ClassNotFoundException {
        if (instance == null)
            instance = new DBCurrencySetLoader();
        return instance;
    }
    
    @Override
    public void load() {
        try {
            String query = "SELECT * FROM currency";
            ResultSet resulSet;
            resulSet = connection.createStatement().executeQuery(query);
            while (resulSet.next())
            CurrencySet.getInstance().add(new Currency(resulSet.getString("code"),resulSet.getString("name"),resulSet.getString("symbol")));
        } catch (SQLException ex){
        }
    }

}
