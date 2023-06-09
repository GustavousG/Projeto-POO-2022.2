/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import grupo.urna.CarregarNotas;
import grupo.urna.ValidaHash;
import grupo.urna.ValidaLinha;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz
 */
public class PrimeiraTela extends javax.swing.JFrame {
    
    CarregarNotas carregarN = new CarregarNotas("src\\main\\java\\arqs\\Notas.txt");
    List<String> salvaNotas = carregarN.getSalvaNotas();

    /**
     * Creates new form PrimeiraTela
     */
    public PrimeiraTela() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultParcial = new javax.swing.JButton();
        encerrarVot = new javax.swing.JButton();
        iniciarVotacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultParcial.setText("Resultado Parcial");
        resultParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultParcialActionPerformed(evt);
            }
        });

        encerrarVot.setText("Finalizar");
        encerrarVot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrarVotActionPerformed(evt);
            }
        });

        iniciarVotacao.setText("Votar");
        iniciarVotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarVotacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encerrarVot, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniciarVotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultParcial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(iniciarVotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(resultParcial, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(encerrarVot, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarVotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarVotacaoActionPerformed
        // TODO add your handling code here:
        SegundaTela st = new SegundaTela();
           this.setVisible(false);
           st.setVisible(true);
    }//GEN-LAST:event_iniciarVotacaoActionPerformed

    private void resultParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultParcialActionPerformed
        // TODO add your handling code here:
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for(int i = 0; i<salvaNotas.size();i++){
            switch(Integer.parseInt(salvaNotas.get(i))){
                case 1:
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
                case 3:    
                    n3++;
                    break;
                case 4:
                    n4++;
                    break;
                case 5:
                    n5++;
                    break;
            }
        }
        MostrarResultadoParcial mrp = new MostrarResultadoParcial(n1, n2, n3, n4, n5);
           this.setVisible(false);
           mrp.setVisible(true);
           
    }//GEN-LAST:event_resultParcialActionPerformed

    private void encerrarVotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarVotActionPerformed
        // TODO add your handling code here:
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        ValidaHash validatorArquivo = new ValidaHash();
        if(validatorArquivo.ValidaHash("src\\main\\java\\arqs\\Notas.txt", "src\\main\\java\\arqs\\hashNotas.txt")){
        for(int i = 0; i<salvaNotas.size();i++){
            switch(Integer.parseInt(salvaNotas.get(i))){
                case 1:
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
                case 3:    
                    n3++;
                    break;
                case 4:
                    n4++;
                    break;
                case 5:
                    n5++;
                    break;
            }
        }
        ResultadoFinal rf = new ResultadoFinal(n1, n2, n3, n4, n5);
        this.setVisible(false);
        rf.setVisible(true);
        
        }else JOptionPane.showMessageDialog(this, "Arquivos Comprometidos!!");
        
    }//GEN-LAST:event_encerrarVotActionPerformed

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
            java.util.logging.Logger.getLogger(PrimeiraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimeiraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimeiraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimeiraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimeiraTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton encerrarVot;
    private javax.swing.JButton iniciarVotacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resultParcial;
    // End of variables declaration//GEN-END:variables
}
