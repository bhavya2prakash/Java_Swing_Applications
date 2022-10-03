/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.io.File;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Employee;
import model.EmployeeHistory;


/**
 *
 * @author BHAVYA PRAKASH
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    EmployeeHistory employeeList;
    private ImageIcon imgFinal;
    public CreateJPanel(EmployeeHistory employeeList) {
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
        lbTitle = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbEmployeeId = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        lbGender = new javax.swing.JLabel();
        lbStartDate = new javax.swing.JLabel();
        lbLevel = new javax.swing.JLabel();
        lbTeamInfo = new javax.swing.JLabel();
        lbPositionTitle = new javax.swing.JLabel();
        lbPhoneNumber = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUploadPhoto = new javax.swing.JButton();
        cropImageJLabel = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        radioOther = new javax.swing.JRadioButton();
        startDateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));

        lbTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lbTitle.setText("Create a new Employee");

        lbName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lbName.setText("Name");

        lbEmployeeId.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lbEmployeeId.setText("Employee ID");

        lbAge.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lbAge.setText("Age");

        lbGender.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lbGender.setText("Gender");

        lbStartDate.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lbStartDate.setText("Start Date");

        lbLevel.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lbLevel.setText("Level");

        lbTeamInfo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lbTeamInfo.setText("Team Info");

        lbPositionTitle.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lbPositionTitle.setText("Position Title");

        lbPhoneNumber.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lbPhoneNumber.setText("Phone number");

        lbEmail.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lbEmail.setText("Email ");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyPressed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUploadPhoto.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnUploadPhoto.setText("Upload Photo");
        btnUploadPhoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUploadPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });

        cropImageJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/profile-icon.jpg"))); // NOI18N

        genderGroup.add(radioMale);
        radioMale.setText("Male");
        radioMale.setActionCommand("");

        genderGroup.add(radioFemale);
        radioFemale.setText("Female");
        radioFemale.setActionCommand("");

        genderGroup.add(radioOther);
        radioOther.setText("Other");
        radioOther.setActionCommand("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lbTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
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
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtEmployeeId, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLevel)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioMale)
                                .addGap(18, 18, 18)
                                .addComponent(radioFemale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioOther))
                            .addComponent(startDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cropImageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUploadPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbAge, lbEmail, lbEmployeeId, lbGender, lbLevel, lbName, lbPhoneNumber, lbPositionTitle, lbStartDate, lbTeamInfo});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {startDateChooser, txtAge, txtEmail, txtEmployeeId, txtLevel, txtName, txtPhoneNumber, txtPositionTitle, txtTeamInfo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(cropImageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnUploadPhoto))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbName))
                                .addGap(18, 18, 18)
                                .addComponent(lbEmployeeId))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbGender)
                            .addComponent(radioMale)
                            .addComponent(radioFemale)
                            .addComponent(radioOther))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbStartDate)
                            .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLevel)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTeamInfo)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPositionTitle)
                            .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPhoneNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbAge, lbEmail, lbEmployeeId, lbGender, lbLevel, lbName, lbPhoneNumber, lbPositionTitle, lbStartDate, lbTeamInfo});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {startDateChooser, txtAge, txtEmail, txtEmployeeId, txtLevel, txtName, txtPhoneNumber, txtPositionTitle, txtTeamInfo});

    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed
    private boolean validation(String input, String regexPattern){
        Pattern pattern = Pattern.compile(regexPattern,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
        
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
            
            try{
            String name = txtName.getText();
            if(name.length()==0 || !validation(name,"^(?![\\s.]+$)[a-zA-Z\\s.]*$")){
             JOptionPane.showMessageDialog(this,"Invalid Name");
             return;
            }
            String employeeId = txtEmployeeId.getText();
            if(employeeId.length()==0 || !validation(employeeId,"^(?![\\s.]+$)[a-zA-Z0-9\\s.]*$")){
             JOptionPane.showMessageDialog(this,"Invalid Employee Id. Can contain only alphabets and numbers.");
             return;
            }
            int age = Integer.parseInt(txtAge.getText());
            if(!(age >= 18 && age <= 65)){
             JOptionPane.showMessageDialog(this,"Invalid Age. Age should be between 18 to 65"); 
             return;
            }
            String gender;
            if(radioMale.isSelected()){
                    gender = "Male";
                }
             else if (radioFemale.isSelected()){
                   gender = "Female";
                }
             else if(radioOther.isSelected()){
                    gender = "Other";
                }
             else {
                 gender = "";
             }
             if(gender.length()==0 ){
             JOptionPane.showMessageDialog(this,"Invalid Gender ");
             return;
            }
            Date startDate = startDateChooser.getDate();
             if(startDate==null){
             JOptionPane.showMessageDialog(this,"Invalid Date");
             return;
            }
            String level = txtLevel.getText();
            if(level.length()==0 || !validation(level,"^(?![\\s.]+$)[a-zA-Z0-9\\s.]*$")){
             JOptionPane.showMessageDialog(this,"Invalid Level. Can contain only alphabets and numbers");
             return;
            }
            String teamInfo = txtTeamInfo.getText();
             if(teamInfo.length()==0 || !validation(teamInfo,"^(?![\\s.]+$)[a-zA-Z0-9\\s.]*$")){
             JOptionPane.showMessageDialog(this,"Invalid Team Info");
             return;
            }
            String positionTitle = txtPositionTitle.getText();
             if(positionTitle.length()==0 || !validation(positionTitle,"^(?![\\s.]+$)[a-zA-Z0-9\\s.]*$")){
             JOptionPane.showMessageDialog(this,"Invalid Position Title. Can contain only alphabets and numbers");
             return;
            }
            String cellPhoneNumber = txtPhoneNumber.getText();
            
            if(!validation(cellPhoneNumber,"^\\d{10}$")){
             JOptionPane.showMessageDialog(this,"Invalid Phone Number");
             return;
            }
            String email = txtEmail.getText();
            
             if(email.length()==0 || !validation(email,"^(.+)@(\\S+)$")){
             JOptionPane.showMessageDialog(this,"Invalid Email");
             return;
            }
             
            if(imgFinal == null){
              JOptionPane.showMessageDialog(this,"Invalid Photo");
             return;  
            }
            
            
            Employee em = employeeList.addNewEmployee();
            em.setName(name);
            em.setEmployeeId(employeeId);
            em.setAge(age);
            em.setGender(gender);
            em.setStartDate(startDate);
            em.setLevel(level);
            em.setTeamInfo(teamInfo);
            em.setPositionTitle(positionTitle);
            em.setCellPhoneNumber(cellPhoneNumber);
            em.setEmail(email);
            em.setEmployeePhoto(imgFinal);
            
            JOptionPane.showMessageDialog(this,"New employee created.");
            
            txtName.setText("");
            txtEmployeeId.setText("");
            txtAge.setText("");
            genderGroup.clearSelection();
            startDateChooser.setCalendar(null);
            txtLevel.setText("");
            txtTeamInfo.setText("");
            txtPositionTitle.setText("");
            txtPhoneNumber.setText("");
            txtEmail.setText("");
            cropImageJLabel.setIcon(new ImageIcon(getClass().getResource("/ui/profile-icon.jpg")));
            
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Invalid Input. Error creating new employee");
            }
            
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        // TODO add your handling code here:
            JFileChooser chooser=new JFileChooser();
            chooser.showOpenDialog(null);
            File image=chooser.getSelectedFile();
            String fName=image.getAbsolutePath();
            ImageIcon imgIcon=new ImageIcon(fName);  
            if(fName.toLowerCase().endsWith(".jpg") || fName.toLowerCase().endsWith(".jpeg")){
            Image img=imgIcon.getImage();
            Image pic=img.getScaledInstance(cropImageJLabel.getWidth(), cropImageJLabel.getHeight(), SCALE_SMOOTH);
             imgFinal=new ImageIcon(pic);
            //picTxtFld.setText(fName);
            //request.setImgIcon(imgFinal);
            cropImageJLabel.setIcon(imgFinal);
            }
            else{
             JOptionPane.showMessageDialog(this, "Invalid File. Upload a jpeg/jpg file");   
            }
    }//GEN-LAST:event_btnUploadPhotoActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        if (Character.isDigit(c)){
            txtName.setEditable(false);
        }
        else{
            txtName.setEditable(true);
        }
        
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            txtAge.setEditable(false);
        }
        else{
            txtAge.setEditable(true);
        }

    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtPhoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            txtPhoneNumber.setEditable(false);
        }
        else{
            txtPhoneNumber.setEditable(true);
        }
    }//GEN-LAST:event_txtPhoneNumberKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUploadPhoto;
    private javax.swing.JLabel cropImageJLabel;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmployeeId;
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
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}
