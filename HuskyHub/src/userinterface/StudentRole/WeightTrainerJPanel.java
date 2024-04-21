/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TrainerEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.WeightTrainingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WeightTrainerWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreyas
 */
public class WeightTrainerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WeightTrainerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;
    private UserAccount userAccount;
    Enterprise e;

    WeightTrainerJPanel(JPanel userProcessContainer, EcoSystem system, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.network = network;
        this.userAccount = userAccount;
        weightTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        populateWeightStatusTable();
    }

    private void populateWeightStatusTable() {
        DefaultTableModel dtm = (DefaultTableModel) weightTbl.getModel();
        dtm.setRowCount(0);
        Organization org = null;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enter instanceof TrainerEnterprise) {
                e = enter;
            }
        }
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof WeightTrainingOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
                if (request.getSender().equals(userAccount)) {
                    Object row[] = new Object[5];
                    row[0] = request.getRequestID();
                    row[1] = request.getMessage();
                    row[2] = request.getReceiver();
                    row[3] = ((WeightTrainerWorkRequest) request).getWeightTrainerResult();
                    row[4] = request.getStatus();
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

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgTxt = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        weightTbl = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Enter Your Message:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, 80));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        msgTxt.setBackground(new java.awt.Color(204, 204, 204));
        msgTxt.setColumns(20);
        msgTxt.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        msgTxt.setForeground(new java.awt.Color(51, 51, 51));
        msgTxt.setRows(5);
        jScrollPane1.setViewportView(msgTxt);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 320, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Request Workouts");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 180, 48));

        weightTbl.setBackground(new java.awt.Color(204, 204, 204));
        weightTbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        weightTbl.setForeground(new java.awt.Color(51, 51, 51));
        weightTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Message", "Trainer Name ", "Comments", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(weightTbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 820, 90));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 51, 51));
        enterpriseLabel.setText("WEIGHT TRAINER");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 270, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (userAccount.getWorkQueue().getWorkRequestList().size() == 0) {
            WeightTrainerWorkRequest req = new WeightTrainerWorkRequest();
            req.setSender(userAccount);
            req.setMessage(msgTxt.getText());
            req.setStatus("Request sent to Weight Trainer");
            Organization org = null;

            for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enter instanceof TrainerEnterprise) {
                    e = enter;
                }
            }
            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof WeightTrainingOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(req);
                userAccount.getWorkQueue().getWorkRequestList().add(req);
            }
            JOptionPane.showMessageDialog(null, "Request has been sent. You will receive an email once it is processed!!", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateWeightStatusTable();
        } else {
            int x = userAccount.getWorkQueue().getWorkRequestList().size() - 1;
            WorkRequest r = userAccount.getWorkQueue().getWorkRequestList().get(x);
            if (r.getStatus().toLowerCase().equals("result posted")) {
                WeightTrainerWorkRequest req = new WeightTrainerWorkRequest();
                req.setSender(userAccount);
                req.setMessage(msgTxt.getText());
                req.setStatus("Request sent to Weight Trainer");
                Organization org = null;

                for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enter instanceof TrainerEnterprise) {
                        e = enter;
                    }
                }
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof WeightTrainingOrganization) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(req);
                    userAccount.getWorkQueue().getWorkRequestList().add(req);
                }
                JOptionPane.showMessageDialog(null, "Request has been sent. You will receive an email once it is processed!!", "Success", JOptionPane.INFORMATION_MESSAGE);
                populateWeightStatusTable();
            } else {
                JOptionPane.showMessageDialog(null, "Please wait until the previous request has been processed !", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea msgTxt;
    private javax.swing.JTable weightTbl;
    // End of variables declaration//GEN-END:variables
}
