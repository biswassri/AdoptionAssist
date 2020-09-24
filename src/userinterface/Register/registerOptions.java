/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Register;


import Business.EcoSystem;

import Business.People.BirthMotherDirectory;

import javax.swing.JPanel;

import java.awt.CardLayout;

/**
 *
 * @author ishanibose
 */
public class registerOptions extends javax.swing.JPanel {

    /**
     * Creates new form registerOptions
     */
    JPanel userProcessContainer;

    EcoSystem system;

    public BirthMotherDirectory birthMotherDirectory;

    
    public registerOptions() {
        
    }

    public registerOptions(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.birthMotherDirectory = system.getBirthMotherDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegMother = new javax.swing.JButton();
        btnRegFamily = new javax.swing.JButton();

        setBackground(new java.awt.Color(64, 151, 182));

        btnRegMother.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnRegMother.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maternity.png"))); // NOI18N
        btnRegMother.setText("MOTHER");
        btnRegMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegMotherActionPerformed(evt);
            }
        });

        btnRegFamily.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnRegFamily.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/family.png"))); // NOI18N
        btnRegFamily.setText("FAMILY");
        btnRegFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegFamilyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegFamily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegMother, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnRegMother)
                .addGap(37, 37, 37)
                .addComponent(btnRegFamily)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegMotherActionPerformed

        registerMother ls = new registerMother(userProcessContainer, system );
        userProcessContainer.add("registerMother", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRegMotherActionPerformed

    private void btnRegFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegFamilyActionPerformed
        // TODO add your handling code here:
        registerFamily ls = new registerFamily(userProcessContainer, system);
        userProcessContainer.add("registerFamily", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRegFamilyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegFamily;
    private javax.swing.JButton btnRegMother;
    // End of variables declaration//GEN-END:variables
}