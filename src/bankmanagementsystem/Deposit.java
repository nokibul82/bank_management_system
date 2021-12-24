
package bankmanagementsystem;

import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Deposit extends javax.swing.JPanel {

    
    public Deposit() {
        initComponents();
        setBounds(300,0,900,700);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searceBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        accountField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        typeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        balanceField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        refreshBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        depositTypeComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        chequeNoField = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();

        searceBtn1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        searceBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_search_14px_1.png"))); // NOI18N
        searceBtn1.setText("  Search Account");

        setBackground(new java.awt.Color(190, 190, 190));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setText("Deposit");

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel7.setText("Account No :");

        accountField.setBackground(new java.awt.Color(230, 230, 230));
        accountField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setText("Name :");

        nameField.setBackground(new java.awt.Color(230, 230, 230));
        nameField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setText("Account Type :");

        typeField.setBackground(new java.awt.Color(230, 230, 230));
        typeField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel5.setText("Balance :");

        balanceField.setBackground(new java.awt.Color(230, 230, 230));
        balanceField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        searchBtn.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_search_14px_1.png"))); // NOI18N
        searchBtn.setText("  Search Account");

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setText("Deposit Amount :");

        amountField.setBackground(new java.awt.Color(230, 230, 230));
        amountField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        refreshBtn.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_refresh_20px.png"))); // NOI18N
        refreshBtn.setText("Refresh");

        submitBtn.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        submitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_Done_20px_1.png"))); // NOI18N
        submitBtn.setText("Submit");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel6.setText("Deposit Type :");

        depositTypeComboBox.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        depositTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cheque", "ByCash" }));

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel8.setText("Cheque No :");

        chequeNoField.setBackground(new java.awt.Color(230, 230, 230));
        chequeNoField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(396, 396, 396))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(refreshBtn)
                        .addGap(29, 29, 29)
                        .addComponent(submitBtn)
                        .addGap(365, 365, 365))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(amountField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(accountField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(typeField)
                                    .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(balanceField)
                                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(depositTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chequeNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(92, 92, 92)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(accountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(searchBtn)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(typeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(depositTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(chequeNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(refreshBtn))
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public String getAccountFeild(){
        return accountField.getText();
    }
    
    public void setNameField(String name){
        nameField.setText(name);
    }
    
    public void setTypeField(String type){
        typeField.setText(type);
    }
    
    public void setBalanceField(String balance){
        balanceField.setText(balance);
    }
    
    public String getDepositdrawType(){
        return (String) depositTypeComboBox.getEditor().getItem();
    }
    
    public String getChequeNoField(){
        return chequeNoField.getText();
    }
    
    public int getAmountField(){
        try{
            
             int a = Integer.parseInt(amountField.getText());
        if(a<0){
            JOptionPane.showMessageDialog(null,"Please enter positive number");
            return 0;
        }else{
        return a;
        }
            
        }catch(HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Please enter a valid number. Don't use character.");
            return 0;
        }
                   
    }
    
    public void setImageLabel(ImageIcon icon){
        imageLabel.setIcon(icon);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountField;
    private javax.swing.JTextField amountField;
    private javax.swing.JTextField balanceField;
    private javax.swing.JTextField chequeNoField;
    private javax.swing.JComboBox<String> depositTypeComboBox;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton searceBtn1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField typeField;
    // End of variables declaration//GEN-END:variables
}
