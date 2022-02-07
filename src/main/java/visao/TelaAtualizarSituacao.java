/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.AlunoControle;
import javax.swing.JOptionPane;
import modelo.Aluno;

/**
 *
 * @author gdsant
 */


public class TelaAtualizarSituacao extends javax.swing.JInternalFrame {

        private Aluno aluno;
    /**
     * Creates new form TelaAtualizarSituacao
     */
    public TelaAtualizarSituacao(Aluno aluno) {
        initComponents();
        this.aluno = aluno; 
        
        setarCampos();
    }
    
    public void setarCampos(){
        labelMatriculaAlunoAlterar
                .setText(String.valueOf(aluno.getMatricula()));
        labelNomeAlunoAlterar
                .setText(aluno.getNome());
        
        if(aluno.getSituacao().equals("Em_processo") ){
            comboBoxSituacao.setSelectedIndex(Aluno.EM_PROCESSO);
            
            
        }else if (aluno.getSituacao().equals("Aprovador")){
            comboBoxSituacao.setSelectedIndex(Aluno.APROVADO);
        }else if (aluno.getSituacao().equals("Reprovado")) {
            comboBoxSituacao.setSelectedIndex(Aluno.REPROVADO);
            
        }else {
            comboBoxSituacao.setSelectedIndex(Aluno.RECUPERACAO);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        comboBoxSituacao = new javax.swing.JComboBox<>();
        labelSituacao = new javax.swing.JLabel();
        labelNomeAlunoAlterar = new javax.swing.JLabel();
        labelMatriculaAlunoAlterar = new javax.swing.JLabel();

        setClosable(true);

        painelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        painelTitulo.setBackground(new java.awt.Color(0, 102, 102));
        painelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Alterar Situação");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelNome.setBackground(new java.awt.Color(255, 255, 255));
        labelNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setText("NOME:");

        labelMatricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelMatricula.setForeground(new java.awt.Color(255, 255, 255));
        labelMatricula.setText("MATRÍCULA:");

        btnSalvar.setBackground(new java.awt.Color(0, 102, 102));
        btnSalvar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.setBorder(null);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        comboBoxSituacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        comboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em processo", "Aprovado", "Reprovado", "Recuperação" }));

        labelSituacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelSituacao.setForeground(new java.awt.Color(255, 255, 255));
        labelSituacao.setText("SITUAÇÃO:");

        labelNomeAlunoAlterar.setText("nome do aluno");

        labelMatriculaAlunoAlterar.setText("matrícula do aluno");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMatricula)
                    .addComponent(labelNome)
                    .addComponent(labelSituacao))
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(comboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelNomeAlunoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelMatriculaAlunoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(labelNomeAlunoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelMatriculaAlunoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelMatricula))
                .addGap(16, 16, 16)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSituacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       String situacao = String.valueOf(comboBoxSituacao.getSelectedItem());
       
       aluno.setSituacao(situacao);
      try {
         if( AlunoControle.alterarSituacao(aluno.getMatricula(), aluno.getSituacao())){
         JOptionPane.showMessageDialog(this, "Alterado com sucesso!");
         this.dispose();
         }
      }catch(Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboBoxSituacao;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelMatriculaAlunoAlterar;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomeAlunoAlterar;
    private javax.swing.JLabel labelSituacao;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelTitulo;
    // End of variables declaration//GEN-END:variables
}