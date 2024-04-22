
package oodj.student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class studentRequestdate extends javax.swing.JFrame {
    public static String proj;
    public studentRequestdate() {
        initComponents();
        
        if (projBox != null) {
            projBox.removeAllItems();
        }

        String path = "C:\\Users\\Choon\\Downloads\\assignment\\src\\main\\java\\oodj\\assignment\\assessment.txt";
        try ( BufferedReader reader = new BufferedReader(new FileReader(path))){
        String line;

        while ((line = reader.readLine()) != null) {
            String[] project = line.split(", ");

            if (project[0].equals(studentMenu.studID)) {
                System.out.println(project[1]);
                proj = project[1];
                projBox.addItem(proj);
            }
        }

    
        } catch (IOException e) {
        e.printStackTrace();
        }

        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menuButton = new javax.swing.JButton();
        projBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dateBox = new javax.swing.JComboBox<>();
        monthBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Request Presentation Date");

        menuButton.setText("Back to menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        projBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Choose project");

        jLabel3.setText("Select Date");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Select Month");

        monthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "", "9", "10", "11", "12" }));
        monthBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(projBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(menuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuButton)
                    .addComponent(submitButton))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        studentMenu menu = new studentMenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        String readpath = "C:\\Users\\Choon\\Downloads\\assignment\\src\\main\\java\\oodj\\assignment\\request.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(readpath))) {
        String line;

        boolean hasDuplicate = false;

        while ((line = reader.readLine()) != null) {
            String[] split = line.split(", ");

            if (split[0].equals(studentMenu.studID) && split[1].equals(projBox.getSelectedItem().toString())) {
                hasDuplicate = true;
                break;
            }
        }

        if (hasDuplicate) {
            submitStatus status = new submitStatus(false, "There is already an existing request for this project!");
            status.setVisible(true);
        } else if (dateBox.getSelectedItem() == null || monthBox.getSelectedItem() == null) {
            submitStatus status = new submitStatus(false, "Month or date cannot be empty!");
            status.setVisible(true);
        } else {
            int date = Integer.parseInt((String) dateBox.getSelectedItem());
            int month = Integer.parseInt((String) monthBox.getSelectedItem());

            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.MONTH, month - 1);
            cal.set(Calendar.DAY_OF_MONTH, date);

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String finalCompile = dateFormat.format(cal.getTime());

            String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            String writepath = "C:\\Users\\Choon\\Downloads\\assignment\\src\\main\\java\\oodj\\assignment\\request.txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(writepath, true))) {
                writer.write(studentMenu.studID + ", " + projBox.getSelectedItem().toString() + ", " + currentDate + ", " + finalCompile + ", " + "pending");
                writer.newLine();

                submitStatus status = new submitStatus(true);
                status.setVisible(true);
                dispose();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    } catch (IOException e) {
        System.out.println(e);
    }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void monthBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthBoxActionPerformed
        String selected  = (String) monthBox.getSelectedItem();
        int day = 0;
        switch (selected) {
            case "1":
            case "3":
            case "5":
            case "7": 
            case "8":
            case "10":
            case "12":
                day = 31;
                break;
                
            case "4":
            case "6":
            case "9":
            case "11":
                day = 30;
                break;
                
            case "2":
                day = 28;
                break;
        }
        
        for (int i = 1; i <= day; i++) {
            dateBox.addItem(String.valueOf(i));
        }
    }//GEN-LAST:event_monthBoxActionPerformed

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
            java.util.logging.Logger.getLogger(studentRequestdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentRequestdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentRequestdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentRequestdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentRequestdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dateBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton menuButton;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JComboBox<String> projBox;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
