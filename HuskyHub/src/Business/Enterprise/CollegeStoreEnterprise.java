package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;


public class CollegeStoreEnterprise extends Enterprise {
   
    public CollegeStoreEnterprise(String name){
        super(name,Enterprise.EnterpriseType.CollegeStoreEnterprise);
        foodInventoryList = new ArrayList<>();
        stationeryInventoryList = new ArrayList<>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
