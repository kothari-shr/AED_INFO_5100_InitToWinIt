package UI.DormInventoryManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author srira
 */
public class ManageDormInventoryJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private UserAccount userAcc;
    private EcoSystem system;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem business;
    private Organization organization;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public ManageDormInventoryJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        greetLbl.setText(account.getEmployee().getName() + "!!");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageInventoryBtn = new javax.swing.JButton();
        manageOrdersBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        greetLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Dorm Inventory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 320, -1));

        manageInventoryBtn.setBackground(new java.awt.Color(204, 204, 204));
        manageInventoryBtn.setForeground(new java.awt.Color(51, 51, 51));
        manageInventoryBtn.setText("Manage Inventory");
        manageInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInventoryBtnActionPerformed(evt);
            }
        });
        add(manageInventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 170, 50));

        manageOrdersBtn.setBackground(new java.awt.Color(204, 204, 204));
        manageOrdersBtn.setForeground(new java.awt.Color(51, 51, 51));
        manageOrdersBtn.setText("Manage Orders");
        manageOrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersBtnActionPerformed(evt);
            }
        });
        add(manageOrdersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 170, 50));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Welcome,");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 90, 30));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        greetLbl.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        greetLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(greetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 320, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));
    }// </editor-fold>//GEN-END:initComponents

    private void manageInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInventoryBtnActionPerformed
        ManageInventoryJPanel panel = new ManageInventoryJPanel(userProcessContainer, organization, business, enterprise, account);
        userProcessContainer.add("ManageMenuJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageInventoryBtnActionPerformed

    private void manageOrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersBtnActionPerformed
        ManageOrdersJPanel panel = new ManageOrdersJPanel(userProcessContainer, organization, business, enterprise, account);
        userProcessContainer.add("ManageOrdersJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrdersBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel greetLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton manageInventoryBtn;
    private javax.swing.JButton manageOrdersBtn;
    // End of variables declaration//GEN-END:variables

}
