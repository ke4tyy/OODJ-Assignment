
package oodj.student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import oodj.assignment.Assignment;


public class studentChecksubmission extends javax.swing.JFrame {
    public static String proj;
    
    /* showcase purposes*/
    public static String studentID;
    public static String projectID;
    public static String subDate;
    public static String status;
    
    public studentChecksubmission() {
        initComponents();
        
        if (projBox != null) {
            projBox.removeAllItems();
        }

        try ( BufferedReader reader = new BufferedReader(new FileReader(Assignment.assessment))){
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
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Check Submission");

        menuButton.setText("Back to menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        projBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Choose project");

        submitButton.setText("Check");
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                    .addComponent(projBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(118, 118, 118))
                .addGroup(layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(menuButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submitButton)
                    .addGap(96, 96, 96)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
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

        if ("".equals(projBox.getSelectedItem().toString())) {
            checkStatus substatus = new checkStatus(false, "please select a project");
            substatus.setVisible(true);
        }
        else {
            
            try ( BufferedReader reader = new BufferedReader(new FileReader(Assignment.submission))){
            String line;
            boolean submitted = false;
            while ((line = reader.readLine()) != null) {
                String[] sub = line.split(", ");
                

                
                if (sub[0].equals(studentMenu.studID) && sub[1].equals(proj)) {

                    studentID = sub[0];
                    projectID = sub[1];
                    subDate = sub[2];
                    status = sub[4];
                    studentCheckform form = new studentCheckform();
                    form.setVisible(true);
                    submitted = true;
                    dispose();
                    break;
                }

            }
            if (!submitted) {
                checkStatus error = new checkStatus(false, "You have not submitted!");
                error.setVisible(true);
            }
            

        
        }
        
        catch (IOException e) {
            System.out.println(e);
        }
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
            java.util.logging.Logger.getLogger(studentChecksubmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentChecksubmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentChecksubmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentChecksubmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentChecksubmission().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton menuButton;
    private javax.swing.JComboBox<String> projBox;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
