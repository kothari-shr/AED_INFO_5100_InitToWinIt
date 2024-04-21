/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ServiceWorkerRole;
import java.util.ArrayList;

/**
 *
 * @author daminithorat
 */
public class ServiceWorkerCatalog extends Organization{

    public ServiceWorkerCatalog() {
        super(Organization.Type.ServiceWorker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ServiceWorkerRole());
        return roles;
    }
     
   
    
    
}