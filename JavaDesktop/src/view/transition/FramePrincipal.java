/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.transition;

import java.awt.BorderLayout;

/**
 *
 * @author hrausch
 */
public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
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

        panelHeader = new javax.swing.JPanel();
        botaoTela1 = new javax.swing.JButton();
        botaoTela2 = new javax.swing.JButton();
        botaoTela3 = new javax.swing.JButton();
        panelBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(51, 51, 255));

        botaoTela1.setText("Tela 1");
        botaoTela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTela1ActionPerformed(evt);
            }
        });

        botaoTela2.setText("Tela 2");
        botaoTela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTela2ActionPerformed(evt);
            }
        });

        botaoTela3.setText("Tela 3");
        botaoTela3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTela3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(botaoTela1)
                .addGap(33, 33, 33)
                .addComponent(botaoTela2)
                .addGap(49, 49, 49)
                .addComponent(botaoTela3)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoTela1)
                    .addComponent(botaoTela2)
                    .addComponent(botaoTela3))
                .addGap(34, 34, 34))
        );

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoTela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTela1ActionPerformed
        // TODO add your handling code here:
        
        //define qual sera' o gerenciador de layout do painel
        panelBody.setLayout(new BorderLayout());
        
        //instancia de um novo objeto da tela que deseja exibir
        Tela1 tela1 = new Tela1();
        tela1.setSize(100, 200);
        
        //remove todos os componentes da tela principal
        panelBody.invalidate();
        panelBody.removeAll();
        
        //adiciona ao topo a tela que deseja exibir
        panelBody.add(tela1,BorderLayout.NORTH);
        
        //redefine a tela principal
        panelBody.revalidate();
        panelBody.repaint();
    }//GEN-LAST:event_botaoTela1ActionPerformed

    private void botaoTela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTela2ActionPerformed
        // TODO add your handling code here:
        //define qual sera' o gerenciador de layout do painel
        panelBody.setLayout(new BorderLayout());
        
        //instancia de um novo objeto da tela que deseja exibir
        Tela2 tela2 = new Tela2("Herbert");        
        tela2.setSize(100, 200);
        
        //remove todos os componentes da tela principal
        panelBody.removeAll();
        panelBody.invalidate();
        
        //adiciona ao topo a tela que deseja exibir
        panelBody.add(tela2,BorderLayout.NORTH);
        
        //redefine a tela principal
        panelBody.revalidate();
        panelBody.repaint();
    }//GEN-LAST:event_botaoTela2ActionPerformed

    private void botaoTela3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTela3ActionPerformed
        // TODO add your handling code here:
        
         //instancia de um novo objeto da tela que deseja exibir - no caso um jframe
        Tela3 tela3 = new Tela3();
        
        //torna o frame visivel.
        tela3.setVisible(true);
    }//GEN-LAST:event_botaoTela3ActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoTela1;
    private javax.swing.JButton botaoTela2;
    private javax.swing.JButton botaoTela3;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    // End of variables declaration//GEN-END:variables
}
