/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj.student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Choon
 */
public class editfiletest {
        public static void main(String[] args) {
        // Define the file path
        String filePath = "C:\\Users\\Choon\\Downloads\\assignment\\src\\main\\java\\oodj\\assignment\\submission.txt";
        
        try {
            // Read the file
            File file = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into columns
                String[] columns = line.split(", "); // Assuming columns are separated by ", "
                // Check if the URL is "moodlelink.com" and replace it with "hello.com"
                if (columns.length >= 4 && columns[3].equals("moodlelink.com")) {
                    columns[3] = "hello.com";
                }
                // Reconstruct the line
                sb.append(String.join(", ", columns)).append("\n");
            }
            reader.close();
            
            // Write the modified content back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(sb.toString());
            writer.close();
            
            System.out.println("File edited successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
