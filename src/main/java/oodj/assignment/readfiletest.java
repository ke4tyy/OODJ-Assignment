package oodj.assignment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class readfiletest {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\OneDrive\\onenote\\NetBeansProjects\\assignment\\src\\main\\java\\com\\mycompany\\assignment\\user.txt";
        
        String namemail = "Rawan Osama";
        String password = "pw789";
        
        boolean login = false; 
        
    try ( BufferedReader reader = new BufferedReader(new FileReader(path))){
        String line;

        while ((line = reader.readLine()) != null) {
            String[] user = line.split(", ");
            System.out.println(user[1]);
            System.out.println(user[2]);
            System.out.println(user[3]);
            if (user[1].equals(namemail) || user[2].equals(namemail)) {
                if (user[3].equals(password)) {
                    login = true;
                    break;
                }
            }
        }

        if (login) {
            System.out.println("successful login");
        }
        else {
            System.out.println("Invalid username/email or password");
        }
        
        
    
    
    
   
    
    } catch (IOException e) {
    e.printStackTrace();
    }
        
        
}
}
