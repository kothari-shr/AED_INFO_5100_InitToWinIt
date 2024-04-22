/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Business.Store.Items;

/**
 *
 * @author spkot
 */
public class FoodStoreWorkRequest extends WorkRequest{

    ArrayList<Items> foodRequestList;
    int totalBill=0;
    
    public FoodStoreWorkRequest() {
        foodRequestList = new ArrayList<>();
    }

    public ArrayList<Items> getFoodRequestList() {
        return foodRequestList;
    }

    public void setFoodRequestList(ArrayList<Items> foodRequestList) {
        this.foodRequestList = foodRequestList;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
    
    
}
