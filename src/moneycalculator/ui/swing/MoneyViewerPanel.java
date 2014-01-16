package moneycalculator.ui.swing;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.model.Money;
import moneycalculator.ui.MoneyViewer;

public class MoneyViewerPanel extends JPanel implements MoneyViewer {
    
    private final JLabel resultado;
    private Money money;

    public MoneyViewerPanel() {
        this.setLayout(new FlowLayout());
        resultado=new JLabel("0");
    }
    
    @Override
    public Money getMoney() {
        return money;
    }

    @Override
    public void setMoney(Money money) {
        this.money = money;
    }

    @Override
    public void show(){
        this.add(createLabel());
    }

    private JLabel createLabel() {
        if (money!=null)
            resultado.setText(money.toString());
        return resultado;
    }
    
}
