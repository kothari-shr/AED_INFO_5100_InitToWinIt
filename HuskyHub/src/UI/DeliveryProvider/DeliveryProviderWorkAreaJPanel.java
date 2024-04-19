/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DeliveryProvider;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.DormInventoryWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sohan
 */
public class DeliveryProviderWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem system;
    private EcoSystem business;
    private Enterprise enterprise;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryProviderWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        greetLbl.setText(account.getEmployee().getName() + "!!");
        delManTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());

        if (enterprise.getEnterpriseType().equals("Maintenance Unit")) {
            processJButton.setText("Mark as completed");
        }

        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) delManTbl.getModel();
        dtm.setRowCount(0);
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (WorkRequest request : o.getWorkQueue().getWorkRequestList()) {
                if (request.getReceiver() != null && request.getReceiver().getEmployee().getName().equals(userAccount.getEmployee().getName())) {
                    Object row[] = new Object[4];
                    row[0] = request.getRequestID();
                    row[1] = request.getSender().getStudent().getName();
                    row[2] = request;
                    row[3] = request.getStatus();
                    dtm.addRow(row);
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        delManTbl = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        greetLbl = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delManTbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        delManTbl.setForeground(new java.awt.Color(51, 51, 51));
        delManTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Student Name", "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(delManTbl);
        if (delManTbl.getColumnModel().getColumnCount() > 0) {
            delManTbl.getColumnModel().getColumn(0).setResizable(false);
            delManTbl.getColumnModel().getColumn(1).setResizable(false);
            delManTbl.getColumnModel().getColumn(2).setResizable(false);
            delManTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 730, 96));

        processJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        processJButton.setForeground(new java.awt.Color(51, 51, 51));
        processJButton.setText("Mark as Delivered");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 150, 50));

        refreshJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(51, 51, 51));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 120, 30));

        greetLbl.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        greetLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(greetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 320, 30));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setText("Delivery Request Processing");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 410, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = delManTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DormInventoryWorkRequest request = (DormInventoryWorkRequest) delManTbl.getValueAt(selectedRow, 2);
        if (request.getStatus() == "Delivered") {
            JOptionPane.showMessageDialog(null, "The order has been already Delivered.", "Error", JOptionPane.ERROR_MESSAGE);
            populateTable();
        } else {
            request.setStatus("Delivered");
            JOptionPane.showMessageDialog(null, "The order has been delivered successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateTable();
        }

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable delManTbl;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel greetLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}