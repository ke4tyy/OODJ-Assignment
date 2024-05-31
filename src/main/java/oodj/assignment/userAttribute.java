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
    public static class User{
        public static String userID;
        public static String userName;
        public static String userMail;
        public static String userPass;
        
       
        public User() {
            this.userID = loginselection.id;
            this.userName = loginselection.name;
            this.userMail = loginselection.mail;
            this.userPass = loginselection.pw;
        }
        
        public User(String id, String name, String mail, String pw) {
            this.userID = id;
            this.userName = name;
            this.userMail = mail;
            this.userPass = pw;
        }
    }
    
        
    public void changePassword(JTextPane txt1, JTextPane txt2, JTextPane txt3, String file, String id) {
        String check = txt1.getText().trim();
        String newPass = txt2.getText().trim();
        String cfmPass = txt3.getText().trim();

        if (check.isEmpty() || newPass.isEmpty() || cfmPass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Password cannot be empty", "Error",  JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                StringBuilder combined = new StringBuilder();
                boolean same = false;
                if (newPass.equals(cfmPass)) {
                    while ((line = reader.readLine()) != null) {
                        String[] pass = line.split(", ");
                        if (id.equals(pass[0]) && pass[3].equals(check)) {
                            pass[3] = newPass;
                            same = true;
                        }
                        combined.append(String.join(", ", pass)).append("\n");
                    }
                    reader.close();
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(combined.toString());
                    writer.close();
                    if (same) {
                JOptionPane.showMessageDialog(this, "Password Changed", "Success",  JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                if (!newPass.equals(cfmPass) || !same) {
                JOptionPane.showMessageDialog(this, "Credentials does not match", "Error",  JOptionPane.INFORMATION_MESSAGE);
                }

            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    

    }
}
