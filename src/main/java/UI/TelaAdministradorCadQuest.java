/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import Connection_Questoes.Questoes;
import Connection_MySQL_QuestoesDAO.QuestoesDAO;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author 23.01425-3
 */
public class TelaAdministradorCadQuest extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdministradorCadUsu
     */
    public TelaAdministradorCadQuest() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        cadastrarButton = new javax.swing.JButton();
        DoskaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enunciadoTextArea = new javax.swing.JTextArea();
        alternativaATextField = new javax.swing.JTextField();
        alternativaBTextField = new javax.swing.JTextField();
        alternativaCTextField = new javax.swing.JTextField();
        alternativaDTextField = new javax.swing.JTextField();
        qqrLabel = new javax.swing.JLabel();
        rcARadioButton = new javax.swing.JRadioButton();
        rcBRadioButton = new javax.swing.JRadioButton();
        rcCRadioButton = new javax.swing.JRadioButton();
        rcDRadioButton = new javax.swing.JRadioButton();
        idTextField = new javax.swing.JTextField();
        RespDefinida = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Usuários");
        setBackground(new java.awt.Color(255, 255, 255));

        cadastrarButton.setText("cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        DoskaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pixil-frame-0__1__Easy-Resize.com-removebg-preview.png"))); // NOI18N
        DoskaLabel.setText("jLabel1");

        enunciadoTextArea.setColumns(20);
        enunciadoTextArea.setRows(5);
        enunciadoTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Enunciado da questão:"));
        jScrollPane1.setViewportView(enunciadoTextArea);

        alternativaATextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa A:"));

        alternativaBTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa B:"));
        alternativaBTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaBTextFieldActionPerformed(evt);
            }
        });

        alternativaCTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa C:"));
        alternativaCTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaCTextFieldActionPerformed(evt);
            }
        });

        alternativaDTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Alternativa D:"));
        alternativaDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativaDTextFieldActionPerformed(evt);
            }
        });

        qqrLabel.setText("Alternativa correta:");

        buttonGroup1.add(rcARadioButton);
        rcARadioButton.setText("Alternativa A");
        rcARadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcARadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(rcBRadioButton);
        rcBRadioButton.setText("Alternativa B");
        rcBRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcBRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(rcCRadioButton);
        rcCRadioButton.setText("Alternativa C");
        rcCRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcCRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(rcDRadioButton);
        rcDRadioButton.setText("Alternativa D");
        rcDRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcDRadioButtonActionPerformed(evt);
            }
        });

        idTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("id"));
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Definir alternativa correta");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DoskaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(alternativaATextField)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                                .addComponent(alternativaBTextField)
                                .addComponent(alternativaCTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(alternativaDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(qqrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rcBRadioButton)
                                        .addComponent(rcCRadioButton)
                                        .addComponent(rcDRadioButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rcARadioButton)
                                        .addGap(19, 19, 19)))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RespDefinida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 304, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alternativaATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(alternativaBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alternativaCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alternativaDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RespDefinida, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qqrLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rcARadioButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rcBRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(rcCRadioButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 11, Short.MAX_VALUE)
                                .addComponent(DoskaLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rcDRadioButton)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alternativaDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alternativaDTextFieldActionPerformed

    private void alternativaCTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaCTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alternativaCTextFieldActionPerformed

    private void alternativaBTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativaBTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alternativaBTextFieldActionPerformed

    private void rcARadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcARadioButtonActionPerformed

    }//GEN-LAST:event_rcARadioButtonActionPerformed

    private void rcBRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcBRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcBRadioButtonActionPerformed

    private void rcCRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcCRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcCRadioButtonActionPerformed

    private void rcDRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcDRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcDRadioButtonActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        try{
            
            String id = idTextField.getText();
            String alternativaA = alternativaATextField.getText();
            String alternativaB = alternativaBTextField.getText();
            String alternativaC = alternativaCTextField.getText();
            String alternativaD = alternativaDTextField.getText();
            String perguntas = enunciadoTextArea.getText();         
            String respostas = null;
                if(rcARadioButton.isSelected()){
                    respostas = rcARadioButton.getText();
                }
                if(rcBRadioButton.isSelected()){
                    respostas = rcBRadioButton.getText();
                }
                if(rcCRadioButton.isSelected()){
                    respostas = rcCRadioButton.getText();
                }
                if(rcDRadioButton.isSelected()){
                    respostas = rcDRadioButton.getText();
                }
            String idBusca1 = "";
            
                 
            
            Questoes q = new Questoes (id, alternativaA, alternativaB, alternativaC, alternativaD, perguntas, respostas, idBusca1);
            QuestoesDAO dao = new QuestoesDAO();
            //colocar aqui o código para verificar se todos os campos estão preenchidos!
            if(dao.verificacao(q)){
                 showMessageDialog(null, "Questão já cadastrada.");
            }
            else{
                var administradorQuestoes = new TelaAdministradorQuestoes();
                administradorQuestoes.setVisible(true);
                dispose();
            }
            dao.cadastrar(q);  


        }
        catch(Exception e){
             showMessageDialog(null, "Falha técnica. Tente novamente mais tarde");
             e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(rcARadioButton.isSelected()){
            RespDefinida.setText("Resposta certa definida: Letra A");
        }
        if(rcBRadioButton.isSelected()){
            RespDefinida.setText("Resposta certa definida: Letra B");
        }
        if(rcCRadioButton.isSelected()){
            RespDefinida.setText("Resposta certa definida: Letra C");
        }
        if(rcDRadioButton.isSelected()){
            RespDefinida.setText("Resposta certa definida: Letra D");
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAdministradorCadQuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdministradorCadQuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdministradorCadQuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdministradorCadQuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdministradorCadQuest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoskaLabel;
    private javax.swing.JLabel RespDefinida;
    private javax.swing.JTextField alternativaATextField;
    private javax.swing.JTextField alternativaBTextField;
    private javax.swing.JTextField alternativaCTextField;
    private javax.swing.JTextField alternativaDTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JTextArea enunciadoTextArea;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel qqrLabel;
    private javax.swing.JRadioButton rcARadioButton;
    private javax.swing.JRadioButton rcBRadioButton;
    private javax.swing.JRadioButton rcCRadioButton;
    private javax.swing.JRadioButton rcDRadioButton;
    // End of variables declaration//GEN-END:variables
}
