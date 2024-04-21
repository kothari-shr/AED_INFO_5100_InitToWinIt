/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shreyas
 */
public class TrainerAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrainerAppointmentJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;
    private UserAccount userAccount;

    TrainerAppointmentJPanel(JPanel userProcessContainer, EcoSystem system, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.network = network;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        weightBtn = new javax.swing.JButton();
        fitnessBtn = new javax.swing.JButton();
        rightJPanel = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        jSplitPane1.setDividerLocation(80);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setBackground(new java.awt.Color(102, 255, 255));
        backJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backJButton.setForeground(new java.awt.Color(51, 51, 51));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 40));

        weightBtn.setBackground(new java.awt.Color(102, 255, 255));
        weightBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        weightBtn.setForeground(new java.awt.Color(51, 51, 51));
        weightBtn.setText("Weight Trainer");
        weightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightBtnActionPerformed(evt);
            }
        });
        jPanel1.add(weightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 156, 35));

        fitnessBtn.setBackground(new java.awt.Color(102, 255, 255));
        fitnessBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        fitnessBtn.setForeground(new java.awt.Color(51, 51, 51));
        fitnessBtn.setText("Fitness Trainer");
        fitnessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fitnessBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fitnessBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 156, 35));

        jSplitPane1.setTopComponent(jPanel1);

        rightJPanel.setBackground(new java.awt.Color(0, 102, 102));
        rightJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightJPanel);

        add(jSplitPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void weightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightBtnActionPerformed
        // TODO add your handling code here:
        WeightTrainerJPanel panel = new WeightTrainerJPanel(userProcessContainer, system, network, userAccount);
        rightJPanel.add("WeightTrainerJPanel", panel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_weightBtnActionPerformed

    private void fitnessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fitnessBtnActionPerformed
        // TODO add your handling code here:
        FitnessTrainerJPanel panel = new FitnessTrainerJPanel(userProcessContainer, system, network, userAccount);
        rightJPanel.add("FitnessTrainerJPanel", panel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_fitnessBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton fitnessBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightJPanel;
    private javax.swing.JButton weightBtn;
    // End of variables declaration//GEN-END:variables
}
