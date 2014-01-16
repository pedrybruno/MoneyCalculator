package moneycalculator.ui.swing;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import moneycalculator.model.CurrencySet;
import moneycalculator.model.Money;
import moneycalculator.model.Number;
import moneycalculator.ui.CurrencyDialog;
import moneycalculator.ui.MoneyDialog;

public class MoneyPanel extends JPanel implements MoneyDialog {
    
    private String amount;
    private CurrencyDialog currencyDialog;

    public MoneyPanel() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(new JLabel("Convert"));
        this.add(createTextField());
        this.add(new JLabel("from"));
        this.add(createCurrencyPanel());
    }

    @Override
    public Money getMoney() {
        if(amount == null) amount = "0";
        return new Money(new Number(Double.parseDouble(amount)), currencyDialog.getCurrency());
    }
    
    @Override
    public void setMoney(Money money) {
    }
    
    private JTextField createTextField() {
        final JTextField textField=new JTextField(10);
        textField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                amount=textField.getText();
            }
        });
        return textField;
    }
    
    private CurrencyPanel createCurrencyPanel() {
        CurrencyPanel panel = new CurrencyPanel();
        panel.getComboCurrencies().setSelectedItem("GBP- Libra Esterlina");
        panel.setCurrency(CurrencySet.getInstance().get("GBP"));
        currencyDialog = panel;
        return panel;
    }
}
