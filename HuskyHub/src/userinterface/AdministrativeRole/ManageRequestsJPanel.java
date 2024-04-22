/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daminithorat
 */
public class ManageRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRequestsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;

    public ManageRequestsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        workRequestJTable.getTableHeader().setDefaultRenderer(new tableHeaderColors());

        populateOrganization();
    }

    private void populateOrganization() {

        orgComboBox.removeAllItems();

        employeeComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            orgComboBox.addItem(organization.toString());
        }

    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        String o = orgComboBox.getSelectedItem().toString();
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org.getName().equals(o)) {
                for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
                    Object[] row = new Object[4];

                    row[0] = request.getSender().getStudent().getName();
                    row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                    row[2] = request;
                    row[3] = request.getStatus();

                    model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        orgComboBox = new javax.swing.JComboBox();
        employeeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        assignBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Organization:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        orgComboBox.setBackground(new java.awt.Color(204, 255, 204));
        orgComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        orgComboBox.setForeground(new java.awt.Color(51, 51, 51));
        orgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboBoxActionPerformed(evt);
            }
        });
        orgComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                orgComboBoxPropertyChange(evt);
            }
        });
        add(orgComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 190, 30));

        employeeComboBox.setBackground(new java.awt.Color(204, 255, 204));
        employeeComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        employeeComboBox.setForeground(new java.awt.Color(51, 51, 51));
        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 190, 30));

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Assign Selected Task to:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 172, -1));

        assignBtn.setBackground(new java.awt.Color(102, 255, 255));
        assignBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        assignBtn.setForeground(new java.awt.Color(51, 51, 51));
        assignBtn.setText("Assign");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 140, 42));

        workRequestJTable.setBackground(new java.awt.Color(204, 255, 204));
        workRequestJTable.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(51, 51, 51));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Goal", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
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
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 653, 100));

        backJButton.setBackground(new java.awt.Color(102, 255, 255));
        backJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backJButton.setForeground(new java.awt.Color(51, 51, 51));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 100, 30));

        enterpriseLabel.setBackground(new java.awt.Color(102, 255, 255));
        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(102, 255, 255));
        enterpriseLabel.setText("Manage Requests");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 220, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 2);
            if (!request.getStatus().equals("Assigned") && !request.getStatus().equals("Result Posted")) {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount user : org.getUserAccountDirectory().getUserAccountList()) {
                        if (employeeComboBox.getSelectedItem().equals(user.getEmployee().getName())) {

                            int x = user.getWorkQueue().getWorkRequestList().size();
                            if (x > 0) {
                                WorkRequest r = user.getWorkQueue().getWorkRequestList().get(x - 1);
                                String st = r.getStatus();
                                if (st.equals("Assigned")) {
                                    JOptionPane.showMessageDialog(null, "Asignee already has a request in open status!", "Error", JOptionPane.ERROR_MESSAGE);
                                    return;
                                } else {
                                    request.setReceiver(user);
                                    //request.setStatus("Assigned to " + employeeComboBox.getSelectedItem());
                                    request.setStatus("Assigned");
                                    JOptionPane.showMessageDialog(null, "Request has been Assigned Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                                    user.getWorkQueue().getWorkRequestList().add(request);
                                }
                            } else {
                                request.setReceiver(user);
                                //request.setStatus("Assigned to " + employeeComboBox.getSelectedItem());
                                request.setStatus("Assigned");
                                JOptionPane.showMessageDialog(null, "Request has been Assigned Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                                user.getWorkQueue().getWorkRequestList().add(request);
                            }
                        }
                    }
                }
                populateTable();
            } else {
                if (request.getStatus().equals("Assigned")) {
                    JOptionPane.showMessageDialog(null, "Request has been assigned Already!", "Alert", JOptionPane.INFORMATION_MESSAGE);
                } else if (request.getStatus().equals("Result Posted")) {
                    JOptionPane.showMessageDialog(null, "Request has been Posted Already!", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a row", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_assignBtnActionPerformed

    private void orgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_orgComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void orgComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_orgComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_orgComboBoxPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        employeeComboBox.removeAllItems();
        String organization = orgComboBox.getSelectedItem().toString();
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org.getName().equals(organization)) {

                for (Employee emp : org.getEmployeeDirectory().getEmployeeList()) {
                    employeeComboBox.addItem(emp.getName());
                }

            }
            populateTable();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> employeeComboBox;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgComboBox;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

}
