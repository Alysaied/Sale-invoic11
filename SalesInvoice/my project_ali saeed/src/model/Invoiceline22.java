/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Invoiceline22 {
    
    private String name; 
    private int count;
    private double price;
    private Invoiceheader11 inv;

    public Invoiceline22(String name, double price, int count, Invoiceheader11 inv) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.inv = inv;
    }
    public double gettotal(){
        return count*price;
    }

    public Invoiceheader11 getInv() {
        return inv;
    }

    public void setInv(Invoiceheader11 inv) {
        this.inv = inv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "invoice22{" + "name=" + name + ", count=" + count + ", price=" + price + ", inv=" + inv + '}';
    }
    public Invoiceheader11 getInvoice()
    {
        return inv;
    }
    public String getlineAsCSV()
    {
    return inv.getNumber()+","+name+","+price+","
            +count;
    }
}
