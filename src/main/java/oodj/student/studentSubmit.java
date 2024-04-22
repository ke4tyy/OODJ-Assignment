
package oodj.student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class studentSubmit extends javax.swing.JFrame {
    public static String proj;
    public studentSubmit() {
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
        submissionTxt = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Submit assignment");

        menuButton.setText("Back to menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        projBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Choose project");

        jLabel3.setText("Enter submission moodle link");

        submissionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submissionTxtActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submissionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(menuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton)
                        .addGap(96, 96, 96))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(submissionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
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

    private void submissionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submissionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submissionTxtActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String readpath = "C:\\Users\\Choon\\Downloads\\assignment\\src\\main\\java\\oodj\\assignment\\submission.txt";        
        String link = submissionTxt.getText().trim();
        
        
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
            submitStatus status = new submitStatus(false, "There is already an existing submission for this project!");
            status.setVisible(true);
        } else if (link.isEmpty()) {
            submitStatus substatus = new submitStatus(false, "submission link cannot be empty!");
            substatus.setVisible(true);
        } else {
            submitStatus substatus = new submitStatus(true);
            substatus.setVisible(true);
            dispose();
            
            String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            String writepath = "C:\\Users\\Choon\\Downloads\\assignment\\src\\main\\java\\oodj\\assignment\\submission.txt";
            
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(writepath, true))) {
                writer.write(studentMenu.studID + ", " + projBox.getSelectedItem().toString() + ", " + date + ", " + link + ", " + null);
                writer.newLine();
            }
            catch (IOException e) {
                System.out.println("error: " + e);
            }
        }
    } catch (IOException e) {
        System.out.println(e);
    }
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(studentSubmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentSubmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentSubmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentSubmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentSubmit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton menuButton;
    private javax.swing.JComboBox<String> projBox;
    private javax.swing.JTextField submissionTxt;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
