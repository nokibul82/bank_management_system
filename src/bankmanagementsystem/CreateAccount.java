
package bankmanagementsystem;


import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CreateAccount extends javax.swing.JPanel {
    
    String filename ="";
    String signfilename = "";
    
    
    public CreateAccount() {
        initComponents();
        setBounds(300,0,900,700);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        accountNoField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressArea = new javax.swing.JTextArea();
        contactField = new javax.swing.JTextField();
        typeComboBox = new javax.swing.JComboBox<>();
        birthDateChooser = new com.toedter.calendar.JDateChooser();
        emailField = new javax.swing.JTextField();
        proofIdNoField = new javax.swing.JTextField();
        proofIdComboBox = new javax.swing.JComboBox<>();
        imageLabel = new javax.swing.JLabel();
        photoBtn = new javax.swing.JButton();
        signLabel = new javax.swing.JLabel();
        signBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        balanceField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(190, 190, 190));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setText("Create Account");

        userLabel.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        userLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/user.png"))); // NOI18N
        userLabel.setText("User :");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setText("Account No :");

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setText("Ful Name :");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel5.setText("Address :");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel6.setText("Contact :");

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel7.setText("Account Type :");

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel8.setText("Gender :");

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel9.setText("Birth :");

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel10.setText("Email Id :");

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel11.setText("ID Proof :");

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel12.setText("ID Proof No :");

        accountNoField.setBackground(new java.awt.Color(230, 230, 230));
        accountNoField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nameField.setBackground(new java.awt.Color(230, 230, 230));
        nameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        addressArea.setBackground(new java.awt.Color(230, 230, 230));
        addressArea.setColumns(20);
        addressArea.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        addressArea.setRows(5);
        jScrollPane1.setViewportView(addressArea);

        contactField.setBackground(new java.awt.Color(230, 230, 230));
        contactField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        typeComboBox.setBackground(new java.awt.Color(190, 190, 190));
        typeComboBox.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings", "Salary", "Student", "Bussiness", "Fixed Deposit", "NRI" }));
        typeComboBox.setSelectedIndex(-1);
        typeComboBox.setToolTipText("");

        birthDateChooser.setBackground(new java.awt.Color(230, 230, 230));
        birthDateChooser.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        emailField.setBackground(new java.awt.Color(230, 230, 230));
        emailField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        proofIdNoField.setBackground(new java.awt.Color(230, 230, 230));
        proofIdNoField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        proofIdComboBox.setBackground(new java.awt.Color(190, 190, 190));
        proofIdComboBox.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        proofIdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Passport", "National ID", "Driving Licance", "Student ID" }));
        proofIdComboBox.setSelectedIndex(-1);

        imageLabel.setBackground(new java.awt.Color(255, 255, 255));
        imageLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        photoBtn.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        photoBtn.setText("Choose Photo");
        photoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoBtnActionPerformed(evt);
            }
        });

        signLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        signBtn.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        signBtn.setText("Upload Signature");
        signBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signBtnActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        submitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_Done_20px_1.png"))); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_refresh_20px.png"))); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel13.setText("Balance :");

        balanceField.setBackground(new java.awt.Color(230, 230, 230));
        balanceField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        balanceField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                balanceFieldFocusLost(evt);
            }
        });

        genderComboBox.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderComboBox.setSelectedIndex(-1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(64, 64, 64)
                        .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(photoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel9)
                        .addGap(84, 84, 84)
                        .addComponent(birthDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel10)
                        .addGap(63, 63, 63)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel11)
                        .addGap(61, 61, 61)
                        .addComponent(proofIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(proofIdNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(refreshBtn)
                        .addGap(58, 58, 58)
                        .addComponent(submitBtn)
                        .addGap(227, 227, 227))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLabel))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(accountNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6))
                            .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(photoBtn)
                        .addGap(48, 48, 48)
                        .addComponent(signLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(signBtn)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9))
                    .addComponent(birthDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10))
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11))
                    .addComponent(proofIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(proofIdNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshBtn)
                    .addComponent(submitBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void photoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon(filename);
        icon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        imageLabel.setIcon(icon);       
        filename = filename.replace("\\", "\\\\");
    }//GEN-LAST:event_photoBtnActionPerformed

    private void signBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signBtnActionPerformed
       JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        signfilename = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon(signfilename);
        icon.getImage().getScaledInstance(signLabel.getWidth(), signLabel.getHeight(), Image.SCALE_SMOOTH);
        signLabel.setIcon(icon);       
              
    }//GEN-LAST:event_signBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        
        this.accountNoField.setText("");
        this.nameField.setText("");
        this.addressArea.setText("");
        this.contactField.setText("");
        this.emailField.setText("");
        this.proofIdNoField.setText("");
        this.imageLabel.setText("");
        this.signLabel.setText("");
        this.balanceField.setText("");
        this.imageLabel.setIcon(null);
        this.signLabel.setIcon(null);
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void balanceFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_balanceFieldFocusLost
        
    }//GEN-LAST:event_balanceFieldFocusLost

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
                
