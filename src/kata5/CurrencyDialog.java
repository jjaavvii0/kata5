package kata5;

import java.awt.MenuItem;
import java.awt.PopupMenu;
import javax.swing.JComboBox;
import javax.swing.JPanel;


class CurrencyDialog extends JPanel {

    public CurrencyDialog() {
        super();
        add(createComboBox());
    }

    private JComboBox createComboBox() {
        return new JComboBox(new String []{"EUR", "USD","GBP"});
    }
    
}
