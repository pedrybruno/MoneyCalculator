package moneycalculator.ui.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import moneycalculator.control.command.CommandActionListener;

public class ApplicationFrame extends JFrame {

    private final CommandActionListener actionListener;
    private MoneyPanel moneyPanel;
    private DatePanel datePanel;
    private MoneyViewerPanel moneyViewer;
    private CurrencyPanel currencyPanel;

    public ApplicationFrame(CommandActionListener actionListener) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        this.actionListener = actionListener;
        this.setTitle("Money Calculator");
        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
    }

    private void createComponents() {
        this.add(createPanel());
        this.add(createToolbar(), BorderLayout.SOUTH);
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(firstPanel(), BorderLayout.NORTH);
        panel.add(secondPanel(), BorderLayout.CENTER);
        panel.add(thirdPanel(), BorderLayout.SOUTH);
        return panel;
    }

    private JPanel createToolbar() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel.add(createCalculateButton());
        panel.add(createExitButton());
        return panel;
    }

    private JPanel firstPanel() {
        JPanel panelMoneyExchange = new JPanel();
        panelMoneyExchange.add(createMoneyPanel());
        panelMoneyExchange.add(new JLabel("to"));
        panelMoneyExchange.add(createCurrencyPanel());
        return panelMoneyExchange;
    }
        
    private JPanel secondPanel() {
        JPanel panelDateAndView = new JPanel();
        panelDateAndView.add(new JLabel("Currency value date :"));
        panelDateAndView.add(createDatePanel());
        return panelDateAndView;
    }

    private JPanel thirdPanel() {
        JPanel panelFinalAmount = new JPanel();
        panelFinalAmount.add(new JLabel("Amount converted :"));
        panelFinalAmount.add(createMoneyViewerPanel());
        return panelFinalAmount;
    }

    private JButton createCalculateButton() {
        JButton calculate = new JButton("Convert");
        calculate.addActionListener(actionListener.getActionListener("calculate"));
        return calculate;
    }

    private JButton createExitButton() {
        JButton exit = new JButton("Exit");
        exit.addActionListener(actionListener.getActionListener("exit"));
        return exit;
    }

    private JPanel createMoneyPanel() {
        MoneyPanel panel = new MoneyPanel();
        moneyPanel = panel;
        panel.show();
        return panel;
    }

    private JPanel createCurrencyPanel() {
        CurrencyPanel panel=new CurrencyPanel();
        currencyPanel = panel;
        panel.show();
        return panel;
    }

    private JPanel createDatePanel() {
        DatePanel panel=new DatePanel();
        datePanel=panel;
        panel.show();
        return panel;
    }

    private JPanel createMoneyViewerPanel() {
        MoneyViewerPanel panel=new MoneyViewerPanel();
        moneyViewer=panel;
        panel.show();
        return panel;
    }

    public MoneyPanel getMoneyPanel() {
        return moneyPanel;
    }

    public DatePanel getDatePanel() {
        return datePanel;
    }

    public MoneyViewerPanel getMoneyViewer() {
        return moneyViewer;
    }

    public CurrencyPanel getCurrencyPanel() {
        return currencyPanel;
    }
    
}
