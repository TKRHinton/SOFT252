/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.DoctorSystem;
import PatientManagmentSystem.LoginPage;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author Theon
 */
public class DoctorMain extends javax.swing.JFrame {

    /**
     * Creates new form DoctorMain
     */
    public DoctorMain() {
        initComponents();
        this.setLocationRelativeTo(null);//sets form to center of screen
    }

    /**
     * This method is called from within the constructor to  the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnPerscribeMedicines = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblCreator = new javax.swing.JLabel();
        btnConsultation = new javax.swing.JButton();
        btnAddMedicine = new javax.swing.JButton();
        btnPatientHistory = new javax.swing.JButton();
        btnMake_Appointment = new javax.swing.JButton();
        btnViewAppointments = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(211, 84, 0));

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Doctor Home");

        lblClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setText("X");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblMin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMin.setForeground(new java.awt.Color(255, 255, 255));
        lblMin.setText("-");
        lblMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Patient Managment System");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader)
                .addGap(30, 30, 30)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMin)
                .addGap(18, 18, 18)
                .addComponent(lblClose)
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblClose)
                        .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(52, 73, 94));

        btnPerscribeMedicines.setBackground(new java.awt.Color(46, 134, 222));
        btnPerscribeMedicines.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPerscribeMedicines.setForeground(new java.awt.Color(255, 255, 255));
        btnPerscribeMedicines.setText("Perscribe Medicinces");
        btnPerscribeMedicines.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerscribeMedicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerscribeMedicinesActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(238, 82, 83));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblCreator.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        lblCreator.setForeground(new java.awt.Color(255, 255, 255));
        lblCreator.setText("Thomas Hinton - 10612662");

        btnConsultation.setBackground(new java.awt.Color(46, 134, 222));
        btnConsultation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultation.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultation.setText("Consultation");
        btnConsultation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultationActionPerformed(evt);
            }
        });

        btnAddMedicine.setBackground(new java.awt.Color(46, 134, 222));
        btnAddMedicine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddMedicine.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMedicine.setText("Add Medicine");
        btnAddMedicine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMedicineActionPerformed(evt);
            }
        });

        btnPatientHistory.setBackground(new java.awt.Color(46, 134, 222));
        btnPatientHistory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPatientHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnPatientHistory.setText("Patient History");
        btnPatientHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPatientHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientHistoryActionPerformed(evt);
            }
        });

        btnMake_Appointment.setBackground(new java.awt.Color(46, 134, 222));
        btnMake_Appointment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMake_Appointment.setForeground(new java.awt.Color(255, 255, 255));
        btnMake_Appointment.setText("Make Appointment");
        btnMake_Appointment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMake_Appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMake_AppointmentActionPerformed(evt);
            }
        });

        btnViewAppointments.setBackground(new java.awt.Color(46, 134, 222));
        btnViewAppointments.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewAppointments.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAppointments.setText("View Appointments");
        btnViewAppointments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppointmentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addComponent(lblCreator))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMake_Appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPatientHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPerscribeMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnMake_Appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCreator))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnPatientHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnPerscribeMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinMouseClicked

    private void btnPerscribeMedicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerscribeMedicinesActionPerformed

    }//GEN-LAST:event_btnPerscribeMedicinesActionPerformed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        LoginPage form = new LoginPage();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultationActionPerformed

    private void btnAddMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMedicineActionPerformed

    private void btnPatientHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPatientHistoryActionPerformed

    private void btnMake_AppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMake_AppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMake_AppointmentActionPerformed

    private void btnViewAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppointmentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewAppointmentsActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DoctorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMedicine;
    private javax.swing.JButton btnConsultation;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMake_Appointment;
    private javax.swing.JButton btnPatientHistory;
    private javax.swing.JButton btnPerscribeMedicines;
    private javax.swing.JButton btnViewAppointments;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblCreator;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
