package moneycalculator.ui.swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencySet;
import moneycalculator.ui.CurrencyDialog;

public class CurrencyPanel extends JPanel implements CurrencyDialog {

    private Currency currency;
    private JComboBox comboCurrencies;

    public CurrencyPanel() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(createComboCurrency());
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }
    
    @Override
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public JComboBox getComboCurrencies() {
        return comboCurrencies;
    }

    private JComboBox createComboCurrency() {
        comboCurrencies = new JComboBox();
        getInstance(comboCurrencies);
        comboCurrencies.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() != ItemEvent.SELECTED)
                    return;
                currency = CurrencySet.getInstance().get(((String) comboCurrencies.getSelectedItem()).split("- ")[0]);
            }
        });
        return comboCurrencies;
    }

    private void getInstance(JComboBox comboCurrencies) {
        for (Currency currency : CurrencySet.getInstance()) {
            comboCurrencies.addItem(currency.getCode()+ "- " + currency.getName());
        }
        comboCurrencies.setSelectedItem("EUR- Euro");
        currency= CurrencySet.getInstance().get("EUR");
    }
    
}
