
package oodj.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import oodj.roles.adminMenu;
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        studentPass = new javax.swing.JPasswordField();
        studentLoginBtn = new javax.swing.JButton();
        studentUser = new javax.swing.JLabel();
        studentPw = new javax.swing.JLabel();
        studentNamemail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        staffLoginBtn = new javax.swing.JButton();
        staffUser = new javax.swing.JLabel();
        staffPw = new javax.swing.JLabel();
        staffNamemail = new javax.swing.JTextField();
        staffPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 204));

        jPanel3.setBackground(new java.awt.Color(175, 133, 133));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTabbedPane1.setBackground(new java.awt.Color(110, 87, 87));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(110, 87, 87));

        studentLoginBtn.setText("Login");
        studentLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLoginBtnActionPerformed(evt);
            }
        });

        studentUser.setBackground(new java.awt.Color(221, 221, 221));
        studentUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        studentUser.setText("Enter username or email");

        studentPw.setBackground(new java.awt.Color(221, 221, 221));
        studentPw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        studentPw.setText("Enter password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(studentLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(studentPw)
                            .addComponent(studentUser))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentPass, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(studentNamemail))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentUser)
                    .addComponent(studentNamemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentPw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(studentLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jTabbedPane1.addTab("Student", jPanel1);

        jPanel2.setBackground(new java.awt.Color(110, 87, 87));

        staffLoginBtn.setText("Login");
        staffLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffLoginBtnActionPerformed(evt);
            }
        });

        staffUser.setBackground(new java.awt.Color(221, 221, 221));
        staffUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        staffUser.setText("Enter username or email");

        staffPw.setBackground(new java.awt.Color(221, 221, 221));
        staffPw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(staffLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(staffPw)
                            .addComponent(staffUser))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(staffNamemail, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffPass, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffUser)
                    .addComponent(staffNamemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffPw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(staffLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jTabbedPane1.addTab("Staff", jPanel2);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Login");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                JOptionPane.showMessageDialog(this, "Invalid username / password", "Error",  JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_staffLoginBtnActionPerformed

    private void staffNamemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffNamemailActionPerformed

    }//GEN-LAST:event_staffNamemailActionPerformed

    private void studentLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentLoginBtnActionPerformed
        String namemail = studentNamemail.getText().trim();
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
                JOptionPane.showMessageDialog(this, "Invalid username / password", "Error",  JOptionPane.INFORMATION_MESSAGE);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JButton staffLoginBtn;
    private javax.swing.JTextField staffNamemail;
    private javax.swing.JPasswordField staffPass;
    private javax.swing.JLabel staffPw;
    private javax.swing.JLabel staffUser;
    public static javax.swing.JButton studentLoginBtn;
    private javax.swing.JTextField studentNamemail;
    private javax.swing.JPasswordField studentPass;
    private javax.swing.JLabel studentPw;
    private javax.swing.JLabel studentUser;
    // End of variables declaration//GEN-END:variables
}
