/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package datastructuresca;

import javax.swing.JOptionPane;

/**
 *
 * @author Evan
 */
public class AppGUI extends javax.swing.JFrame {

    /**
     * Creates new form AppGUI
     */
    public AppGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        ageLabel1 = new javax.swing.JLabel();
        hasMedicalConditionCheck = new javax.swing.JCheckBox();
        queueDetailsBtn = new javax.swing.JButton();
        numOfRegistrationsBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        nameLabel1 = new javax.swing.JLabel();
        secondNameTextField = new javax.swing.JTextField();
        showNextPriorityGroupBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vaccine Scheduler");

        nameLabel.setText("First Name");

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        ageLabel.setText("Age");

        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        ageLabel1.setText("Has Medical Condition");

        queueDetailsBtn.setText("Display Full Queue");
        queueDetailsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                queueDetailsBtnMouseClicked(evt);
            }
        });
        queueDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queueDetailsBtnActionPerformed(evt);
            }
        });

        numOfRegistrationsBtn.setText("Display Number Of Registrations");
        numOfRegistrationsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numOfRegistrationsBtnMouseClicked(evt);
            }
        });
        numOfRegistrationsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfRegistrationsBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        nameLabel1.setText("Second Name");

        secondNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondNameTextFieldActionPerformed(evt);
            }
        });

        showNextPriorityGroupBtn.setText("Display Next Priority Group");
        showNextPriorityGroupBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showNextPriorityGroupBtnMouseClicked(evt);
            }
        });
        showNextPriorityGroupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showNextPriorityGroupBtnActionPerformed(evt);
            }
        });

        displayBox.setEditable(false);
        displayBox.setColumns(20);
        displayBox.setRows(5);
        jScrollPane2.setViewportView(displayBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showNextPriorityGroupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(queueDetailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numOfRegistrationsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hasMedicalConditionCheck))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameTextField)
                            .addComponent(secondNameTextField)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel1)
                            .addComponent(secondNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel1)
                            .addComponent(hasMedicalConditionCheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBtn)
                        .addGap(46, 46, 46)
                        .addComponent(showNextPriorityGroupBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(queueDetailsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numOfRegistrationsBtn)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void queueDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queueDetailsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queueDetailsBtnActionPerformed

    private void numOfRegistrationsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOfRegistrationsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numOfRegistrationsBtnActionPerformed

    private void queueDetailsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_queueDetailsBtnMouseClicked
        displayBox.setText(vL.getDetails(vL.getQueue()));
    }//GEN-LAST:event_queueDetailsBtnMouseClicked

    private void numOfRegistrationsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numOfRegistrationsBtnMouseClicked
        displayBox.setText("Number of people registered for vaccination: " + vL.getNumberOfRegistrations());
    }//GEN-LAST:event_numOfRegistrationsBtnMouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked

    }//GEN-LAST:event_addBtnMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        //name text
        String name = firstNameTextField.getText() + " " + secondNameTextField.getText();
        //age text
        int age;
        try {
            age = Integer.parseInt(ageTextField.getText());
            if (age < 0){
                JOptionPane.showMessageDialog(this, "Please enter a valid integer number for the AGE field.");
                clearInputs();
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer number for the AGE field.");
            clearInputs();
            return;
        }
        //has condition
        boolean hasMedicalCondition = hasMedicalConditionCheck.isSelected();
        vL.insertPerson(new Person(name, age, hasMedicalCondition));
        JOptionPane.showMessageDialog(this, "New registration added");
        clearInputs();
    }//GEN-LAST:event_addBtnActionPerformed

    private void secondNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondNameTextFieldActionPerformed

    private void showNextPriorityGroupBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showNextPriorityGroupBtnMouseClicked
        displayBox.setText(vL.showNextPriorityGroupInfo());
        JOptionPane.showMessageDialog(this, "The inforamtion of the people in the next priority group will be displayed and removed from the queue");
    }//GEN-LAST:event_showNextPriorityGroupBtnMouseClicked

    private void showNextPriorityGroupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showNextPriorityGroupBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showNextPriorityGroupBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    static VaccinationList vL = new VaccinationList();
    
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
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        RandomDataGenerator rdg = new RandomDataGenerator();
        
        for (int i = 0; i < 30; i++){
            vL.insertPerson(rdg.generateRandomPerson());
        }
        
//        System.out.println(vL.getDetails(vL.getQueue()));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppGUI().setVisible(true);
            }
        });
    }
    
    private void clearInputs(){
        firstNameTextField.setText("");
        secondNameTextField.setText("");
        ageTextField.setText("");
        hasMedicalConditionCheck.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel ageLabel1;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextArea displayBox;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JCheckBox hasMedicalConditionCheck;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JButton numOfRegistrationsBtn;
    private javax.swing.JButton queueDetailsBtn;
    private javax.swing.JTextField secondNameTextField;
    private javax.swing.JButton showNextPriorityGroupBtn;
    // End of variables declaration//GEN-END:variables
}
