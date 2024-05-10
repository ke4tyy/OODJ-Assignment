
package oodj.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import oodj.roles.adminMenu;
import oodj.assignment.*;
import oodj.roles.lecturerMenu;
import oodj.roles.managerMenu;
import oodj.roles.studentMenu;

public class loginselection extends userAttribute {
    public static String id;
    public static String name;
    public static String mail;
    public static String pw;
    public static String intake;
    
    public loginselection() {
        initComponents();
        setLocationRelativeTo(null);    
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        studentUser = new javax.swing.JLabel();
        studentPw = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        studentLoginBtn = new javax.swing.JButton();
        studentPass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        staffLoginBtn = new javax.swing.JButton();
        staffUser = new javax.swing.JLabel();
        staffPw = new javax.swing.JLabel();
        staffNamemail = new javax.swing.JTextField();
        staffPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Login");

        studentUser.setText("Enter username or email");

        studentPw.setText("Enter password");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        studentLoginBtn.setText("Login");
        studentLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(studentLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(studentPass, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(studentPw, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(studentUser, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(67, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(studentPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(studentLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentUser)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addComponent(studentPw)
                    .addContainerGap(228, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Student", jPanel1);

        staffLoginBtn.setText("Login");
        staffLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffLoginBtnActionPerformed(evt);
            }
        });

        staffUser.setText("Enter username or email");

        staffPw.setText("Enter password");

        staffNamemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffNamemailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(staffLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(staffPass, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(staffPw, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(staffUser, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(staffNamemail, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(67, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(staffPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(staffLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(staffUser)
                        .addComponent(staffNamemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addComponent(staffPw)
                    .addContainerGap(228, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Staff", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(286, 286, 286))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffLoginBtnActionPerformed

        String namemail = staffNamemail.getText();
        char[] p = staffPass.getPassword();
        String password = new String(p);
        String role = "";

        boolean login = false;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(Assignment.user));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] user = line.split(", ");
                if (user[1].toLowerCase().equals(namemail.toLowerCase().trim()) || user[2].equals(namemail.trim())) {
                    if (user[3].equals(password)) {
                        id = user[0];
                        name = user[1];
                        mail = user[2];
                        pw = user[3];
                        
                        role = user[4];
                        login = true;
                        switch (role) {
                            case "a":
                            adminMenu adm = new adminMenu(user[0], user[1], user[2], user[3]);
                            dispose();
                            break;
                            
                            case "l":
                            lecturerMenu lect = new lecturerMenu(user[0], user[1], user[2], user[3]);
                            dispose();
                            break;
                            
                            case "p":
                            managerMenu proj = new managerMenu(user[0], user[1], user[2], user[3]);
                            dispose();
                            break;
                        }
                        break;
                    }
                }
            }
            if (!login) {
                new statusCheck("invalid username or password");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_staffLoginBtnActionPerformed

    private void staffNamemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffNamemailActionPerformed

    }//GEN-LAST:event_staffNamemailActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void studentLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentLoginBtnActionPerformed
        
        String namemail = jTextField1.getText().trim();
        char[] p = studentPass.getPassword();
        String password = new String(p);
        boolean login = false; 
        
        try ( BufferedReader reader = new BufferedReader(new FileReader(Assignment.student))){
            String line;

            while ((line = reader.readLine()) != null) {
                String[] user = line.split(", ");

                if (user[1].toLowerCase().equals(namemail.toLowerCase()) || user[2].equals(namemail)) {
                    if (user[3].equals(password)) {
                        id = user[0];
                        name = user[1];
                        mail = user[2];
                        pw = user[3];
                        intake = user[4];
                        
                        login = true;
                        studentMenu stud = new studentMenu(user[0], user[1], user[2], user[3], user[4]);
                        dispose();
                        break;
                    }
                }
            }

            if (!login) {
                new statusCheck("invalid username / password");
            }

        } catch (IOException e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_studentLoginBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginselection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JButton staffLoginBtn;
    private javax.swing.JTextField staffNamemail;
    private javax.swing.JPasswordField staffPass;
    private javax.swing.JLabel staffPw;
    private javax.swing.JLabel staffUser;
    public static javax.swing.JButton studentLoginBtn;
    private javax.swing.JPasswordField studentPass;
    private javax.swing.JLabel studentPw;
    private javax.swing.JLabel studentUser;
    // End of variables declaration//GEN-END:variables
}
