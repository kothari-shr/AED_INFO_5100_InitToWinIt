/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DeliveryManRole;
import Business.Role.FoodStoreManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Yash Khavnekar
 */
public class FoodStoreOrganization extends Organization{

    public FoodStoreOrganization() {
        super(Organization.Type.FoodStore.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FoodStoreManagerRole());
        return roles;
    }
     
   
    
    
}
