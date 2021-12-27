package bankmanagementsystem;

import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TransactionHistory extends javax.swing.JPanel {

    
    public TransactionHistory() {
        initComponents();
        setBounds(300,0,900,700);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        typeField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        accountField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        dateSearchBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(190, 190, 190));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setText("Transaction History");

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setText("Account Type :");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setText("Name :");

        nameField.setBackground(new java.awt.Color(230, 230, 230));
        nameField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        typeField.setBackground(new java.awt.Color(230, 230, 230));
        typeField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        searchBtn.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_search_14px_1.png"))); // NOI18N
        searchBtn.setText("  Search Account");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        accountField.setBackground(new java.awt.Color(230, 230, 230));
        accountField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel7.setText("Account No :");

        jTable1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Account No", "Date", "Transaction", "Cheque No", "Amount", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setText("Start Date :");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel5.setText("End Date :");

        startDateChooser.setBackground(new java.awt.Color(230, 230, 230));

        endDateChooser.setBackground(new java.awt.Color(230, 230, 230));

        dateSearchBtn.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        dateSearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_search_14px_1.png"))); // NOI18N
        dateSearchBtn.setText("Search ");
        dateSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateSearchBtnActionPerformed(evt);
            }
        });

        printBtn.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        printBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_print_18px.png"))); // NOI18N
        printBtn.setText("Print");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(accountField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateSearchBtn))
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(printBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(accountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchBtn)
                            .addComponent(jLabel2)))
                    .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(typeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(dateSearchBtn)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(printBtn)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        tblModel.setRowCount(0);
        try{
        
            Connection con = DatabaseConnection.getConnection();
    
            String url1 ="Select name,type from accounts WHERE account_no ='"+getAccount()+"'";
            String url2 ="SELECT transaction_id, account_no, date, transaction,cheque_no,amount,balance from transactions where account_no = '"+getAccount()+"'"; 
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(url1);
            if(rs.next()){
                String name = rs.getString("name");
                setName(name);
                String type = rs.getString("type");
                setType(type);
            }
            
            rs = st.executeQuery(url2);
            
            while(rs.next()){
                String transactionNo = rs.getString("transaction_id");
                String account = rs.getString("account_no");
                String date = rs.getString("date");
                String transaction = rs.getString("transaction");
                String cheque_no = rs.getString("cheque_no");
                String amount = rs.getString("amount");
                String balance = rs.getString("balance");
            
                String rowData[] = {transactionNo,account,date,transaction,cheque_no,amount,balance};
                tblModel.addRow(rowData);
                }
    
            }catch(ClassNotFoundException | SQLException e){
                System.out.println(e);
                JOptionPane.showMessageDialog(this,"There has been an ERROR ! Sorry ! Try Again.");
            }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void dateSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateSearchBtnActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        tblModel.setRowCount(0);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String startDate = dateFormat.format(startDateChooser.getDate());
        String endDate = dateFormat.format(endDateChooser.getDate());
        
        try{
           
            Connection con = DatabaseConnection.getConnection();
            String url ="SELECT transaction_id, account_no, date, transaction,cheque_no,amount,balance FROM transactions WHERE account_no = '"+getAccount()+"' AND date BETWEEN '"+startDate+"' AND '"+endDate+"'"; 
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(url);
            
            while(rs.next()){
                String transactionNo = rs.getString("transaction_id");
                String account = rs.getString("account_no");
                String date = rs.getString("date");
                String transaction = rs.getString("transaction");
                String cheque_no = rs.getString("cheque_no");
                String amount = rs.getString("amount");
                String balance = rs.getString("balance");
            
                String rowData[] = {transactionNo,account,date,transaction,cheque_no,amount,balance};
                tblModel.addRow(rowData);
                }
            
            
            
        }catch(ClassNotFoundException | SQLException e){
            
        }
    }//GEN-LAST:event_dateSearchBtnActionPerformed

    public String getAccount(){
        return accountField.getText();
    }
    
    public void setName(String name){
        nameField.setText(name);
    }
    
    public void setType(String type){
        typeField.setText(type);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountField;
    private javax.swing.JButton dateSearchBtn;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton printBtn;
    private javax.swing.JButton searchBtn;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JTextField typeField;
    // End of variables declaration//GEN-END:variables
}
