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

/**
 *
 * @author User
 */
public class test {
    public static void main(String[] args) {
        try {
            String id = "000004";
            String name = "bla";
            String pw = "123";
            String intake = "APD2F2402SE";
            
            
            BufferedReader reader = new BufferedReader(new FileReader(Assignment.student));
            
            StringBuilder build = new StringBuilder();
            
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] check = line.split(", ");
                if (id.equals(check[0])) {
                    check[1] = name;
                    check[3] = pw;
                    check[4] = intake;
                }
                
            build.append(String.join(", ", check)).append("\n");  
            BufferedWriter writer = new BufferedWriter(new FileWriter(Assignment.student));
            writer.write(build.toString());
            writer.close();                    
            }
            
        }
        catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
