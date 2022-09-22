/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class InvoiceLineTable extends JDialog 
{
     private JTextField itemNameTextField;
    private JTextField itemCountTextField;
    private JTextField itemPriceTextField;
    private JLabel itemNameLable;
    private JLabel itemCountLable;
    private JLabel itemPriceLable;
    private JButton okButton;
    private JButton cancelButton;
    
    public InvoiceLineTable(asdFrame frame) {
        itemNameTextField = new JTextField(20);
        itemNameLable = new JLabel("Item Name");
        
        itemCountTextField = new JTextField(20);
        itemCountLable = new JLabel("Item Count");
        
        itemPriceTextField = new JTextField(20);
        itemPriceLable = new JLabel("Item Price");
        
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        
        okButton.setActionCommand("createLineOK");
        cancelButton.setActionCommand("createLineCancel");
        
        okButton.addActionListener(frame.getController());
        cancelButton.addActionListener(frame.getController());
        setLayout(new GridLayout(4, 2));
        
        add(itemNameLable);
        add(itemNameTextField);
        add(itemCountLable);
        add(itemCountTextField);
        add(itemPriceLable);
        add(itemPriceTextField);
        add(okButton);
        add(cancelButton);
        
        pack();
    }

    public JTextField getItemNameTextField() {
        return itemNameTextField;
    }

    public JTextField getItemCountTextField() {
        return itemCountTextField;
    }

    public JTextField getItemPriceTextField() {
        return itemPriceTextField;
    }
}

