/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj.manager;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import oodj.assignment.*;
import oodj.login.loginselection;

/**
 *
 * @author User
 */
public class managerMenu extends userAttribute {
    User man = new User();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public managerMenu() {
        initComponents();
        jLabel1.setText("Welcome back, " + man.userName + "!");
        assignSupervisor(createSup);
        assignedVar();
        addTableElement();

    }

    public managerMenu(String id, String name, String mail, String pw) {
        initComponents();
        jLabel1.setText("Welcome back, " + man.userName + "!");
        assignSupervisor(createSup);
        assignedVar();
        addTableElement();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        createProjTxt = new javax.swing.JTextPane();
        createCat = new javax.swing.JComboBox<>();
        createSup = new javax.swing.JComboBox<>();
        createSecond = new javax.swing.JComboBox<>();
        createButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        createCalendar = new com.toedter.calendar.JCalendar();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        editProjBox = new javax.swing.JComboBox<>();
        editSecond = new javax.swing.JComboBox<>();
        editButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        editCalendar = new com.toedter.calendar.JCalendar();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        editProjTxt = new javax.swing.JTextPane();
        editCat = new javax.swing.JComboBox<>();
        editSup = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        enrStudent = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        enrProj1 = new javax.swing.JComboBox<>();
        enrollButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        enrIntake = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        enrProj2 = new javax.swing.JComboBox<>();
        enrollButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportSTable = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        reportSCal = new javax.swing.JButton();
        reportSNum = new javax.swing.JLabel();
        reportSGPA = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportITable = new javax.swing.JTable();
        reportIGPA = new javax.swing.JLabel();
        reportINum = new javax.swing.JLabel();
        reportICal = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        reportIntakeBox = new javax.swing.JComboBox<>();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Welcome, ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Create Project");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Note : Project ID will be automatically assigned");

        jLabel4.setText("Enter Project Name :");

        jLabel5.setText("Select Category :");

        jLabel6.setText("Assign Supervisor :");

        jLabel7.setText("Assign Second Marker :");

        createCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Group", "Individual", "Internship", "Investigation", "RMCP", "CapstoneP1", "CapstoneP2", "FYP" }));

        createSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSupActionPerformed(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Assign Submission Date :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(createCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(createProjTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createSup, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(createCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(286, 286, 286))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(createSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(createProjTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(createCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(createCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );

        jTabbedPane1.addTab("Create Project", jPanel1);

        jLabel9.setText("Select Project : ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Edit Project");

        editProjBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProjBoxActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Assign Submission Date :");

        jLabel12.setText("Enter Project Name :");

        jLabel13.setText("Select Category :");

        jLabel14.setText("Assign Supervisor :");

        jLabel15.setText("Assign Second Marker :");

        editCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Group", "Individual", "Internship", "Investigation", "RMCP", "CapstoneP1", "CapstoneP2", "FYP" }));

        editSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(editProjBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(18, 18, 18)
                                            .addComponent(editProjTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(18, 18, 18)
                                            .addComponent(editCat, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editSecond, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editSup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(17, 17, 17)
                                .addComponent(editCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(editProjBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(editSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addComponent(editProjTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(editCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(editCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );

        jTabbedPane1.addTab("Edit Project", jPanel2);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("Enroll Student");

        jLabel19.setText("Select Student :");

        jLabel20.setText("Select Project :");

        enrollButton1.setText("Enroll");
        enrollButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enrStudent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enrProj1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(enrollButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(enrStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(enrProj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(enrollButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Individual", jPanel5);

        jLabel17.setText("Select Intake :");

        jLabel18.setText("Select Project :");

        enrollButton2.setText("Enroll");
        enrollButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enrIntake, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enrProj2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(enrollButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(enrIntake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(enrProj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(enrollButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("By Intake", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(284, 284, 284))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Enroll Student", jPanel3);

        reportSTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Intake", "Project ID", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportSTable.setToolTipText("");
        jScrollPane1.setViewportView(reportSTable);

        jLabel21.setText("Total Students :");

        jLabel22.setText("Average GPA :");

        reportSCal.setText("Calculate");
        reportSCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportSCalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(reportSGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reportSCal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(reportSNum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reportSNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(reportSGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(reportSCal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Student Report", jPanel6);

        reportITable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Intake", "Project ID", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportITable.setToolTipText("");
        jScrollPane2.setViewportView(reportITable);

        reportICal.setText("Calculate");
        reportICal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportICalActionPerformed(evt);
            }
        });

        jLabel23.setText("Average GPA :");

        jLabel24.setText("Total Students :");

        jLabel25.setText("Select Intake :");

        reportIntakeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportIntakeBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(reportIntakeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(reportIGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(reportICal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(reportINum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(19, 19, 19))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(reportIntakeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reportINum, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(reportIGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(reportICal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Intake Report", jPanel7);

        logoutBtn.setText("log out");
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(logoutBtn))
                .addGap(6, 6, 6)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        loginselection log = new loginselection();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void createSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSupActionPerformed
        createSecond.removeAllItems();
        assignSupervisor(createSecond);
        createSecond.removeItem(createSup.getSelectedItem());
        
    }//GEN-LAST:event_createSupActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        
        String projName = createProjTxt.getText();
        String projCat = (String) createCat.getSelectedItem();
        String projSup = getLectID((String) createSup.getSelectedItem());
        String projSecond = getLectID((String) createSecond.getSelectedItem());
        String projDate = dateFormat.format(createCalendar.getDate());
        String projID = "";    
        
        if (createProjTxt.getText().isEmpty() || createSup.getSelectedItem() == null || createSecond.getSelectedItem() == null ) {
            statusCheck err = new statusCheck(false, "Project variables cannot be empty!"); 
        }
        else {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(Assignment.project));
                String line;

                int temp = 0; 
                boolean valid = true;
                
                while ((line = reader.readLine()) != null) {
                    String[] proj  = line.split(",\\s");

                    if (proj.length > 0 && !proj[0].isEmpty()) {
                        temp = Integer.parseInt(proj[0].substring(1));
                        temp++;
                        projID = "P" + String.format("%03d", temp);
                        if (proj.length >= 3 && proj[1].equals(projName) && proj[2].equals(projCat)) {
                            valid = false;
                            statusCheck err = new statusCheck(false, "There is already an existing project with this name.");
                            break;
                    }
                    }
                }
                reader.close();
                if (valid) {
                    String combined = projID + ", " + projName + ", " + projCat + ", " + projSup + ", " + projSecond + ", " + projDate;
                    BufferedWriter writer = new BufferedWriter(new FileWriter(Assignment.project, true));
                    writer.write(combined);
                    writer.newLine();
                    
                    writer.close();
                    
                    statusCheck complete = new statusCheck(true, "Project Created");
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_createButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        String projID = (String) editProjBox.getSelectedItem();
        String projName = editProjTxt.getText();
        String projCat = (String) editCat.getSelectedItem();
        String projSup = getLectID((String) editSup.getSelectedItem());
        String projSecond = getLectID((String) editSecond.getSelectedItem());
        String projDate = dateFormat.format(editCalendar.getDate());

        
        if (editProjTxt.getText().isEmpty() || editSup.getSelectedItem() == null || editSecond.getSelectedItem() == null ) {
            statusCheck err = new statusCheck(false, "Project variables cannot be empty!"); 
        }
        else {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(Assignment.project));
                StringBuilder build = new StringBuilder();
                String line;

                
                while ((line = reader.readLine()) != null) {
                    String[] proj  = line.split(",\\s");

                    if (proj.length > 0 && !proj[0].isEmpty()) {
                        if (proj[0].equals(projID)) {
                            proj[0] = projID;
                            proj[1] = projName;
                            proj[2] = projCat;
                            proj[3] = projSup;
                            proj[4] = projSecond;
                            proj[5] = projDate;
                            line = projID + ", " + projName + ", " + projCat + ", " + projSup + ", " + projSecond + ", " + projDate;                            
                        }
                    }
                    build.append(line).append("\n");

                }
                reader.close();
                
                BufferedWriter writer = new BufferedWriter(new FileWriter(Assignment.project));
                writer.write(build.toString());
                writer.close();
                
                statusCheck check = new statusCheck(true, "edited successfully");
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void editSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSupActionPerformed
        editSecond.removeAllItems();
        assignSupervisor(editSecond);
        editSecond.removeItem(editSup.getSelectedItem());
    }//GEN-LAST:event_editSupActionPerformed

    private void editProjBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProjBoxActionPerformed
        String project = (String) editProjBox.getSelectedItem();
        editSup.removeAllItems();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Assignment.project));
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] p = line.split(", ");
                if (p[0].equals(project)) {
                    editProjTxt.setText(p[1]);
                    editCalendar.setDate(dateFormat.parse(p[5]));
                    editCat.setSelectedItem(p[2]);
                    assignSupervisor(editSup);
                }
                
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(managerMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_editProjBoxActionPerformed

    private void enrollButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollButton1ActionPerformed
        String student = (String) enrStudent.getSelectedItem();
        String project = (String) enrProj1.getSelectedItem();
        
        String check = student + ", " + project;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Assignment.assessment));
            String line, temp;
            boolean valid = true; 
            
            while ((line = reader.readLine()) != null) {
                String[] comp = line.split(", ");
                temp = comp[0] + ", " + comp[1];
                if (temp.equals(check)) {
                    statusCheck err = new statusCheck(false, "Project is already assigned to this student");
                    valid = false;
                }
            }
            reader.close();
            
            if (valid) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(Assignment.assessment, true));
                writer.write(check + ", " + null + ", " + null);
                writer.newLine();
                writer.close();
                statusCheck done = new statusCheck(true, "assigned successfully");
            }
            
        
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_enrollButton1ActionPerformed

    private void enrollButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollButton2ActionPerformed
        String intake = (String) enrIntake.getSelectedItem();
        String project = (String) enrProj2.getSelectedItem();
        
       
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Assignment.student));
            String line;
            
            ArrayList<String> studID = new ArrayList<>();
            
            boolean v = true; 
            
            while ((line = reader.readLine()) != null) {
                String[] stud = line.split(", "); 
                if (stud.length >= 5 && stud[4].equals(intake)) {
                    studID.add(stud[0]);
                }
            }
            reader.close();
            
            String temp, temp2;
            BufferedReader read = new BufferedReader(new FileReader(Assignment.assessment));
            String l;
            
            for (int x = 0; x < studID.size(); x++) {
                temp = studID.get(x) + ", " + project;
                while ((line = read.readLine()) != null) {
                    String[] assess = line.split(", ");
                    temp2 = assess.length > 1 ? assess[0] + ", " + assess[1] : "";
                    if (temp.equals(temp2)) {
                        statusCheck err = new statusCheck(false, "Some students in the intake are enrolled into this project");
                        v = false;
                    }
                }    
            }
            read.close();
            
            if (v && studID.size() > 1) {
                String combine;
                BufferedWriter write = new BufferedWriter(new FileWriter(Assignment.assessment, true));
                
                for (int i = 0; i < studID.size(); i++) {
                    combine = studID.get(i) + ", " + project + ", " + null + ", " + null;
                    write.write(combine);
                    write.newLine();
                }
                statusCheck done = new statusCheck(true, "enrolled successfully");
                write.close();
            }
            else {
                statusCheck err = new statusCheck(false, "intake contains less than 2 students");
            }

            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_enrollButton2ActionPerformed

    private void reportSCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportSCalActionPerformed
        int studCount = reportSTable.getRowCount();
        double[] gpa = new double[reportSTable.getRowCount()];
        for (int i = 0; i < studCount; i++) {
            String val = (String) reportSTable.getValueAt(i, 4);
            if (val != null && !val.equals("null")) {
                try {
                    gpa[i] = Double.parseDouble(val);                     
                }
                catch (NumberFormatException e) {
                    gpa[i] = 0.0;
                }

            }
            else {
                gpa[i] = 0.00;
            }
        }
        double sum = 0;
        
        for (double num : gpa) {
            sum += num;
        }
        sum /= studCount;
        
        reportSNum.setText(String.valueOf(studCount));
        reportSGPA.setText(String.valueOf(sum));
    }//GEN-LAST:event_reportSCalActionPerformed

    private void reportICalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportICalActionPerformed
        int studCount = reportITable.getRowCount();
        double[] gpa = new double[reportITable.getRowCount()];
        for (int i = 0; i < studCount; i++) {
            String val = (String) reportITable.getValueAt(i, 4);
            if (val != null && !val.equals("null")) {
                try {
                    gpa[i] = Double.parseDouble(val);                     
                }
                catch (NumberFormatException e) {
                    gpa[i] = 0.0;
                }

            }
            else {
                gpa[i] = 0.00;
            }
        }
        double sum = 0;
        
        for (double num : gpa) {
            sum += num;
        }
        sum /= studCount;
        
        reportINum.setText(String.valueOf(studCount));
        reportIGPA.setText(String.valueOf(sum));
    }//GEN-LAST:event_reportICalActionPerformed

    private void reportIntakeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportIntakeBoxActionPerformed
        String take = (String) reportIntakeBox.getSelectedItem();
        
        DefaultTableModel iTable = (DefaultTableModel) reportITable.getModel();
        iTable.setRowCount(0);
        try {
            BufferedReader stud = new BufferedReader(new FileReader(Assignment.student));
            String line1, line2; 
            
            while ((line1 = stud.readLine()) != null) {

                String[] s1 = line1.split(", ");
                boolean atleast1 = false; 
                if (s1.length >= 5 && s1[4].equals(take)) {
                    BufferedReader sub = new BufferedReader(new FileReader(Assignment.submission));

                    while ((line2 = sub.readLine()) != null) {
                        String[] s2 = line2.split(", ");
                        if (s2.length >= 5 && s1[0].equals(s2[0])) {
                            atleast1 = true;
                            String combined = s1[0] + ", " + s1[1] + ", " + s1[4] + ", " + s2[1] + ", " + s2[4];
                            String[] data = combined.split(", ");
                            iTable.addRow(data);             
                        }    
                    }
                    sub.close();
                    if (!atleast1) {
                        String combined = s1[0] + ", " + s1[1] + ", " + s1[4] + ", null, null";
                        String[] data = combined.split(", ");
                        iTable.addRow(data);       
                        }
                }
            }
            stud.close();
        }   
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_reportIntakeBoxActionPerformed

    
    
    
    private String getLectID(String name) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Assignment.user));
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] lect = line.split(", ");
                if (lect[1].equals(name)) {
                    return lect[0];
                }
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private void assignSupervisor(JComboBox <String> box) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Assignment.user));
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] lect = line.split(", ");
                if (lect[4].equals("l")) {
                    box.addItem(lect[1]);
                }
            }
            box.setSelectedItem(null);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void assignedVar() {
        try {
            BufferedReader project = new BufferedReader(new FileReader(Assignment.project));
            BufferedReader intake = new BufferedReader(new FileReader(Assignment.intake));
            String line1, line2;                      
            //project.txt
            while ((line1 = project.readLine()) != null) {
                String[] proj = line1.split(", ");
                // edit project variables
                editProjBox.addItem(proj[0]);
                
                // enroll student variables
                enrProj1.addItem(proj[0]);
                enrProj2.addItem(proj[0]);

               
            }
            //intake.txt
            while ((line2 = intake.readLine()) != null) {
                String[] intak = line2.split(", ");
                enrIntake.addItem(intak[0]);
                reportIntakeBox.addItem(intak[0]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void addTableElement() {
    DefaultTableModel sTable = (DefaultTableModel) reportSTable.getModel();
    sTable.setRowCount(0);

    try {
        BufferedReader stud = new BufferedReader(new FileReader(Assignment.student));
        String line1, line2; 

        while ((line1 = stud.readLine()) != null) {
            String[] s1 = line1.split(", ");            

            BufferedReader sub = new BufferedReader(new FileReader(Assignment.submission));
            String[] data = null;
            if (s1.length >= 3) {
                while ((line2 = sub.readLine()) != null) {
                    String[] s2 = line2.split(", ");
                    if (s2.length >= 5 && s1[0].equals(s2[0])) {
                        ArrayList<String> dataList = new ArrayList<>();
                        dataList.add(s1[0]);
                        dataList.add(s1[1]);
                        dataList.add(s1[4]);
                        dataList.add(s2[1]);
                        dataList.add(s2[4]);
                        data = dataList.toArray(new String[0]);
                        break;
                    }
                    else {
                        ArrayList<String> dataList = new ArrayList<>();
                        dataList.add(s1[0]);
                        dataList.add(s1[1]);
                        dataList.add(s1[4]);
                        dataList.add("null");
                        dataList.add("null");
                        data = dataList.toArray(new String[0]);
                    }
                }    
            }
            if (data != null) {
                sTable.addRow(data);               
            }

            sub.close();

        }
        stud.close();
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
            java.util.logging.Logger.getLogger(managerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerMenu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private com.toedter.calendar.JCalendar createCalendar;
    private javax.swing.JComboBox<String> createCat;
    private javax.swing.JTextPane createProjTxt;
    private javax.swing.JComboBox<String> createSecond;
    private javax.swing.JComboBox<String> createSup;
    private javax.swing.JButton editButton;
    private com.toedter.calendar.JCalendar editCalendar;
    private javax.swing.JComboBox<String> editCat;
    private javax.swing.JComboBox<String> editProjBox;
    private javax.swing.JTextPane editProjTxt;
    private javax.swing.JComboBox<String> editSecond;
    private javax.swing.JComboBox<String> editSup;
    private javax.swing.JComboBox<String> enrIntake;
    private javax.swing.JComboBox<String> enrProj1;
    private javax.swing.JComboBox<String> enrProj2;
    private javax.swing.JComboBox<String> enrStudent;
    private javax.swing.JButton enrollButton1;
    private javax.swing.JButton enrollButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton reportICal;
    private javax.swing.JLabel reportIGPA;
    private javax.swing.JLabel reportINum;
    private javax.swing.JTable reportITable;
    private javax.swing.JComboBox<String> reportIntakeBox;
    private javax.swing.JButton reportSCal;
    private javax.swing.JLabel reportSGPA;
    private javax.swing.JLabel reportSNum;
    private javax.swing.JTable reportSTable;
    // End of variables declaration//GEN-END:variables
}
