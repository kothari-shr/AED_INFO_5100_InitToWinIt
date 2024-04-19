/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Nutritionist;

import Business.Student.Student;
import Business.Business;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NutritionOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NutritionistWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Sohan
 */
public class NutritionistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NutritionWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    NutritionOrganization nutritionOrganisation;
    Enterprise enterprise;
    Business ecosystem;
    Network network;

    public NutritionistWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, Business business, Network network) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
         this.account = account;
         this.enterprise = enterprise;
         this.ecosystem = business;
         greetLbl.setText(account.getEmployee().getName() + "!!");
         this.network = network;
         populateStudent();
         
    }
    
    
    public void populateStudent(){
        DefaultTableModel dtm = (DefaultTableModel) tblStudentList.getModel();
        dtm.setRowCount(0);
        
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
            for(Employee emp : org.getEmployeeDirectory().getEmployeeList()){
                if(emp.toString().equals(account.getEmployee().toString())){
                    for( WorkRequest request: account.getWorkQueue().getWorkRequestList()){
                        Student cust = request.getSender().getStudent();

                        Object[] row = new Object[4];
                        row[0] = cust.getId();
                        row[1] = cust;
                        row[2] = request;
                        row[3] = request.getStatus();
                        dtm.addRow(row);
                    }
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
        tblStudentList = new javax.swing.JTable();
        processBtn = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        txtHeight = new javax.swing.JTextField();
        radioFemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        viewDetailsBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        nutriMsgTxt = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        dietChartComboBox = new javax.swing.JComboBox<>();
        greetLbl = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        viewGoalBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStudentList.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        tblStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUID", "Student Name", "Goal", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudentList);
        if (tblStudentList.getColumnModel().getColumnCount() > 0) {
            tblStudentList.getColumnModel().getColumn(0).setResizable(false);
            tblStudentList.getColumnModel().getColumn(1).setResizable(false);
            tblStudentList.getColumnModel().getColumn(2).setResizable(false);
            tblStudentList.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 675, 91));

        processBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        processBtn.setForeground(new java.awt.Color(51, 51, 51));
        processBtn.setText("Process Request");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });
        add(processBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 179, 45));

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 150, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 107, 30));

        radioMale.setBackground(new java.awt.Color(204, 255, 255));
        radioMale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioMale.setText("Male");
        radioMale.setEnabled(false);
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });
        add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 68, -1));

        txtHeight.setEditable(false);
        txtHeight.setBackground(new java.awt.Color(255, 255, 255));
        txtHeight.setForeground(new java.awt.Color(51, 51, 51));
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 150, 30));

        radioFemale.setBackground(new java.awt.Color(204, 255, 255));
        radioFemale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.setEnabled(false);
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });
        add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 72, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Weight (in kg):");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, 30));

        txtWeight.setEditable(false);
        txtWeight.setBackground(new java.awt.Color(255, 255, 255));
        txtWeight.setForeground(new java.awt.Color(51, 51, 51));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 150, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Age:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 90, 30));

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(255, 255, 255));
        txtAge.setForeground(new java.awt.Color(51, 51, 51));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 150, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Gender:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 107, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Height(in cm):");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 86, 30));

        viewDetailsBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        viewDetailsBtn.setForeground(new java.awt.Color(51, 51, 51));
        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });
        add(viewDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 138, 45));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setText("Message:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, 70));

        nutriMsgTxt.setColumns(20);
        nutriMsgTxt.setForeground(new java.awt.Color(51, 51, 51));
        nutriMsgTxt.setRows(5);
        jScrollPane2.setViewportView(nutriMsgTxt);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Diet Chart:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 80, 30));

        dietChartComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        dietChartComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Weight Gain-1", "Weight Gain-2", "Weight Loss-1", "Weight Loss-2" }));
        add(dietChartComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 150, 30));

        greetLbl.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        greetLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(greetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 320, 40));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setText("STUDENT DETAILS");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 410, 30));

        viewGoalBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        viewGoalBtn.setText("View Goal");
        viewGoalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGoalBtnActionPerformed(evt);
            }
        });
        add(viewGoalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 138, 45));
    }// </editor-fold>//GEN-END:initComponents

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblStudentList.getSelectedRow();
        if(selectedRow >=0){
            Student cus = (Student) tblStudentList.getValueAt(selectedRow, 1);
            if(cus!=null){
            NutritionistWorkRequest request = (NutritionistWorkRequest) tblStudentList.getValueAt(selectedRow, 2);
            if(!"Result Posted".equals(request.getStatus())){
                String email = request.getSender().getUsername();
                request.setDietResult(nutriMsgTxt.getText());
                request.setStatus("Result Posted");
                
                populateStudent();
                
                JOptionPane.showMessageDialog(null,"Email has been sent to Student!","Success",JOptionPane.INFORMATION_MESSAGE);
                nutriMsgTxt.setText("");
            }else{
                JOptionPane.showMessageDialog(null,"Result has been already Processed","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            
              /*    NutritionManageRequestJPanel mnjp = new NutritionManageRequestJPanel(userProcessContainer, cus, request,enterprise);
                    userProcessContainer.add("NutritionManageRequestJPanel",mnjp);
                    CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                    layout.next(userProcessContainer);  */
            }else{
                
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please Select a row","Error",JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_processBtnActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblStudentList.getSelectedRow();
        if(selectedRow >=0){
            Student student = (Student) tblStudentList.getValueAt(selectedRow, 1);
            txtName.setText(student.getName());
            txtAge.setText(String.valueOf(student.getAge()));
            if(student.getGender().toLowerCase().equals("male")){
                radioMale.setSelected(true);
            }else{
                radioFemale.setSelected(false);
            }
            txtHeight.setText(String.valueOf(student.getHeight()));
            txtWeight.setText(String.valueOf(student.getWeight()));
        }else{
            JOptionPane.showMessageDialog(null,"Please Select a row","Error",JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_viewDetailsBtnActionPerformed
    
    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        // radioMale.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // radioFemale.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed

    private void viewGoalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGoalBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblStudentList.getModel();
        dtm.setRowCount(0);
        String goalMessage = "";

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (Employee emp : org.getEmployeeDirectory().getEmployeeList()) {
                if (emp.toString().equals(account.getEmployee().toString())) {
                    for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
                        Student cust = request.getSender().getStudent();
                        Object[] row = new Object[4];
                        row[0] = cust.getId();
                        row[1] = cust;
                        row[2] = request;
                        row[3] = request.getStatus();
                        dtm.addRow(row);
                    }
                }
            }
        }

        if (dtm.getRowCount() > 0) {
            goalMessage = "Request: " + dtm.getValueAt(0, 2);
            JOptionPane.showMessageDialog(null, goalMessage, "Information", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_viewGoalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dietChartComboBox;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel greetLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea nutriMsgTxt;
    private javax.swing.JButton processBtn;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTable tblStudentList;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JButton viewDetailsBtn;
    private javax.swing.JButton viewGoalBtn;
    // End of variables declaration//GEN-END:variables
}
