/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import oodj.login.loginselection;
import oodj.student.statusCheck;

/**
 *
 * @author Choon
 */

//this file is for the purpose of defining users wherever they go, for ease of use and fulfill the requirement of abstract class

public abstract class userAttribute extends javax.swing.JFrame {
    //student
    public static class Student{
        public static String studID;
        public static String studName;
        public static String studMail;
        public static String studPass;
        public static String studIntake;
        
        public Student() {
            this.studID = loginselection.id;
            this.studName = loginselection.name;
            this.studMail = loginselection.mail;
            this.studPass = loginselection.pw;
            this.studIntake = loginselection.intake;
        }
        
        public Student(String id, String name, String mail, String pw, String intake) {
            this.studID = id;
            this.studName = name;
            this.studMail = mail;
            this.studPass = pw;
            this.studIntake = intake;
        }
    }
    
    //lecturer
    public static class Lecturer{
        public static String lectID;
        public static String lectName;
        public static String lectMail;
        public static String lectPass;
        
       
        public Lecturer() {
            this.lectID = loginselection.id;
            this.lectName = loginselection.name;
            this.lectMail = loginselection.mail;
            this.lectPass = loginselection.pw;
        }
        
        public Lecturer(String id, String name, String mail, String pw) {
            this.lectID = id;
            this.lectName = name;
            this.lectMail = mail;
            this.lectPass = pw;
        }
    }
    
    public void changePassword(JTextPane txt1, JTextPane txt2, JTextPane txt3, String file, String role) {
        String check = txt1.getText().trim();
        String newPass = txt2.getText().trim();
        String cfmPass = txt3.getText().trim();

        if (check.equals("") || newPass.equals("") || cfmPass.equals("")) {
            statusCheck err = new statusCheck(false, "submission link cannot be empty!");
        }
        else {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                StringBuilder combined = new StringBuilder();
                if (newPass.equals(cfmPass)) {
                    while ((line = reader.readLine()) != null) {
                        String[] pass = line.split(", ");
                        if (role.equals(pass[0]) && pass[3].equals(check)) {
                            pass[3] = newPass;
                        }
                        combined.append(String.join(", ", pass)).append("\n");
                    }
                    reader.close();
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(combined.toString());
                    writer.close();
                    statusCheck comp = new statusCheck(true);
                    comp.setVisible(true);
                }
                else {
                    statusCheck error = new statusCheck(false, "credentials does not match.");
                    error.setVisible(true);
                }

            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
