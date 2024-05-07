
package oodj.lecturer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import oodj.assignment.*;
import oodj.login.loginselection;

/**
 *
 * @author Choon
 */
public class lecturerMenu extends userAttribute {
    User lec = new User();
    
    public lecturerMenu() {
        initComponents();
        jLabel1.setText("Welcome back, " + lec.userName + "!");
        assignedProj();
    }
    
    
    public lecturerMenu(String id, String name, String mail, String pw) {
        initComponents();
        jLabel1.setText("Welcome back, " + lec.userName + "!");
        assignedProj();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        supProj = new javax.swing.JLabel();
        projSupBox = new javax.swing.JComboBox<>();
        supAssigned = new javax.swing.JLabel();
        supSupervisee = new javax.swing.JLabel();
        supAssignedID = new javax.swing.JLabel();
        supSuperviseeID = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        reqStud = new javax.swing.JLabel();
        reqDate = new javax.swing.JLabel();
        projReqBox = new javax.swing.JComboBox<>();
        studReqBox = new javax.swing.JComboBox<>();
        reqApprove = new javax.swing.JButton();
        reqProj = new javax.swing.JLabel();
        reqDeny = new javax.swing.JButton();
        reqDateTxt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        gradeBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        evalProj = new javax.swing.JLabel();
        evalStud = new javax.swing.JLabel();
        evalLink = new javax.swing.JLabel();
        evalMoodle = new javax.swing.JLabel();
        evalGrade = new javax.swing.JLabel();
        gradeBox = new javax.swing.JComboBox<>();
        projEvalBox = new javax.swing.JComboBox<>();
        studEvalBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        editProj = new javax.swing.JLabel();
        projEditBox = new javax.swing.JComboBox<>();
        editDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dateTxt = new javax.swing.JTextPane();
        dateTip = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        changeOldTxt = new javax.swing.JTextPane();
        changeNewTxt = new javax.swing.JTextPane();
        changeCfmTxt = new javax.swing.JTextPane();
        changeButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        changeOldpass = new javax.swing.JLabel();
        changeNewpass = new javax.swing.JLabel();
        changeCfm = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Welcome, ");

        jTabbedPane1.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("View Assigned Supervisees");

        supProj.setText("Select Project:");

        projSupBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projSupBoxActionPerformed(evt);
            }
        });

        supAssigned.setText("Assigned Supervisee:");

        supSupervisee.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        supAssignedID.setText("Assigned Supervisee ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(164, 164, 164))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(supProj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(supAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supAssignedID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(projSupBox, 0, 140, Short.MAX_VALUE)
                    .addComponent(supSupervisee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supSuperviseeID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(135, 135, 135))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supProj)
                    .addComponent(projSupBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supAssignedID)
                    .addComponent(supSuperviseeID))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supAssigned)
                    .addComponent(supSupervisee, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Assigned Supervisees", jPanel2);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Review Presentation Request");

        reqStud.setText("Select Student:");

        reqDate.setText("Requested date:");

        projReqBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projReqBoxActionPerformed(evt);
            }
        });

        studReqBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studReqBoxActionPerformed(evt);
            }
        });

        reqApprove.setText("Approve");
        reqApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqApproveActionPerformed(evt);
            }
        });

        reqProj.setText("Select Project:");

        reqDeny.setText("Deny");
        reqDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqDenyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reqStud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reqProj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reqDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(reqApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(reqDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(studReqBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)
                                    .addComponent(reqDateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(projReqBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(126, 126, 126))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reqProj)
                    .addComponent(projReqBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reqStud)
                    .addComponent(studReqBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reqDate)
                    .addComponent(reqDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reqDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reqApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Presentation Requests", jPanel3);

        gradeBtn.setText("Grade");
        gradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Evaluate Submission");

        evalProj.setText("Select Project:");

        evalStud.setText("Select Student:");

        evalLink.setText("Moodle link submitted:");

        evalMoodle.setBackground(new java.awt.Color(153, 153, 153));
        evalMoodle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        evalMoodle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        evalGrade.setText("Assign Grade:");

        gradeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.00", "1.00", "1.30", "1.70", "2.00", "2.30", "2.70", "3.00", "3.30", "3.70", "4.00" }));

        projEvalBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projEvalBoxActionPerformed(evt);
            }
        });

        studEvalBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studEvalBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 89, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(evalLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evalGrade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evalStud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evalProj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(evalMoodle, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(studEvalBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(projEvalBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(gradeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evalProj)
                    .addComponent(projEvalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evalStud)
                    .addComponent(studEvalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(evalLink)
                    .addComponent(evalMoodle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evalGrade)
                    .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(gradeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Evaluate Result", jPanel4);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("View Assigned Project");

        editProj.setText("Select Project:");

        projEditBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projEditBoxActionPerformed(evt);
            }
        });

        editDate.setText("Submission Date:");

        jScrollPane1.setViewportView(dateTxt);

        dateTip.setForeground(new java.awt.Color(153, 153, 153));
        dateTip.setText("dd-mm-yyyy");

        editBtn.setText("Confirm Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(189, 189, 189))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editDate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(editProj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projEditBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editProj)
                        .addGap(40, 40, 40)
                        .addComponent(editDate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(projEditBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateTip)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Assigned Project", jPanel1);

        changeButton.setText("Change");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Change password");

        changeOldpass.setText("Enter old password: ");

        changeNewpass.setText("Enter new password: ");

        changeCfm.setText("Confirm new password: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(94, 94, 94))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(changeCfm, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(changeNewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(changeOldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(changeOldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(changeNewTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(changeCfmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))))
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
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change Password", jPanel5);

        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(logoutBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projEvalBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projEvalBoxActionPerformed
        subCheck(projEvalBox, studEvalBox, "no student have submitted.", Assignment.submission);
    }//GEN-LAST:event_projEvalBoxActionPerformed

    private void studEvalBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studEvalBoxActionPerformed
            try (BufferedReader reader = new BufferedReader(new FileReader(Assignment.submission))){
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] sub = line.split(", ");
                    if (studEvalBox.getSelectedItem().equals("")) {
                        statusCheck wrong = new statusCheck(false, "no one had submitted.");
                    }
                    else if (sub[0].equals(studEvalBox.getSelectedItem().toString()) && sub[1].equals(projEvalBox.getSelectedItem().toString())) {
                        evalMoodle.setText(sub[3]);
                    }
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
            }        
    }//GEN-LAST:event_studEvalBoxActionPerformed

    private void gradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeBtnActionPerformed

        String grade = (String) gradeBox.getSelectedItem();
        try {

            BufferedReader reader = new BufferedReader(new FileReader(Assignment.submission));
            StringBuilder build = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] col = line.split(", ");
                if (col[0].equals(studEvalBox.getSelectedItem()) && col[1].equals(projEvalBox.getSelectedItem())) {
                    col[4] = (String) gradeBox.getSelectedItem();
                }
                build.append(String.join(", ", col)).append("\n");
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(Assignment.submission));
            writer.write(build.toString());
            writer.close();
            
            statusCheck check = new statusCheck(true);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_gradeBtnActionPerformed

    private void projReqBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projReqBoxActionPerformed
        subCheck(projReqBox, studReqBox, "no student have requested.", Assignment.request);
    }//GEN-LAST:event_projReqBoxActionPerformed

    private void studReqBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studReqBoxActionPerformed
            try ( BufferedReader reader = new BufferedReader(new FileReader(Assignment.request))){
                String line;
                String temp;
                while ((line = reader.readLine()) != null) {
                    String[] sub = line.split(",");
                    if (sub.length >= 2) {
                        reqDateTxt.setText(sub[3].trim());
                    }
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
            }    
    }//GEN-LAST:event_studReqBoxActionPerformed

    private void reqApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqApproveActionPerformed
        approveOrDeny("approved");
    }//GEN-LAST:event_reqApproveActionPerformed

    private void reqDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqDenyActionPerformed
        approveOrDeny("denied");
    }//GEN-LAST:event_reqDenyActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        loginselection log = new loginselection();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void projSupBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projSupBoxActionPerformed
        try (BufferedReader reader = new BufferedReader(new FileReader(Assignment.project))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] proj = line.split(", ");
                if (projSupBox.getSelectedItem().equals(proj[0])) {
                    
                    try (BufferedReader read = new BufferedReader(new FileReader(Assignment.user))) {
                        String linee;
                        while ((linee = read.readLine()) != null) {
                            String[] name = linee.split(", ");
                            if (proj[3].equals(name[0]) && !proj[3].equals(lec.userID)) {
                                supSupervisee.setText(name[1]);
                                supSuperviseeID.setText(name[0]);
                                break;
                            }
                            else if (proj[4].equals(name[0]) && !proj[4].equals(lec.userID)) {
                                supSupervisee.setText(name[1]);
                                supSuperviseeID.setText(name[0]);
                                break;
                            }
                        }
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
    } 
    }//GEN-LAST:event_projSupBoxActionPerformed

    private void projEditBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projEditBoxActionPerformed
        try (BufferedReader reader = new BufferedReader(new FileReader(Assignment.project))) {
            String line;
            boolean atleast1 = false;
            while ((line = reader.readLine()) != null) {
                String[] proj = line.split(",");
                if (projEditBox.getSelectedItem().equals(proj[0])) {
                    dateTxt.setText(proj[5]);
                }
            }   
        }
        catch (IOException e) {
            e.printStackTrace();
    } 
    }//GEN-LAST:event_projEditBoxActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Assignment.project));
            StringBuilder build = new StringBuilder();
            String line;
            String tempdate = dateTxt.getText().trim();

            SimpleDateFormat checkFormat = new SimpleDateFormat("dd-MM-yyyy");
            checkFormat.setLenient(false);
            Date parsedDate = checkFormat.parse(tempdate);

            while ((line = reader.readLine()) != null) {
                String[] col = line.split(",");
                if (col[0].equals(projEditBox.getSelectedItem())) {
                    tempdate = dateTxt.getText();
                    System.out.println(tempdate);
                    col[5] = tempdate;
                }
                for (int i = 0; i < col.length; i++) {
                    col[i] = col[i].trim();
                }
                build.append(String.join(", ", col)).append("\n");  
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(Assignment.project));
            writer.write(build.toString());
            writer.close();

            statusCheck check = new statusCheck(true);

            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        catch (ParseException ex) {
                statusCheck check = new statusCheck(false, "invalid date format");
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        changePassword(changeOldTxt, changeNewTxt, changeCfmTxt, Assignment.user, lec.userID);
    }//GEN-LAST:event_changeButtonActionPerformed

    
    private void assignedProj() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(Assignment.project));
                String line;
                boolean atleast1 = false;
                while ((line = reader.readLine()) != null) {
                    String[] proj = line.split(", ");


                    if (proj.length >= 3) {
                        if (proj[3].equals(lec.userID) || proj[4].equals(lec.userID)) {
                        projEvalBox.addItem(proj[0]);
                        projReqBox.addItem(proj[0]);
                        projSupBox.addItem(proj[0]);
                        projEditBox.addItem(proj[0]);
                        atleast1 = true;       
                        }
                    }
                }
                if (!atleast1) {
                    System.out.println("you are not assigned to any project.");
                    loginselection log = new loginselection();
                    dispose();
                    log.setVisible(true);
                } 
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    private void approveOrDeny(String req) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Assignment.request));
            StringBuilder build = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] col = line.split(", ");
                if (col[0].equals(studReqBox.getSelectedItem()) && col[1].equals(projReqBox.getSelectedItem())) {
                    col[4] = req;
                }
                build.append(String.join(", ", col)).append("\n");
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(Assignment.request));
            writer.write(build.toString());
            writer.close();
            
            statusCheck check = new statusCheck(true);
        
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
            
    private void subCheck(JComboBox<String> comboBox, JComboBox<String> targetBox, String msg, String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            boolean atleast1 = false;
            while ((line = reader.readLine()) != null) {
                String[] sub = line.split(",");
                if (sub.length >= 2 && comboBox.getSelectedItem().equals(sub[1].trim())) {
                    targetBox.addItem(sub[0].trim());
                    atleast1 = true;
                }
            }
            if (!atleast1) {
                statusCheck check = new statusCheck(false, msg);
                targetBox.removeAllItems();
                if (targetBox.equals(studEvalBox)) {
                    evalMoodle.setText("");
                }
        }
        } catch (IOException e) {
            e.printStackTrace();
    } 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(lecturerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lecturerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lecturerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lecturerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lecturerMenu().setVisible(true);
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
    private javax.swing.JLabel dateTip;
    private javax.swing.JTextPane dateTxt;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel editDate;
    private javax.swing.JLabel editProj;
    private javax.swing.JLabel evalGrade;
    private javax.swing.JLabel evalLink;
    private javax.swing.JLabel evalMoodle;
    private javax.swing.JLabel evalProj;
    private javax.swing.JLabel evalStud;
    private javax.swing.JComboBox<String> gradeBox;
    private javax.swing.JButton gradeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JComboBox<String> projEditBox;
    private javax.swing.JComboBox<String> projEvalBox;
    private javax.swing.JComboBox<String> projReqBox;
    private javax.swing.JComboBox<String> projSupBox;
    private javax.swing.JButton reqApprove;
    private javax.swing.JLabel reqDate;
    private javax.swing.JLabel reqDateTxt;
    private javax.swing.JButton reqDeny;
    private javax.swing.JLabel reqProj;
    private javax.swing.JLabel reqStud;
    private javax.swing.JComboBox<String> studEvalBox;
    private javax.swing.JComboBox<String> studReqBox;
    private javax.swing.JLabel supAssigned;
    private javax.swing.JLabel supAssignedID;
    private javax.swing.JLabel supProj;
    private javax.swing.JLabel supSupervisee;
    private javax.swing.JLabel supSuperviseeID;
    // End of variables declaration//GEN-END:variables
}
