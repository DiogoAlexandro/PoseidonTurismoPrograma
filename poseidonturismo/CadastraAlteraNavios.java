/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas
 */
public class CadastraAlteraNavios extends javax.swing.JFrame {
    dados d = new dados();
    
    public CadastraAlteraNavios() {
        initComponents();
        d.conecta();
        adicionaComboNavios();
        tabelaNavios();
        setIcone();
    }
    
        private void setIcone(){
        URL caminhoIcone = getClass().getResource("/images/iconeNavio.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
    }

    public void tabelaNavios(){
    DefaultTableModel modelotabela = (DefaultTableModel) Tabela.getModel();
        Tabela.setRowSelectionAllowed(false);
    
        modelotabela.setColumnCount(3);
        modelotabela.setRowCount(0);
        Tabela.getColumnModel().getColumn(0).setHeaderValue("Cod. Navios");
        Tabela.getColumnModel().getColumn(1).setHeaderValue("Nome do Navios");
        Tabela.getColumnModel().getColumn(2).setHeaderValue("Status");

        ResultSet rs = d.consulta("select id_navios,nome_navios,status from navios");
       
        int linha = 0;
            try {
             while(rs.next()) {
                    modelotabela.addRow(new String[modelotabela.getColumnCount()]);
                    modelotabela.setValueAt(rs.getString("id_navios"), linha, 0);
                    modelotabela.setValueAt(rs.getString("nome_navios"), linha, 1);
                    modelotabela.setValueAt(rs.getString("status"), linha, 2);
                    linha++;
                              }
                 }
            catch (Exception e) {
                    System.err.println("Erro: " + e);
                                }    
    }


    private void adicionaComboNavios(){
        comboStatus.removeAllItems();
        comboStatus.addItem("Ativo");
        comboStatus.addItem("Inativo");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboStatus = new javax.swing.JComboBox<>();
        nome_navio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        btCadastra = new javax.swing.JButton();
        btAltera = new javax.swing.JButton();
        cd_navios = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar/Alterar Navios\n");
        setResizable(false);

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jScrollPane1.setViewportView(Tabela);

    btCadastra.setText("Cadastrar");
    btCadastra.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
            btCadastraMousePressed(evt);
        }
    });
    btCadastra.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btCadastraActionPerformed(evt);
        }
    });

    btAltera.setText("Alterar");
    btAltera.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
            btAlteraMousePressed(evt);
        }
    });
    btAltera.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btAlteraActionPerformed(evt);
        }
    });
    btAltera.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            btAlteraKeyPressed(evt);
        }
    });

    cd_navios.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            cd_naviosKeyPressed(evt);
        }
    });

    jLabel1.setText("Nome");

    jLabel2.setText("Cod. Navio");

    btBuscar.setText("Buscar");
    btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btBuscarMouseClicked(evt);
        }
    });
    btBuscar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btBuscarActionPerformed(evt);
        }
    });
    btBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            btBuscarKeyPressed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        .addGroup(layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btCadastra)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(nome_navio))
                    .addGap(40, 40, 40)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cd_navios)
                .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(65, 65, 65))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nome_navio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cd_navios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(35, 35, 35)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastraActionPerformed

    private void btAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlteraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlteraActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarActionPerformed

    private void cd_naviosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cd_naviosKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        retornaNavios();
       }
    }//GEN-LAST:event_cd_naviosKeyPressed

    private void btBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btBuscarKeyPressed

    }//GEN-LAST:event_btBuscarKeyPressed

    private void btAlteraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btAlteraKeyPressed

    }//GEN-LAST:event_btAlteraKeyPressed

    private void btAlteraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlteraMousePressed
    alteraNavios();
    }//GEN-LAST:event_btAlteraMousePressed

    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked
    retornaNavios();   
    }//GEN-LAST:event_btBuscarMouseClicked

    private void btCadastraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastraMousePressed
    if(nome_navio.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Digite o nome do navio!");
    } else {
        cadastraNavios();
    }
    }//GEN-LAST:event_btCadastraMousePressed

    public void cadastraNavios(){
        if(d.insereNavios("navios", nome_navio.getText(), String.valueOf(comboStatus.getSelectedItem()))){
        JOptionPane.showMessageDialog(this, "Navio cadastrado com sucesso!");
        nome_navio.setText("");
        cd_navios.setText("");
        tabelaNavios();
        } else {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar!");  
        }
    }
    
    public void alteraNavios(){     
    if(d.atualizaClientes("navios", "status='"+comboStatus.getSelectedItem()+"'","id_navios="+cd_navios.getText()+"")){
        JOptionPane.showMessageDialog(this, "Cadastro alterado!");
        tabelaNavios();
        nome_navio.setText("");
        cd_navios.setText("");
        btCadastra.setEnabled(true);
    } else {
        JOptionPane.showMessageDialog(this, "Erro ao alterar!");
    }
    }
    
   public void retornaNavios(){
       ResultSet rs = d.consulta("select nome_navios from navios where id_navios ="+cd_navios.getText()+"");
       try{
           rs.next();
           btCadastra.setEnabled(false);
           nome_navio.setText(rs.getString("nome_navios"));
       } catch (SQLException e){
           System.out.println(e);
       }
   } 
    
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
            java.util.logging.Logger.getLogger(CadastraAlteraNavios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraAlteraNavios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraAlteraNavios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraAlteraNavios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraAlteraNavios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btAltera;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCadastra;
    private javax.swing.JTextField cd_navios;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome_navio;
    // End of variables declaration//GEN-END:variables
}
