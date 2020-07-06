/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham.view;

import java.awt.Dialog;
import java.awt.EventQueue;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Ilham MMR <ilham.mmr@gmail.com>
 */
public class UpdateHuntingForm extends JDialog {

    /**
     * Creates new form UpdateHuntingForm
     */
    UpdateInfoListener updateInfoListener;

    public UpdateHuntingForm() {
        initComponents();
        setModal(true);

    }

    public void setUpdateInfoListener(UpdateInfoListener listener) {
        this.updateInfoListener = listener;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        updatePanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        animalField = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        placeField = new javax.swing.JTextField();
        weaponField = new javax.swing.JTextField();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        updateBtn = new javax.swing.JButton();
        notifierLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updatePanel.setBackground(new java.awt.Color(75, 75, 75));
        updatePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Animal:");
        updatePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 96, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Type of Animal:");
        updatePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Place:");
        updatePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 178, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Date:");
        updatePanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 259, -1, 15));

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Weapon:");
        updatePanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 217, -1, -1));
        updatePanel.add(animalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 93, 212, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("oviparous ");
        jRadioButton1.setActionCommand("oviparous");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        updatePanel.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 135, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setText("viviparous ");
        jRadioButton2.setActionCommand("viviparous");
        updatePanel.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 135, -1, -1));
        updatePanel.add(placeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 175, 212, -1));
        updatePanel.add(weaponField, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 217, 212, -1));

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo1.setCalendarBackground(new java.awt.Color(75, 75, 75));
    dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(350, 300));
    dateChooserCombo1.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 12));
    updatePanel.add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 259, -1, -1));

    updateBtn.setBackground(new java.awt.Color(38, 38, 38));
    updateBtn.setForeground(new java.awt.Color(38, 38, 38));
    updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ilham/view/Icons/refresh_52px.png"))); // NOI18N
    updateBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            updateBtnActionPerformed(evt);
        }
    });
    updatePanel.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 297, 63, 52));

    notifierLabel.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
    notifierLabel.setForeground(new java.awt.Color(204, 204, 204));
    updatePanel.add(notifierLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 342, 170, -1));

    getContentPane().add(updatePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 425, 432));

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String animal = animalField.getText();
        String typeOfAnimal = buttonGroup1.getSelection().getActionCommand();
        String place = placeField.getText();
        String weapon = weaponField.getText();
        String date = dateChooserCombo1.getText();
        if (animal.isEmpty() || typeOfAnimal.isEmpty() || place.isEmpty() || weapon.isEmpty() || date.isEmpty()) {
                notifierLabel.setText("Please Fill in the form properly!");

        } else {
            UpdateInfo updatedHunting = new UpdateInfo(animal, typeOfAnimal, place, weapon, date, this);

            if (updateInfoListener != null) {
                updateInfoListener.updateEventOccured(updatedHunting);
            }
            notifierLabel.setText("succesfully updated");
            dispose();
        }

    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateHuntingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateHuntingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateHuntingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateHuntingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateHuntingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField animalField;
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel notifierLabel;
    private javax.swing.JTextField placeField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JTextField weaponField;
    // End of variables declaration//GEN-END:variables
}
