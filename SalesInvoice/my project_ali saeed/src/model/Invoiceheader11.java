/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hp
 */
public class Invoiceheader11 {
    private int number;
    private String date;
    private String name;
    private ArrayList<Invoiceline22> lines;
    public Invoiceheader11(int number, String date , String name){
        this.name=name;
        this.number=number;
        this.date=date;
    }
    public double gettotal()
    {
        double total=0.0;
        for(Invoiceline22 line :getLines()){
            total+=line.gettotal();
        }
        return total;
    }

    public ArrayList<Invoiceline22> getLines() {
      if(lines==null){
      lines=new ArrayList<>();
      }
      return lines;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "invoice11{" + "number=" + number + ", date=" + date + ", name=" + name + '}';
    }
    public String getInvoiceasCSV(){
    return number+ ","+ date+"," + name ;
    }
}
