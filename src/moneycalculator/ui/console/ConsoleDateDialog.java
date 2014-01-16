package moneycalculator.ui.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleDateDialog {

    private Date date;
    
    public Date excute() throws IOException, ParseException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean gotCorrect = false;
        while(!gotCorrect){
            try{
                System.out.println("Introduzca una fecha (dd-MM-yyyy)");
                String string = reader.readLine();
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                date = dateFormat.parse(string);
                gotCorrect = true;
            }catch(Exception e){
                System.out.println();
                System.out.println("Error: no se ha introducido una fecha con el formato indicado");
                System.out.println();
                continue;
            }
        }
        return date;
    }

    public Date getDate() {
        return date;
    }
    
}
