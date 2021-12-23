package bankmanagementsystem;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class employeeHome extends javax.swing.JFrame {

   
    CreateAccount createPanel = new CreateAccount();
    CheckBalance updatePanel = new CheckBalance();
    Transfer transferPanel = new Transfer();
    Withdraw withdrawPanel = new Withdraw();
    Deposit depositPanel = new Deposit();
    TransactionHistory historyPanel = new TransactionHistory();
    CustomerList listPanel = new CustomerList();
    Welcome welcomePanel = new Welcome();
    
    public employeeHome() {
        initComponents();
        add(welcomePanel);
        add(createPanel);
        add(updatePanel);
        add(transferPanel);
        add(withdrawPanel);
        add(depositPanel);
        add(historyPanel);
        add(listPanel);
        unseenAll();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        createBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        transferBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        withdrawBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        depositBtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        historyBtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        listBtn = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 700));

        jLabel1.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/iconmonstr-coin-2-72.png"))); // NOI18N
        jLabel1.setText("   Sudo Bank");
        jLabel1.setPreferredSize(new java.awt.Dimension(179, 40));

        createBtn.setBackground(new java.awt.Color(220, 220, 220));
        createBtn.setPreferredSize(new java.awt.Dimension(300, 70));
        createBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createBtnMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_create_24px_1.png"))); // NOI18N
        jLabel2.setText("   Create Account");
        jLabel2.setPreferredSize(new java.awt.Dimension(300, 70));

        javax.swing.GroupLayout createBtnLayout = new javax.swing.GroupLayout(createBtn);
        createBtn.setLayout(createBtnLayout);
        createBtnLayout.setHorizontalGroup(
            createBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createBtnLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        createBtnLayout.setVerticalGroup(
            createBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        updateBtn.setBackground(new java.awt.Color(220, 220, 220));
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateBtnMouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_stack_of_coins_32px.png"))); // NOI18N
        jLabel5.setText(" Check Balance");

        javax.swing.GroupLayout updateBtnLayout = new javax.swing.GroupLayout(updateBtn);
        updateBtn.setLayout(updateBtnLayout);
        updateBtnLayout.setHorizontalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBtnLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        updateBtnLayout.setVerticalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        transferBtn.setBackground(new java.awt.Color(220, 220, 220));
        transferBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transferBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transferBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transferBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                transferBtnMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_data_transfer_24px.png"))); // NOI18N
        jLabel3.setText("    Transfer");

        javax.swing.GroupLayout transferBtnLayout = new javax.swing.GroupLayout(transferBtn);
        transferBtn.setLayout(transferBtnLayout);
        transferBtnLayout.setHorizontalGroup(
            transferBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferBtnLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transferBtnLayout.setVerticalGroup(
            transferBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        withdrawBtn.setBackground(new java.awt.Color(220, 220, 220));
        withdrawBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                withdrawBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                withdrawBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                withdrawBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                withdrawBtnMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_output_32px.png"))); // NOI18N
        jLabel4.setText("   Withdraw");

        javax.swing.GroupLayout withdrawBtnLayout = new javax.swing.GroupLayout(withdrawBtn);
        withdrawBtn.setLayout(withdrawBtnLayout);
        withdrawBtnLayout.setHorizontalGroup(
            withdrawBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawBtnLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        withdrawBtnLayout.setVerticalGroup(
            withdrawBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        depositBtn.setBackground(new java.awt.Color(220, 220, 220));
        depositBtn.setPreferredSize(new java.awt.Dimension(300, 70));
        depositBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depositBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                depositBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                depositBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                depositBtnMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_input_32px.png"))); // NOI18N
        jLabel6.setText("   Deposit");

        javax.swing.GroupLayout depositBtnLayout = new javax.swing.GroupLayout(depositBtn);
        depositBtn.setLayout(depositBtnLayout);
        depositBtnLayout.setHorizontalGroup(
            depositBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositBtnLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        depositBtnLayout.setVerticalGroup(
            depositBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        historyBtn.setBackground(new java.awt.Color(220, 220, 220));
        historyBtn.setPreferredSize(new java.awt.Dimension(300, 70));
        historyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                historyBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                historyBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                historyBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                historyBtnMouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_transaction_32px.png"))); // NOI18N
        jLabel7.setText("  Transation History");

        javax.swing.GroupLayout historyBtnLayout = new javax.swing.GroupLayout(historyBtn);
        historyBtn.setLayout(historyBtnLayout);
        historyBtnLayout.setHorizontalGroup(
            historyBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historyBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        historyBtnLayout.setVerticalGroup(
            historyBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        listBtn.setBackground(new java.awt.Color(220, 220, 220));
        listBtn.setPreferredSize(new java.awt.Dimension(300, 70));
        listBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listBtnMouseReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_list_32px.png"))); // NOI18N
        jLabel8.setText("  Customer List");

        javax.swing.GroupLayout listBtnLayout = new javax.swing.GroupLayout(listBtn);
        listBtn.setLayout(listBtnLayout);
        listBtnLayout.setHorizontalGroup(
            listBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listBtnLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listBtnLayout.setVerticalGroup(
            listBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        logoutBtn.setBackground(new java.awt.Color(220, 220, 220));
        logoutBtn.setPreferredSize(new java.awt.Dimension(300, 70));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutBtnMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankmanagementsystem/icons/icons8_Logout_32px_2.png"))); // NOI18N
        jLabel9.setText("   Log out");

        javax.swing.GroupLayout logoutBtnLayout = new javax.swing.GroupLayout(logoutBtn);
        logoutBtn.setLayout(logoutBtnLayout);
        logoutBtnLayout.setHorizontalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutBtnLayout.setVerticalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(withdrawBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(transferBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(depositBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(listBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(historyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(transferBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(withdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(depositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(listBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(898, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBtnMouseEntered
        createBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_createBtnMouseEntered

    private void createBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBtnMouseExited
        createBtn.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_createBtnMouseExited

    private void createBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBtnMousePressed
        createBtn.setBackground(new Color(185,185,185));
        optionClickedFor(createPanel);
    }//GEN-LAST:event_createBtnMousePressed

    private void createBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBtnMouseReleased
        createBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_createBtnMouseReleased

    private void transferBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferBtnMouseEntered
        transferBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_transferBtnMouseEntered

    private void transferBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferBtnMouseExited
        transferBtn.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_transferBtnMouseExited

    private void withdrawBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawBtnMouseEntered
        withdrawBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_withdrawBtnMouseEntered

    private void withdrawBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawBtnMouseExited
        withdrawBtn.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_withdrawBtnMouseExited

    private void updateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseEntered
        updateBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_updateBtnMouseEntered

    private void updateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseExited
        updateBtn.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_updateBtnMouseExited

    private void updateBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMousePressed
        updateBtn.setBackground(new Color(185,185,185));
        optionClickedFor(updatePanel);
    }//GEN-LAST:event_updateBtnMousePressed

    private void updateBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseReleased
        updateBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_updateBtnMouseReleased

    private void transferBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferBtnMousePressed
        transferBtn.setBackground(new Color(185,185,185));
        optionClickedFor(transferPanel);
    }//GEN-LAST:event_transferBtnMousePressed

    private void transferBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferBtnMouseReleased
       transferBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_transferBtnMouseReleased

    private void withdrawBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawBtnMousePressed
         withdrawBtn.setBackground(new Color(185,185,185));
         optionClickedFor(withdrawPanel);
    }//GEN-LAST:event_withdrawBtnMousePressed

    private void withdrawBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawBtnMouseReleased
        withdrawBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_withdrawBtnMouseReleased

    private void depositBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositBtnMouseEntered
        depositBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_depositBtnMouseEntered

    private void depositBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositBtnMouseExited
        depositBtn.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_depositBtnMouseExited

    private void depositBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositBtnMousePressed
        depositBtn.setBackground(new Color(185,185,185));
        optionClickedFor(depositPanel);
    }//GEN-LAST:event_depositBtnMousePressed

    private void depositBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositBtnMouseReleased
        depositBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_depositBtnMouseReleased

    private void historyBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyBtnMouseEntered
        historyBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_historyBtnMouseEntered

    private void historyBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyBtnMouseExited
        historyBtn.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_historyBtnMouseExited

    private void historyBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyBtnMousePressed
        historyBtn.setBackground(new Color(185,185,185));
        optionClickedFor(historyPanel);
    }//GEN-LAST:event_historyBtnMousePressed

    private void historyBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyBtnMouseReleased
         historyBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_historyBtnMouseReleased

    private void listBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBtnMouseEntered
       listBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_listBtnMouseEntered

    private void listBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBtnMouseExited
        listBtn.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_listBtnMouseExited

    private void listBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBtnMousePressed
        listBtn.setBackground(new Color(185,185,185));
        optionClickedFor(listPanel);
    }//GEN-LAST:event_listBtnMousePressed

    private void listBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBtnMouseReleased
        listBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_listBtnMouseReleased

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        logoutBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutBtn.setBackground(new Color(220,220,220));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void logoutBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMousePressed
        logoutBtn.setBackground(new Color(185,185,185));
        if(JOptionPane.showConfirmDialog(null, "Do you want to logout ?")==0){
            Register register = new Register();
            register.setVisible(true);
            employeeHome.this.dispose();
        }
    }//GEN-LAST:event_logoutBtnMousePressed

    private void logoutBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseReleased
        logoutBtn.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_logoutBtnMouseReleased

    
    
        
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeHome().setVisible(true);
            }
        });
        
        
    }
    public void unseenAll(){
        createPanel.setVisible(false);
        updatePanel.setVisible(false);
        transferPanel.setVisible(false);
        withdrawPanel.setVisible(false);
        depositPanel.setVisible(false);
        historyPanel.setVisible(false);
        listPanel.setVisible(false);
    }
    
    public void optionClickedFor(JPanel panel){
        unseenAll();   
        welcomePanel.setVisible(false);
        panel.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel createBtn;
    private javax.swing.JPanel depositBtn;
    private javax.swing.JPanel historyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel listBtn;
    private javax.swing.JPanel logoutBtn;
    private javax.swing.JPanel transferBtn;
    private javax.swing.JPanel updateBtn;
    private javax.swing.JPanel withdrawBtn;
    // End of variables declaration//GEN-END:variables
}
