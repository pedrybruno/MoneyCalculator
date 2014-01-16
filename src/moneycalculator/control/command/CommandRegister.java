package moneycalculator.control.command;

import java.util.HashMap;

public class CommandRegister {

    private final HashMap<String, Command> actionMap=new HashMap<>();

    public Command getActionMap(String action) {
        return actionMap.get(action);
    }
    
    public void setActionMap(String action, Command command){
        actionMap.put(action, command);
    }
    
    
}
