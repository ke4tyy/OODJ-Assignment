package oodj.roles;
import oodj.assignment.Assignment;
import oodj.assignment.userAttribute;
import oodj.roles.studentCheckform;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import oodj.assignment.loginselection;

public class studentMenu extends userAttribute {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Student stud = new Student();
    public static String Id;
    public static String Name;
    public static String Mail;
    public static String Pw;
    public static String Intake;
    
    //declare
    public studentMenu() {   
        initComponents();
        jLabel1.setText("Welcome back, " + stud.studName + "!");
        assignedProj();
        setLocationRelativeTo(null);    
        setVisible(true);
    }

    public studentMenu(String id, String name, String mail, String pass, String intake) {  
        initComponents();
        Id = id;
        Name = name;
        Mail = mail;
        Pw = pass;
        Intake = intake; 
        jLabel1.setText("Welcome back, " + stud.studName + "!");
        assignedProj();
        setLocationRelativeTo(null);    
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        subProj = new javax.swing.JLabel();
        subLink = new javax.swing.JLabel();
        subMoodleLink = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        subProjBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        editProjBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        linkTxt = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        reqProjBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        requestButton = new javax.swing.JButton();
        reqCalendar = new com.toedter.calendar.JCalendar();
        jPanel4 = new javax.swing.JPanel();
        checkProjBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        checkButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        changeOldpass = new javax.swing.JLabel();
        changeNewpass = new javax.swing.JLabel();
        changeCfm = new javax.swing.JLabel();
        changeButton = new javax.swing.JButton();
        changeOldTxt = new javax.swing.JTextPane();
        changeCfmTxt = new javax.swing.JTextPane();
        changeNewTxt = new javax.swing.JTextPane();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(175, 133, 133));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Welcome, ");

        jTabbedPane1.setBackground(new java.awt.Color(215, 171, 171));

        jPanel1.setBackground(new java.awt.Color(110, 87, 87));

        subProj.setText("Choose project:");

        subLink.setText("Enter submission moodle link:");

        subMoodleLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMoodleLinkActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Submit assignment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel4)
                .addGap(0, 267, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subLink, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subProj, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subMoodleLink)
                    .addComponent(subProjBox, 0, 232, Short.MAX_VALUE))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subProjBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subProj))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subLink)
                    .addComponent(subMoodleLink, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        jTabbedPane1.addTab("Submit Project", jPanel1);

        jPanel2.setBackground(new java.awt.Color(110, 87, 87));

        jLabel2.setText("Select project: ");

        editProjBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProjBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Moodle Link:");

        editButton.setText("Submit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel3)
                                    .addGap(134, 134, 134)
                                    .addComponent(linkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(134, 134, 134)
                                    .addComponent(editProjBox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(238, 238, 238)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(171, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(editProjBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(linkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(77, 77, 77)))
        );

        jTabbedPane1.addTab("Edit Project", jPanel2);

        jPanel3.setBackground(new java.awt.Color(110, 87, 87));

        jLabel5.setText("Choose project");

        jLabel6.setText("Select Date");

        requestButton.setText("Submit");
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(reqProjBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reqCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(reqProjBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(reqCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("Request Presentation Date", jPanel3);

        jPanel4.setBackground(new java.awt.Color(110, 87, 87));

        jLabel8.setText("Choose project");

        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(181, 181, 181)
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                    .addComponent(checkProjBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(162, 162, 162)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkProjBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addContainerGap(244, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Check Submission Status", jPanel4);

        jPanel5.setBackground(new java.awt.Color(110, 87, 87));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Change password");

        changeOldpass.setText("Enter old password: ");

        changeNewpass.setText("Enter new password: ");

        changeCfm.setText("Confirm new password: ");

        changeButton.setText("Change");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(changeCfm, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeNewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeOldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeOldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeNewTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeCfmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(72, 72, 72)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeOldpass)
                    .addComponent(changeOldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeNewpass)
                    .addComponent(changeNewTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(changeCfm)
                    .addComponent(changeCfmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change Password", jPanel5);

        logoutBtn.setText("log out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addContainerGap())
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(logoutBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        loginselection log = new loginselection();
        dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void subMoodleLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMoodleLinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMoodleLinkActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String link = subMoodleLink.getText().trim();      
        try (BufferedReader reader = new BufferedReader(new FileReader(Assignment.submission))) {
            String line;

            boolean hasDuplicate = false;

            while ((line = reader.readLine()) != null) {
                String[] split = line.split(", ");

                if (split[0].equals(stud.studID) && split[1].equals(subProjBox.getSelectedItem().toString())) {
                    hasDuplicate = true;
                    break;
                }
            }

            if (hasDuplicate) {
                JOptionPane.showMessageDialog(this, "There is already an existing submission for this project", "Error",  JOptionPane.INFORMATION_MESSAGE);
            } else if (link.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Submission link cannot be empty", "Error",  JOptionPane.INFORMATION_MESSAGE);
            } else {

                String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(Assignment.submission, true))) {
                    writer.write(stud.studID + ", " + subProjBox.getSelectedItem().toString() + ", " + date + ", " + link + ", " + null);
                    writer.newLine();
                }
                catch (IOException e) {
                    System.out.println("error: " + e);
                }
                JOptionPane.showMessageDialog(this, "Submitted", "Success",  JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void editProjBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProjBoxActionPerformed
        linkTxt.setText(null);
        try ( BufferedReader reader = new BufferedReader(new FileReader(Assignment.submission))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] project = line.split(", ");

                if (project[0].equals(stud.studID) && project[1].equals(editProjBox.getSelectedItem())) {
                    linkTxt.setText(project[3]);
                }
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_editProjBoxActionPerformed

      
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (linkTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Submission link cannot be empty", "Error",  JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            try {
                // Read the file
                BufferedReader reader = new BufferedReader(new FileReader(Assignment.submission));
                StringBuilder build = new StringBuilder();
                String line;
                String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                while ((line = reader.readLine()) != null) {
                    String[] col = line.split(", ");
                    if (col[0].equals(stud.studID) && col[1].equals(editProjBox.getSelectedItem())) {
                        col[3] = linkTxt.getText();
                        col[2] = date;
                        build.append(String.join(", ", col)).append("\n");
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "You have no submission of this project yet", "Error",  JOptionPane.INFORMATION_MESSAGE);
                    }

                }
                reader.close();

                BufferedWriter writer = new BufferedWriter(new FileWriter(Assignment.submission));
                writer.write(build.toString());
                writer.close();
                JOptionPane.showMessageDialog(this, "Editted", "Success",  JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_editButtonActionPerformed

    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed

        try (BufferedReader reader = new BufferedReader(new FileReader(Assignment.request))) {
            String line;

            boolean hasDuplicate = false;

            while ((line = reader.readLine()) != null) {
                String[] split = line.split(", ");

                if (split[0].equals(stud.studID) && split[1].equals(reqProjBox.getSelectedItem().toString())) {
                    hasDuplicate = true;
                    break;
                }
            }

            if (hasDuplicate) {
                JOptionPane.showMessageDialog(this, "There is already an existing request to this project", "Error",  JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                String projDate = dateFormat.format(reqCalendar.getDate());
                String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(Assignment.request, true))) {
                    writer.write(stud.studID + ", " + reqProjBox.getSelectedItem().toString() + ", " + currentDate + ", " + projDate + ", " + "pending");
                    writer.newLine();
                    JOptionPane.showMessageDialog(this, "Request submitted", "Success",  JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException e) {
                    System.out.println("Error: " + e);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_requestButtonActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed

        if ("".equals(checkProjBox.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Please select a project", "Error",  JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            try ( BufferedReader reader = new BufferedReader(new FileReader(Assignment.submission))){
                String line;
                boolean submitted = false;
                while ((line = reader.readLine()) != null) {
                    String[] sub = line.split(", ");

                    if (sub[0].equals(stud.studID) && sub[1].equals(checkProjBox.getSelectedItem())) {

                        studentCheckform form = new studentCheckform(sub[0], sub[1], sub[3], sub[4]);
                        submitted = true;
                        dispose();
                        break;

                    }

                }
                if (!submitted) {
                    JOptionPane.showMessageDialog(this, "You have not submitted", "Error",  JOptionPane.INFORMATION_MESSAGE);
                }

            }

            catch (IOException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_checkButtonActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        changePassword(changeOldTxt, changeNewTxt, changeCfmTxt, Assignment.student, Student.studID);
    }//GEN-LAST:event_changeButtonActionPerformed

    private void assignedProj() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Assignment.assessment));
            String line;
            String id = "";
            boolean atleast1 = false;
            while ((line = reader.readLine()) != null) {
                String[] proj = line.split(", ");
                if (stud.studID.equals(proj[0])) {
                    subProjBox.addItem(proj[1]);
                    editProjBox.addItem(proj[1]);
                    reqProjBox.addItem(proj[1]);
                    checkProjBox.addItem(proj[1]);
                    atleast1 = true;
                } 
            }
            if (!atleast1) {
                JOptionPane.showMessageDialog(this, "There is no ongoing assessment", "Error",  JOptionPane.INFORMATION_MESSAGE);
            } 
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeButton;
    private javax.swing.JLabel changeCfm;
    private javax.swing.JTextPane changeCfmTxt;
    private javax.swing.JTextPane changeNewTxt;
    private javax.swing.JLabel changeNewpass;
    private javax.swing.JTextPane changeOldTxt;
    private javax.swing.JLabel changeOldpass;
    private javax.swing.JButton checkButton;
    private javax.swing.JComboBox<String> checkProjBox;
    private javax.swing.JButton editButton;
    private javax.swing.JComboBox<String> editProjBox;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField linkTxt;
    private javax.swing.JButton logoutBtn;
    private com.toedter.calendar.JCalendar reqCalendar;
    private javax.swing.JComboBox<String> reqProjBox;
    private javax.swing.JButton requestButton;
    private javax.swing.JLabel subLink;
    private javax.swing.JTextField subMoodleLink;
    private javax.swing.JLabel subProj;
    private javax.swing.JComboBox<String> subProjBox;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
