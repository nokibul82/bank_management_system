
package bankmanagementsystem;

import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CustomerList extends javax.swing.JPanel {
    
    
   
    public CustomerList() {
        initComponents();
        setBounds(300,0,900,700);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        accountField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        allBtn = new javax.swing.JButton();
        searchBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(190, 190, 190));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setText("Customer List");

        jTable.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account No", "Name", "Account Type", "Phone", "Proof Id", "Proof Id No", "Created at"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.setName(""); // NOI18N
        jTable.setRowHeight(18);
        jScrollPane1.setViewportView(jTable);

        accountField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setText("Account No :");

        allBtn.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        allBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_search_14px_1.png"))); // NOI18N
        allBtn.setText("All Customer");
        allBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allBtnActionPerformed(evt);
            }
        });

        searchBtn1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        searchBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_search_14px_1.png"))); // NOI18N
        searchBtn1.setText("Search Customer");
        searchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(310, 310, 310))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(accountField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn1)
                        .addGap(52, 52, 52)
                        .addComponent(allBtn)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(allBtn)
                    .addComponent(searchBtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void allBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allBtnActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jTable.getModel();
        tblModel.setRowCount(0);   
        try{
        
    Connection con = DatabaseConnection.getConnection();
    
    String url ="Select account_no,name,type,contact,id_proof,id_proof_no,created_at from accounts ";
    
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(url);
        
    while(rs.next()){
        String account = rs.getString("account_no");
        String name = rs.getString("name");       
        String type = rs.getString("type");
        String phone = rs.getString("contact");
        String proof = rs.getString("id_proof");
        String proofNo = rs.getString("id_proof_no");
        String date = rs.getString("created_at");
        String rowData[] = {account,name,type,phone,proof,proofNo,date};
        tblModel.addRow(rowData);
    }
    
    
        
    
    }catch(ClassNotFoundException | SQLException e){
       System.out.println(e);
       JOptionPane.showMessageDialog(this,"There has been an ERROR ! Sorry ! Try Again.");
    }
    }//GEN-LAST:event_allBtnActionPerformed

    private void searchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn1ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jTable.getModel();
        tblModel.setRowCount(0);      
        try{
        
    Connection con = DatabaseConnection.getConnection();
    
    String url ="Select account_no,name,type,contact,id_proof,id_proof_no,created_at from accounts WHERE account_no='"+accountField.getText()+"'";
    
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(url);
        
    while(rs.next()){
        String account = rs.getString("account_no");
        String name = rs.getString("name");       
        String type = rs.getString("type");
        String phone = rs.getString("contact");
        String proof = rs.getString("id_proof");
        String proofNo = rs.getString("id_proof_no");
        String date = rs.getString("created_at");
        String rowData[] = {account,name,type,phone,proof,proofNo,date};
        tblModel.addRow(rowData);
    }
    
    
        
    
    }catch(ClassNotFoundException | SQLException e){
       System.out.println(e);
       JOptionPane.showMessageDialog(this,"There has been an ERROR ! Sorry ! Try Again.");
    }
              
              
    }//GEN-LAST:event_searchBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountField;
    private javax.swing.JButton allBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton searchBtn1;
    // End of variables declaration//GEN-END:variables
}
