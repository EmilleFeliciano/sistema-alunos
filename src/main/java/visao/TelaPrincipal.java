/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

/**
 *
 * @author Emille
 */
public class TelaPrincipal extends javax.swing.JFrame {

            private int quantidadeComponentesInicial;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        quantidadeComponentesInicial = areaPrincipal.getComponentCount();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaPrincipal = new javax.swing.JDesktopPane();
        painelPrincipal = new javax.swing.JPanel();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelAcessoFacil = new javax.swing.JLabel();
        btnCadastrarAluno = new javax.swing.JButton();
        btnBuscarEndereco = new javax.swing.JButton();
        btnExcluirAluno = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        menuItemCadastrarAluno = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuItemAlterarDados = new javax.swing.JMenuItem();
        menuItemAtualizarSituacao = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        menuItemBuscarPorSerie = new javax.swing.JMenuItem();
        menuItemListarTodos = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        submenuContato = new javax.swing.JMenuItem();
        submenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Alunos");

        painelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        painelTitulo.setBackground(new java.awt.Color(0, 102, 102));
        painelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("SISTEMA ALUNOS");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(labelTitulo)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        labelAcessoFacil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelAcessoFacil.setForeground(new java.awt.Color(204, 204, 204));
        labelAcessoFacil.setText("Acesso Fácil:");

        btnCadastrarAluno.setBackground(new java.awt.Color(0, 102, 102));
        btnCadastrarAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrarAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarAluno.setText("CADASTRAR ALUNO");
        btnCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAlunoActionPerformed(evt);
            }
        });

        btnBuscarEndereco.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscarEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarEndereco.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEndereco.setText("BUSCAR ENDEREÇO");

        btnExcluirAluno.setBackground(new java.awt.Color(0, 102, 102));
        btnExcluirAluno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirAluno.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirAluno.setText("EXCLUIR ALUNO");
        btnExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlunoActionPerformed(evt);
            }
        });

        labelLogo.setText("jLabel1");
        labelLogo.setMinimumSize(new java.awt.Dimension(388, 227));

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAcessoFacil)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnBuscarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(labelAcessoFacil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        areaPrincipal.setLayer(painelPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout areaPrincipalLayout = new javax.swing.GroupLayout(areaPrincipal);
        areaPrincipal.setLayout(areaPrincipalLayout);
        areaPrincipalLayout.setHorizontalGroup(
            areaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        areaPrincipalLayout.setVerticalGroup(
            areaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuCadastrar.setText("Cadastro");

        menuItemCadastrarAluno.setText("Cadastrar aluno");
        menuItemCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarAlunoActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuItemCadastrarAluno);

        barraMenu.add(menuCadastrar);

        menuEditar.setText("Editar");

        menuItemAlterarDados.setText("Alterar Dados do Aluno");
        menuItemAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAlterarDadosActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemAlterarDados);

        menuItemAtualizarSituacao.setText("Alterar Situação do Aluno");
        menuItemAtualizarSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAtualizarSituacaoActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemAtualizarSituacao);

        barraMenu.add(menuEditar);

        menuConsultar.setText("Consultar");

        menuItemBuscarPorSerie.setText("Buscar Aluno por Série");
        menuItemBuscarPorSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarPorSerieActionPerformed(evt);
            }
        });
        menuConsultar.add(menuItemBuscarPorSerie);

        menuItemListarTodos.setText("Listar Todos os Alunos");
        menuItemListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarTodosActionPerformed(evt);
            }
        });
        menuConsultar.add(menuItemListarTodos);

        barraMenu.add(menuConsultar);

        menuAjuda.setText("Ajuda");

        submenuContato.setText("Contato");
        submenuContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuContatoActionPerformed(evt);
            }
        });
        menuAjuda.add(submenuContato);

        submenuSobre.setText("Sobre");
        submenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(submenuSobre);

        barraMenu.add(menuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarAlunoActionPerformed
            abrirJanelaCadastro();
    }//GEN-LAST:event_menuItemCadastrarAlunoActionPerformed

    private void btnCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAlunoActionPerformed
        abrirJanelaCadastro();
    }//GEN-LAST:event_btnCadastrarAlunoActionPerformed

            private void abrirJanelaCadastro(){
            if(areaPrincipal.getComponentCount () == quantidadeComponentesInicial ){
            TelaCadastrarAluno telaCadastrarAluno = new TelaCadastrarAluno();
             areaPrincipal.add(telaCadastrarAluno);
            telaCadastrarAluno.setVisible(true); 
            }
        }
    private void btnExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirAlunoActionPerformed

    private void submenuContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submenuContatoActionPerformed

    private void submenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submenuSobreActionPerformed

    private void menuItemBuscarPorSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarPorSerieActionPerformed
        if (areaPrincipal.getComponentCount() == quantidadeComponentesInicial) {
            TelaBuscarporSerie telaBuscarporSerie = new TelaBuscarporSerie();
            areaPrincipal.add(telaBuscarporSerie);
            telaBuscarporSerie.setVisible(true);
        }
    }//GEN-LAST:event_menuItemBuscarPorSerieActionPerformed

    private void menuItemListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarTodosActionPerformed
        if (areaPrincipal.getComponentCount() == quantidadeComponentesInicial) {
            TelaListagemAlunos telaListagemAlunos 
                    = new TelaListagemAlunos();
            areaPrincipal.add(telaListagemAlunos);
            telaListagemAlunos.setVisible(true);
        }
    }//GEN-LAST:event_menuItemListarTodosActionPerformed

    private void menuItemAtualizarSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAtualizarSituacaoActionPerformed
       
    }//GEN-LAST:event_menuItemAtualizarSituacaoActionPerformed

    private void menuItemAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAlterarDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemAlterarDadosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaPrincipal;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnBuscarEndereco;
    private javax.swing.JButton btnCadastrarAluno;
    private javax.swing.JButton btnExcluirAluno;
    private javax.swing.JLabel labelAcessoFacil;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuItemAlterarDados;
    private javax.swing.JMenuItem menuItemAtualizarSituacao;
    private javax.swing.JMenuItem menuItemBuscarPorSerie;
    private javax.swing.JMenuItem menuItemCadastrarAluno;
    private javax.swing.JMenuItem menuItemListarTodos;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JMenuItem submenuContato;
    private javax.swing.JMenuItem submenuSobre;
    // End of variables declaration//GEN-END:variables
}
