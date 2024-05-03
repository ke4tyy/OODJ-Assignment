/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj.assignment;

import oodj.login.loginselection;

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
}
