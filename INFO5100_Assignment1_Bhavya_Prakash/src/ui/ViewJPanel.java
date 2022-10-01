/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    EmployeeHistory employeeList;
    public ViewJPanel(EmployeeHistory employeeList) {
        initComponents();
        this.employeeList = employeeList;
        populateTable();
      
    }
     private void populateTable(){
         
         DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
         model.setRowCount(0);
         
         for (Employee em : employeeList.getEmployeeList()){
             Object [] row = new Object[10];
             row[0] = em.getName();
             row[1] = em.getEmployeeId();
             row[2] = em.getAge();
             row[3] = em.getGender();
             row[4] = em.getStartDate();
             row[5] = em.getLevel();
             row[6] = em.getTeamInfo();
             row[7] = em.getPositionTitle();
             row[8] = em.getCellPhoneNumber();
             row[9] = em.getEmail();
             
             model.addRow(row);
            
             
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
        jTable1 = new javax.swing.JTable();
        lbTitle = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        lbGender = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbEmployeeId = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeId = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lbTitle.setText("Search Emloyee ");

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee Id", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Phone Number", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(employeeTable);

        lbGender.setText("Gender");

        lbName.setText("Name");

        lbEmployeeId.setText("Employee ID");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lbEmail.setText("Email");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(lbTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lbName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbEmployeeId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbTitle)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmployeeId)
                    .addComponent(lbGender)
                    .addComponent(lbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(btnSearch)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String employeeId = txtEmployeeId.getText();
        String gender = txtGender.getText();
        String email = txtEmail.getText();
        int i = 0;
        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        model.setRowCount(0);
        
        if(name.length()==0 && employeeId.length()==0  && gender.length()==0 && email.length()==0 ){
            JOptionPane.showMessageDialog(this,"Enter any searh field");
            return;
        }
        for (Employee em : employeeList.getEmployeeList()){
           
            if(em.getName().equals(name) || em.getEmployeeId().equals(employeeId)||em.getGender().equals(gender) ||em.getEmail().equals(email)  ){
                Object [] row = new Object[10];
                row[0] = em.getName();
                row[1] = em.getEmployeeId();
                row[2] = em.getAge();
                row[3] = em.getGender();
                row[4] = em.getStartDate();
                row[5] = em.getLevel();
                row[6] = em.getTeamInfo();
                row[7] = em.getPositionTitle();
                row[8] = em.getCellPhoneNumber();
                row[9] = em.getEmail();
              
                model.addRow(row);
                i=1;
            }
            
        }
        
        if(i==0){
                JOptionPane.showMessageDialog(this,"No results Found");
              
            }

    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JTable employeeTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmployeeId;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
