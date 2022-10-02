/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class UpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    EmployeeHistory employeeList;
    Employee updateEmployee;
    private ImageIcon imgFinal;
    public UpdateJPanel(EmployeeHistory employeeList) {
        initComponents();
        this.employeeList = employeeList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        lbTitle = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        lbEmployeeId = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        lbGender = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lbStartDate = new javax.swing.JLabel();
        lbLevel = new javax.swing.JLabel();
        lbTeamInfo = new javax.swing.JLabel();
        lbPositionTitle = new javax.swing.JLabel();
        lbPhoneNumber = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeId = new javax.swing.JTextField();
        btnUploadPhoto = new javax.swing.JButton();
        txtAge = new javax.swing.JTextField();
        cropImageJLabel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        lbEmployeeId1 = new javax.swing.JLabel();
        txtEmployeeIdSearch = new javax.swing.JTextField();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        radioOther = new javax.swing.JRadioButton();

        lbTitle.setText("Update Profile");

        lbName.setText("Name");

        lbEmployeeId.setText("Employee ID");

        lbAge.setText("Age");

        lbGender.setText("Gender");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lbStartDate.setText("Start Date");

        lbLevel.setText("Level");

        lbTeamInfo.setText("Team Info");

        lbPositionTitle.setText("Position Title");

        lbPhoneNumber.setText("Phone number");

        lbEmail.setText("Email ");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnUploadPhoto.setText("Upload New Photo");
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lbEmployeeId1.setText("Employee ID");

        genderGroup.add(radioMale);
        radioMale.setText("Male");

        genderGroup.add(radioFemale);
        radioFemale.setText("Female");

        genderGroup.add(radioOther);
        radioOther.setText("Other");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbEmployeeId1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmployeeIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addComponent(lbTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName)
                    .addComponent(lbEmployeeId)
                    .addComponent(lbAge)
                    .addComponent(lbGender)
                    .addComponent(lbStartDate)
                    .addComponent(lbLevel)
                    .addComponent(lbTeamInfo)
                    .addComponent(lbPositionTitle)
                    .addComponent(lbPhoneNumber)
                    .addComponent(lbEmail))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                .addComponent(txtPositionTitle, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTeamInfo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmployeeId, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLevel, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(startDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(cropImageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnUploadPhoto)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(radioMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioFemale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioOther)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(314, 314, 314))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitle)
                    .addComponent(lbEmployeeId1)
                    .addComponent(txtEmployeeIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmployeeId)
                            .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cropImageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbGender))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioMale)
                            .addComponent(radioFemale)
                            .addComponent(radioOther))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbStartDate)
                        .addComponent(btnUploadPhoto))
                    .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPositionTitle)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnUpdate)
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        try{
            String name = txtName.getText();
            if(name.length()==0){
                JOptionPane.showMessageDialog(this,"Name error");
                return;
            }
            String employeeId = txtEmployeeId.getText();
            if(employeeId.length()==0){
                JOptionPane.showMessageDialog(this,"EmployeeId error");
                return;
            }
            int age = Integer.parseInt(txtAge.getText());
            radioMale.setActionCommand("Male");
            radioFemale.setActionCommand("Female");
            radioOther.setActionCommand("Other");
            String gender = genderGroup.getSelection().getActionCommand();
             if(gender == null){
             JOptionPane.showMessageDialog(this,"gender error");
             return;
            }
            Date startDate = startDateChooser.getDate();
             if(startDate==null){
             JOptionPane.showMessageDialog(this,"startDate error");
             return;
            }
            int level = Integer.parseInt(txtLevel.getText());
            String teamInfo = txtTeamInfo.getText();
            if(teamInfo.length()==0){
                JOptionPane.showMessageDialog(this,"teamInfo");
                return;
            }
            String positionTitle = txtPositionTitle.getText();
            if(positionTitle.length()==0){
                JOptionPane.showMessageDialog(this,"positionTitle error");
                return;
            }
            int cellPhoneNumber = Integer.parseInt(txtPhoneNumber.getText());

            String email = txtEmail.getText();
            if(email.length()==0){
                JOptionPane.showMessageDialog(this,"email error");
                return;
            }
            if(imgFinal == null){
              JOptionPane.showMessageDialog(this,"photo error");
             return;  
            }

            updateEmployee.setName(name);
            updateEmployee.setEmployeeId(employeeId);
            updateEmployee.setAge(age);
            updateEmployee.setGender(gender);
            updateEmployee.setStartDate(startDate);
            updateEmployee.setLevel(level);
            updateEmployee.setTeamInfo(teamInfo);
            updateEmployee.setPositionTitle(positionTitle);
            updateEmployee.setCellPhoneNumber(cellPhoneNumber);
            updateEmployee.setEmail(email);
            updateEmployee.setEmployeePhoto(imgFinal);

            JOptionPane.showMessageDialog(this,"Employee Updated.");

            txtName.setText("");
            txtEmployeeId.setText("");
            txtAge.setText("");
            genderGroup.clearSelection();
            startDateChooser.setDateFormatString("");
            txtLevel.setText("");
            txtTeamInfo.setText("");
            txtPositionTitle.setText("");
            txtPhoneNumber.setText("");
            txtEmail.setText("");
            cropImageJLabel.setText("");

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error creating employee");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File image=chooser.getSelectedFile();
        String fName=image.getAbsolutePath();
        ImageIcon imgIcon=new ImageIcon(fName);
        Image img=imgIcon.getImage();
        Image pic=img.getScaledInstance(cropImageJLabel.getWidth(), cropImageJLabel.getHeight(), SCALE_SMOOTH);
        imgFinal=new ImageIcon(pic);
        //picTxtFld.setText(fName);
        //request.setImgIcon(imgFinal);
        cropImageJLabel.setIcon(imgFinal);
    }//GEN-LAST:event_btnUploadPhotoActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        String employeeId = txtEmployeeIdSearch.getText();
        int i=0;
        for (Employee em : employeeList.getEmployeeList()){

            if( em.getEmployeeId().equals(employeeId)){
                txtName.setText(em.getName());
                txtEmployeeId.setText(em.getEmployeeId());
                txtAge.setText(String.valueOf(em.getAge()));
                if("Male".equals(em.getGender())){
                    radioMale.setSelected(true);
                }
                else if ("Female".equals(em.getGender())){
                    radioFemale.setSelected(true);
                }
                 else if ("Other".equals(em.getGender())){
                    radioOther.setSelected(true);
                }
                
                startDateChooser.setDate(em.getStartDate());
                txtLevel.setText(String.valueOf(em.getLevel()));
                txtTeamInfo.setText(em.getTeamInfo());
                txtPositionTitle.setText(em.getPositionTitle());
                txtPhoneNumber.setText(String.valueOf(em.getCellPhoneNumber()));
                txtEmail.setText(em.getEmail());
                cropImageJLabel.setIcon(em.getEmployeePhoto());
                i=1;
                updateEmployee = em;
                break;

            }

        }

        if(i==0){
            JOptionPane.showMessageDialog(this,"No results Found");

        }
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUploadPhoto;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel cropImageJLabel;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmployeeId;
    private javax.swing.JLabel lbEmployeeId1;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbLevel;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPhoneNumber;
    private javax.swing.JLabel lbPositionTitle;
    private javax.swing.JLabel lbStartDate;
    private javax.swing.JLabel lbTeamInfo;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioOther;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtEmployeeIdSearch;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}
