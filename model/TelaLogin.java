package model;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class TelaLogin extends javax.swing.JFrame {
    dados d = new dados();
    
    
    
   
    
    public TelaLogin() {
        initComponents();
//        if(d.conecta("localhost:3306","poseidonturismobd","root","root")){
//            System.out.println("conectou");
//        } else {
//            System.out.println("n conectou");
//        } 
       d.conecta();
                    

        setIcone();
    }
    
        private void setIcone(){
        URL caminhoIcone = getClass().getResource("/images/iconeLogin.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btLogar = new javax.swing.JButton();
        senha = new javax.swing.JPasswordField();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setResizable(false);

        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
            }
        });

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        btLogar.setText("Acessar");
        btLogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLogarMouseClicked(evt);
            }
        });
        btLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarActionPerformed(evt);
            }
        });

        senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaKeyPressed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairMouseClicked(evt);
            }
        });
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(login)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLogar)
                    .addComponent(btSair))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(516, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLogarActionPerformed

    private void btLogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLogarMouseClicked
    try {
        String user = login.getText();
        ResultSet rs = d.consulta("select * from usuarios where login='"+login.getText()+"'");
        if(rs != null && rs.next()){
            String pw = rs.getString("senha");
            String password = String.valueOf(senha.getPassword());
            if(password == null ? pw == null : password.equals(pw)){
                String f = rs.getString("login");
                 MenuPrincipal mp = new MenuPrincipal();
                 mp.setVisible(true);
                 mp.setExtendedState(MAXIMIZED_BOTH);
                 dispose();
                 login.setText("");
                 senha.setText("");
               
            } else {
            JOptionPane.showMessageDialog(this, "Senha inválida!");
            senha.setText("");
            senha.requestFocus();
            }
                
            } else {
            JOptionPane.showMessageDialog(this, "Usuário inválido!");
            login.setText("");
            login.requestFocus();
                    }
        
    } catch (HeadlessException | SQLException e){
    System.err.println(e);   
    }    

        /* MenuPrincipal mp = new MenuPrincipal();
                  mp.setVisible(true);
                  dispose();
                  /*
                  
                  
                

             
        
     /*if(login.getText().equals("admin") && senha.getText().equals("123")){
      MenuPrincipal mp = new MenuPrincipal();
      mp.setVisible(true);
      dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Usuário ou Senha Inválidos!");
    }*/
    }//GEN-LAST:event_btLogarMouseClicked

    private void btSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseClicked
    System.exit(0);
    }//GEN-LAST:event_btSairMouseClicked

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairActionPerformed

    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){  
        senha.requestFocus();
    }
    }//GEN-LAST:event_loginKeyPressed

    private void senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        try {
        String user = login.getText();
        ResultSet rs = d.consulta("select * from usuarios where login='"+login.getText()+"'");
        if(rs != null && rs.next()){
            String pw = rs.getString("senha");
            String password = String.valueOf(senha.getPassword());
            if(password == null ? pw == null : password.equals(pw)){
                String f = rs.getString("login");
                 MenuPrincipal mp = new MenuPrincipal();
                 mp.setVisible(true);
                 mp.setExtendedState(MAXIMIZED_BOTH);
                 dispose();
                 login.setText("");
                 senha.setText("");
               
            } else {
            JOptionPane.showMessageDialog(this, "Senha incorreta");
            }
                
            } else {
            JOptionPane.showMessageDialog(this, "Usuário incorreto");
                    }
        
    } catch (HeadlessException | SQLException e){
    System.err.println(e);   
    }    
    }
    }//GEN-LAST:event_senhaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
