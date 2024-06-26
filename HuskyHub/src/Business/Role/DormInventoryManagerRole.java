/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DormInventoryManager.ManageDormInventoryJPanel;

/**
 *
 * @author Sohan
 */
public class DormInventoryManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        return new ManageDormInventoryJPanel(userProcessContainer, enterprise, organization, account, business, network);
    }

    @Override
    public String toString() {
        return RoleType.DormInventoryManager.getValue();
    }
}
