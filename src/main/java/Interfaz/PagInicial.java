/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.awt.Image;
import java.awt.Toolkit;


/**
 *
 * @author nvelizl
 */
public class PagInicial extends javax.swing.JFrame {
   
    public PagInicial() {
        
        initComponents();
        this.setTitle("PORTAL GENERADOR DE NOMINAS KOVACS, SPA.");
        Image icono =Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/kovacsLogo.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
     
    }    
       
/**
     * Creates new form PagInicial
     */
            /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNominas = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ljlLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNominas.setText("NOMINAS");
        btnNominas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNominas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNominasActionPerformed(evt);
            }
        });
        jPanel2.add(btnNominas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 43));

        jButton3.setText("SALIR");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 127, 43));

        btnProveedores.setText("PROVEEDORES");
        btnProveedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        jPanel2.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 127, 43));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 137, 550, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("PORTAL DE NOMINAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 345, 56));

        ljlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kovacsLogo.png"))); // NOI18N
        jPanel1.add(ljlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chevrolet.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 120, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nisaan.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 120, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toyotaLogo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNominasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNominasActionPerformed
        PortalNominas pNominas = new PortalNominas();
        pNominas.setVisible(true);
        pNominas.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNominasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        PortalProveedores pProveedores = new PortalProveedores();
        pProveedores.setVisible(true);
        pProveedores.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNominas;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel ljlLogo;
    // End of variables declaration//GEN-END:variables
}
