/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Herbert
 */
public class Principal extends javax.swing.JFrame {
    
    ArrayList<String> usuarios = new ArrayList<>();

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        inputLogin = new javax.swing.JTextField();
        inputCpf = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
        botaoAtualizar = new javax.swing.JButton();
        botaoAdicionarLinha = new javax.swing.JButton();
        botaoRemoverLinha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputLogin.setText("Login");
        inputLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputLoginFocusLost(evt);
            }
        });

        inputCpf.setText("CPF");
        inputCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCpfFocusLost(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "login 1"},
                {"2", "login 2"},
                {"3", "login 3"}
            },
            new String [] {
                "CPF", "Login"
            }
        ));
        CellEditorListener evento = new CellEditorListener() {
            public void editingCanceled(ChangeEvent e) {
                System.out.println("Cancelou edicao");
            }

            public void editingStopped(ChangeEvent e) {
                System.out.println("Finalizou edicao");
            }
        };
        tableUsuarios.getDefaultEditor(String.class).addCellEditorListener(evento);
        jScrollPane1.setViewportView(tableUsuarios);

        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        botaoAdicionarLinha.setText("Nova Linha");
        botaoAdicionarLinha.setActionCommand("Adicionar Linha");
        botaoAdicionarLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarLinhaActionPerformed(evt);
            }
        });

        botaoRemoverLinha.setText("Remover item selecionado");
        botaoRemoverLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverLinhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoRemoverLinha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAdicionarLinha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAtualizar))))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addComponent(inputCpf))
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtualizar)
                    .addComponent(botaoAdicionarLinha)
                    .addComponent(botaoRemoverLinha))
                .addGap(168, 168, 168)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCpfFocusGained
        // TODO add your handling code here:
        inputCpf.setText("");
    }//GEN-LAST:event_inputCpfFocusGained

    private void inputLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputLoginFocusGained
        // TODO add your handling code here:
        inputLogin.setText("");
    }//GEN-LAST:event_inputLoginFocusGained

    private void inputCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCpfFocusLost
        // TODO add your handling code here:
        if(inputCpf.getText().equals(""))
            inputCpf.setText("CPF");
            
    }//GEN-LAST:event_inputCpfFocusLost

    private void inputLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputLoginFocusLost
        // TODO add your handling code here:
        if(inputLogin.getText().equals(""))
            inputLogin.setText("Login");
    }//GEN-LAST:event_inputLoginFocusLost

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
        String cpf, login;
        
        cpf = inputCpf.getText();
        login = inputLogin.getText();
        
        if( cpf.equals("") || login.equals("") ){
            
            JOptionPane.showMessageDialog(this, "Campo CPF e Login são de preenchimento obrigatório!");
            
        }       
        else{
            DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
            String a [] = new String[] {cpf, login};
            dtm.addRow( a );
        }
        identificarElementoSelecionado();
        
//        identificarElementosCheckboxPainel1();
        


         
    }//GEN-LAST:event_botaoSalvarActionPerformed

//    public void identificarElementosCheckboxPainel1()
//    {
//         Component[] components = jPanel1.getComponents();
//            for ( Component c : components ) {
//              JCheckBox cb = (JCheckBox)c;
//              if (cb.isSelected())
//                System.out.println("With " + cb.getText());
//            }
//    }
    
   
     private void atualizarValoresAlterados(ListSelectionEvent evt){
         System.out.println("Aha");
     }
                    
    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        int numRows = dtm.getRowCount();
        
        for(int i = 0; i < numRows; i++){
            String cpf = dtm.getValueAt(i, 0).toString();
            String login = dtm.getValueAt(i, 1).toString();
            
            dtm.setValueAt(login+"-atualizado", i, 1);
            
             JOptionPane.showMessageDialog(this, "CPF e Login:\n" + cpf + " - "+login);
        }
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private void botaoAdicionarLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarLinhaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
       dtm.addRow(new String [] {"", "" });
              
    }//GEN-LAST:event_botaoAdicionarLinhaActionPerformed

    private void botaoRemoverLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverLinhaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        
       
            int rowSelected = tableUsuarios.getSelectedRow();
            
            if(rowSelected == -1){
                JOptionPane.showMessageDialog(this, "Selecione a linha que quer remover antes de clicar no botão!");
            }
            else{
                int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover a linha selecionada?","Confime a sua operação", JOptionPane.YES_NO_OPTION);
               
                if(opcao == JOptionPane.YES_OPTION)
                    dtm.removeRow(rowSelected);
            }
       
        
        
    }//GEN-LAST:event_botaoRemoverLinhaActionPerformed

    
    public void identificarElementoSelecionado(){
        
                 for (Enumeration<AbstractButton> buttons = buttonGroup2.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                System.out.println(button.getText());
                break;
            }
        }
        
    }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarLinha;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoRemoverLinha;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField inputCpf;
    private javax.swing.JTextField inputLogin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUsuarios;
    // End of variables declaration//GEN-END:variables
}