//        Controller controller = new Controller();
//        controller.createAccount();

        Date date = new Date();
        String Date = new SimpleDateFormat("yyyy-MM-dd").format(date);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String birthDate = dateFormat.format(birthDateChooser.getDate());
        
    try{
        
    Connection con = DatabaseConnection.getConnection();
    
    String url = "INSERT INTO accounts(account_no,name,address,contact,type,gender,birth_date,email_id,id_proof,id_proof_no,balance,image,sign,created_at) "
            + "VALUES('"+accountNoField.getText()+"','"+nameField.getText()+"','"+addressArea.getText()+"','"+contactField.getText()+"','"+(String) typeComboBox.getEditor().getItem()+"','"+(String) genderComboBox.getEditor().getItem()+"','"+birthDate+"','"+emailField.getText()+"','"+ (String) proofIdComboBox.getEditor().getItem()+"','"+proofIdNoField.getText()+"','"+Integer.valueOf(balanceField.getText())+"','"+filename+"','"+signfilename+"','"+Date+"');";
    
    Statement st = con.createStatement();
    st.executeUpdate(url);
    JOptionPane.showMessageDialog(null, "Successfully Created !");
    
    }catch(ClassNotFoundException | SQLException e){
        System.out.println(e);
       JOptionPane.showMessageDialog(null,"There has been an ERROR ! Sorry ! Try Again.");
    }
                
    }//GEN-LAST:event_submitBtnActionPerformed
    
    
    
//    public void setUserLabel(String userId){
//        userLabel.setText("User : "+userId);
//    }
//    
//    public String getImageFilePath(){
//        return filename;
//    }
//    
//    public String getSignFilePath(){
//        return signfilename;
//    }
//    
//    public String getAccountNo(){
//        return accountNoField.getText();
//    }
//    
//    public String getFullname(){
//        return nameField.getText();
//    }
//    
//    public String getAddress(){
//        return addressArea.getText();
//    }
//    
//    public String getContact(){
//        return contactField.getText();
//    }
//    
//    public String getAccountType(){
//        return (String) typeComboBox.getEditor().getItem();
//    }
//    
//    public String getGender(){
//        return (String) genderComboBox.getEditor().getItem();
//    }
//    
//    public String getBirthDate(){ 
//        
////        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
////        String strDate = dateFormat.format(birthDateChooser.getDate());
////        System.out.println(strDate);
//        return "";
//    }
//    
//    public String getEmail(){
//        return emailField.getText();
//    }
//    
//    public String getProofId(){
//        return (String) proofIdComboBox.getEditor().getItem();
//    }
//    
//    public String getProofIdNo(){
//        return proofIdNoField.getText();
//    }
//    
//    public int getBalance(){
//        int a;  
//        try{
//             a = Integer.valueOf(balanceField.getText());
//             return a;
//        }catch(NumberFormatException e){
//          return 1;   
//        }
//            
//    }
    
    
  
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNoField;
    private javax.swing.JTextArea addressArea;
    private javax.swing.JTextField balanceField;
    private com.toedter.calendar.JDateChooser birthDateChooser;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField emailField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton photoBtn;
    private javax.swing.JComboBox<String> proofIdComboBox;
    private javax.swing.JTextField proofIdNoField;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton signBtn;
    private javax.swing.JLabel signLabel;
    public javax.swing.JButton submitBtn;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
