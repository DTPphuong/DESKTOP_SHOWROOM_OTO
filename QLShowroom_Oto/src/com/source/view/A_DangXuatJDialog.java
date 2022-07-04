/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.source.view;

import com.source.utils.Auth;
import com.source.utils.MsgBox;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class A_DangXuatJDialog extends javax.swing.JDialog {

    /** Creates new form ĐangXuatJDialog */
    public A_DangXuatJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(150,150,150));
    }
     public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(255,255,255));
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        pnldangxuat = new javax.swing.JPanel();
        lbldangxuat = new javax.swing.JLabel();
        pnlketthuc = new javax.swing.JPanel();
        lblketthuc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pnl1.setBackground(new java.awt.Color(255, 255, 255));

        pnldangxuat.setBackground(new java.awt.Color(255, 255, 255));
        pnldangxuat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnldangxuat.setLayout(new java.awt.BorderLayout());

        lbldangxuat.setBackground(new java.awt.Color(255, 255, 255));
        lbldangxuat.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbldangxuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldangxuat.setText("ĐĂNG XUẤT");
        lbldangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldangxuatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbldangxuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbldangxuatMouseExited(evt);
            }
        });
        pnldangxuat.add(lbldangxuat, java.awt.BorderLayout.CENTER);

        pnlketthuc.setBackground(new java.awt.Color(255, 255, 255));
        pnlketthuc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlketthuc.setLayout(new java.awt.BorderLayout());

        lblketthuc.setBackground(new java.awt.Color(255, 255, 255));
        lblketthuc.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblketthuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblketthuc.setText("KẾT THÚC");
        lblketthuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblketthucMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblketthucMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblketthucMouseExited(evt);
            }
        });
        pnlketthuc.add(lblketthuc, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlketthuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnldangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnldangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(pnl1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblketthucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblketthucMouseClicked
        // TODO add your handling code here:
        if (MsgBox.confirm(this, "Bạn muốn kết thúc ứng dụng?")) {
            System.exit(0);
        }else{
            this.dispose();
        }
    }//GEN-LAST:event_lblketthucMouseClicked

    private void lbldangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldangxuatMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Auth.clear();
        new A_DangNhapJDialog(null, true).setVisible(true);
    }//GEN-LAST:event_lbldangxuatMouseClicked

    private void lbldangxuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldangxuatMouseExited
        // TODO add your handling code here:
        resetColor(pnldangxuat);
    }//GEN-LAST:event_lbldangxuatMouseExited

    private void lbldangxuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldangxuatMouseEntered
        // TODO add your handling code here:
        setColor(pnldangxuat);
    }//GEN-LAST:event_lbldangxuatMouseEntered

    private void lblketthucMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblketthucMouseExited
        // TODO add your handling code here:
        resetColor(pnlketthuc);
    }//GEN-LAST:event_lblketthucMouseExited

    private void lblketthucMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblketthucMouseEntered
        // TODO add your handling code here:
        setColor(pnlketthuc);
    }//GEN-LAST:event_lblketthucMouseEntered

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
            java.util.logging.Logger.getLogger(A_DangXuatJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_DangXuatJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_DangXuatJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_DangXuatJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                A_DangXuatJDialog dialog = new A_DangXuatJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbldangxuat;
    private javax.swing.JLabel lblketthuc;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnldangxuat;
    private javax.swing.JPanel pnlketthuc;
    // End of variables declaration//GEN-END:variables

}