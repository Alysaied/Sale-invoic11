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
public class InvoiceheaderTable extends AbstractTableModel 
{
    private ArrayList<Invoiceheader11> invoices;
    private String []tableheader={"No","Date","Customer","Total"};
    
    public InvoiceheaderTable(ArrayList<Invoiceheader11> invoices)
    {
     this.invoices=invoices;
    }
 @Override
    public int getRowCount()
    {
        return invoices.size();
    }

    @Override
    public int getColumnCount()
    {
        return tableheader.length;
    }

    @Override
    public String getColumnName(int column)
    {
        return tableheader[column];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Invoiceheader11 invoice = invoices.get(rowIndex);
        
        switch (columnIndex)
        {
            case 0: return invoice.getNumber();
            case 1: return invoice.getDate();
            case 2: return invoice.getName();
            case 3: return invoice.gettotal();
            default : return "";
        }
    }
}