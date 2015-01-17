package kata5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoneyCalculatorFrame extends JFrame{
    public MoneyCalculatorFrame(){
        super();
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Para que la consola se cierre al pulsar X.
        setMinimumSize(new Dimension(300, 300)); //Tamaño consola.
        createComponents();
        setVisible(true); //Siempre al final.
    }
    private void createComponents(){
        add(createExchangeDialog());
        add(createToolbar(), BorderLayout.SOUTH);
    }
    private JPanel createExchangeDialog() {
        JPanel panel = new JPanel();
        panel.add(new MoneyDialog());
        panel.add(new CurrencyDialog());
        return panel;
    }
    private JPanel createToolbar() {
        JPanel panel = new JPanel(new FlowLayout (FlowLayout.RIGHT));
        panel.add(createCalculateButton());
        panel.add(createCloseButton());
        return panel;
    }

    private JButton createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculating...");
            }
        });
        return button;
    }

    private JButton createCloseButton() {
        JButton button = new JButton("Close");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MoneyCalculatorFrame.this.dispose();
            }
        });
        return button;        
    }

    
}