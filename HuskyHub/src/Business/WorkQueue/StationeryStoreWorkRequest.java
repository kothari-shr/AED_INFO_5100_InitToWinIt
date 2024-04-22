/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Store.Items;
import java.util.ArrayList;

/**
 *
 * @author spkot
 */
public class StationeryStoreWorkRequest extends WorkRequest {

    ArrayList<Items> stationeryRequestList;
    private int totalBill = 0;

    public StationeryStoreWorkRequest() {
        stationeryRequestList = new ArrayList<>();
    }

    public ArrayList<Items> getStationeryRequestList() {
        return stationeryRequestList;
    }

    public void setStationeryRequestList(ArrayList<Items> l) {
        stationeryRequestList = l;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

}
