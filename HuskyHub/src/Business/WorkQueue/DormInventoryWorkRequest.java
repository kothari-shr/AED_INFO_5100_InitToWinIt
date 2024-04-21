/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

import Business.Store.Items;

/**
 *
 * @author yash
 */
public class DormInventoryWorkRequest extends WorkRequest {
    
    private ArrayList<Items> cusList;
    private String cusMessage;
    private int totalBill=0;

    public DormInventoryWorkRequest() {} 
    
    public ArrayList<Items> getCusList() {
        return cusList;
    }

    public void setCusList(ArrayList<Items> cusList) {
        this.cusList = cusList;
    }

    public String getCusMessage() {
        return cusMessage;
    }

    public void setCusMessage(String cusMessage) {
        this.cusMessage = cusMessage;
    }
    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
    
    
    
}
