/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author 23.01425-3
 */
public class TelaRegras1 extends javax.swing.JFrame {

    /**
     * Creates new form TelaRegras1
     */
    public TelaRegras1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avancarButton = new javax.swing.JButton();
        telaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        avancarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avancarButton.setForeground(new java.awt.Color(255, 255, 255));
        avancarButton.setText("avançar");
        avancarButton.setBorder(null);
        avancarButton.setBorderPainted(false);
        avancarButton.setContentAreaFilled(false);
        avancarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(avancarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 660, -1, -1));

        telaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telaRegras1Imagem.png"))); // NOI18N
        telaLabel.setToolTipText("");
        getContentPane().add(telaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avancarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarButtonActionPerformed
       var telaRegras2 = new TelaRegras2();
       telaRegras2.setVisible(true);
       dispose();
    }//GEN-LAST:event_avancarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRegras1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRegras1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRegras1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRegras1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRegras1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avancarButton;
    private javax.swing.JLabel telaLabel;
    // End of variables declaration//GEN-END:variables
}
