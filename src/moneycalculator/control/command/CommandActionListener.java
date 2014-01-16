package moneycalculator.control.command;

import java.awt.event.ActionListener;

public interface CommandActionListener {
    
    public ActionListener getActionListener(String action);
}
