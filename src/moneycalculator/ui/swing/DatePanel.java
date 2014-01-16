package moneycalculator.ui.swing;

import com.toedter.calendar.JDateChooser;
import java.awt.FlowLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import javax.swing.JPanel;
import moneycalculator.ui.DateDialog;

public class DatePanel extends JPanel implements DateDialog {

    private Date date;

    public DatePanel() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        date=new Date();
    }

    @Override
    public void show(){
        this.add(createDateChooser());
    }
    
    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
    }

    private JDateChooser createDateChooser() {
        JDateChooser dateChooser=new JDateChooser();
        dateChooser.setDate(new Date());
        dateChooser.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if(date.toString().equals(evt.getPropertyName()))
                date=(Date)evt.getNewValue();            }
        });
        return dateChooser;
    }
}
