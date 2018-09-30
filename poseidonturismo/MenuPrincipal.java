package poseidonturismo;


import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setIcone();

    }

private void setIcone(){
        URL caminhoIcone = getClass().getResource("/images/iconeMenuPrincipal.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconeNavioMenuPrincipal.png"))); // NOI18N

        jTextField1.setFont(new java.awt.Font("Harlow Solid Italic", 2, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 102, 255));
        jTextField1.setText("Poseidon Turismos");

        jMenu1.setText("Clientes");

        jMenu3.setText("Cadastrar/Alterar Clientes");
        jMenu3.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu3MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenu1.add(jMenu3);

        jMenu4.setText("Visualizar Clientes Cadastrados");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu4MousePressed(evt);
            }
        });
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Vendas");

        jMenu5.setText("Menu de Vendas");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu5MousePressed(evt);
            }
        });
        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu11.setText("Relatórios");

        jMenuItem1.setText("Relatório por Telefone");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu11.add(jMenuItem1);

        jMenuItem2.setText("Relatório por Data");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenu11.add(jMenuItem2);

        jMenuBar1.add(jMenu11);

        jMenu6.setText("Navios");

        jMenu7.setText("Cadastar/Alterar Motoristas");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu7MousePressed(evt);
            }
        });
        jMenu6.add(jMenu7);

        jMenuBar1.add(jMenu6);

        jMenu9.setText("Pacotes");

        jMenu10.setText("Cadastrar/Alterar Produtos");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu10MousePressed(evt);
            }
        });
        jMenu10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu10KeyPressed(evt);
            }
        });
        jMenu9.add(jMenu10);

        jMenuBar1.add(jMenu9);

        jMenu8.setText("Sair");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu8MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 559, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 82, Short.MAX_VALUE)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 383, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(20, 20, 20))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
      Cadastra_AlteraCli c_ac = new Cadastra_AlteraCli();
      c_ac.setVisible(true);
      c_ac.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu3MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu3MenuKeyPressed
        Cadastra_AlteraCli c_ac = new Cadastra_AlteraCli();
        c_ac.setVisible(true);
        c_ac.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenu3MenuKeyPressed

    private void jMenu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MousePressed
        MenuVendas mv = new MenuVendas();
        mv.setVisible(true);
        mv.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenu5MousePressed

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
        Cadastra_AlteraCli c_ac = new Cadastra_AlteraCli();
        c_ac.setVisible(true);
        c_ac.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenu3MousePressed

    private void jMenu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MousePressed
        ClientesCadastrados cc = new ClientesCadastrados();
        cc.setVisible(true);
        cc.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenu4MousePressed

    private void jMenu10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu10KeyPressed

    }//GEN-LAST:event_jMenu10KeyPressed

    private void jMenu10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MousePressed
       AlteraValorPadrao avp = new AlteraValorPadrao();
       avp.setVisible(true);
    }//GEN-LAST:event_jMenu10MousePressed

    private void jMenu7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MousePressed
       CadastraAlteraMotoristas cam = new CadastraAlteraMotoristas();
       cam.setVisible(true);
    }//GEN-LAST:event_jMenu7MousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
       relatorioClienteTelefone rct = new relatorioClienteTelefone();
       rct.setVisible(true);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
       RelatorioData rd = new RelatorioData();
       rd.setVisible(true);
       rd.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenuItem2MousePressed

    private void jMenu8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MousePressed
     System.exit(0);
    }//GEN-LAST:event_jMenu8MousePressed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal mp = new MenuPrincipal();
                mp.setVisible(true);
                mp.setExtendedState(MAXIMIZED_BOTH);
              }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
