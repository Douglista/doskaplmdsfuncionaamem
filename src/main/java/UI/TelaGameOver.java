/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Jogo.Jogo;

/**
 *
 * @author 23.01425-3
 */
public class TelaGameOver extends javax.swing.JFrame {

     Jogo jogo;
     String ra;
    /**
     * Creates new form TelaGameOver
     */
     public TelaGameOver(){}
    public TelaGameOver(Jogo jogo) {
        initComponents();
        setLocationRelativeTo(null);
        this.ra = jogo.getRa();
        this.jogo = jogo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        irPontuacaoButton = new javax.swing.JButton();
        irRankingButtonLabel = new javax.swing.JLabel();
        telaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        irPontuacaoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/VerSuaPontua.jpg"))); // NOI18N
        irPontuacaoButton.setBorderPainted(false);
        irPontuacaoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        irPontuacaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irPontuacaoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(irPontuacaoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 230, 40));

        irRankingButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doska appeared (4).png"))); // NOI18N
        getContentPane().add(irRankingButtonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        telaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doska appeared (3).png"))); // NOI18N
        getContentPane().add(telaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void irPontuacaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irPontuacaoButtonActionPerformed

        var telaPontuacao = new TelaPontuacao(Integer.parseInt(jogo.getPontuacao()));
        telaPontuacao.setVisible(true);
        dispose();
    }//GEN-LAST:event_irPontuacaoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGameOver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton irPontuacaoButton;
    private javax.swing.JLabel irRankingButtonLabel;
    private javax.swing.JLabel telaLabel;
    // End of variables declaration//GEN-END:variables
}
