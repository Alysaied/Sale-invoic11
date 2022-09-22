/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hp
 */
public class Invoiceline22Table extends AbstractTableModel {
 
    private ArrayList<Invoiceline22> lines;
    private String[] tableHeader = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public Invoiceline22Table(ArrayList<Invoiceline22> lines) {
        this.lines = lines;
    }

    public ArrayList<Invoiceline22> getLines() {
        return lines;
    }
    
    
    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return tableHeader.length;
    }

    @Override
    public String getColumnName(int x) {
        return tableHeader[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoiceline22 line = lines.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return line.getInvoice().getNumber();
            case 1: return line.getName();
            case 2: return line.getPrice();
            case 3: return line.getCount();
            case 4: return line.gettotal();
            default : return "";
        }
    }
}
