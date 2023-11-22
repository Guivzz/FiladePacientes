package projetinho.View;

import projetinho.Controller.InterfaceActions;

public class TelaGuiche extends javax.swing.JFrame {

    InterfaceActions acoes;
    TelaFila telaFilaPadrao;

    public TelaGuiche(InterfaceActions acoes, TelaFila telaFilaPadrao) {

        this.acoes = acoes;
        this.telaFilaPadrao = telaFilaPadrao;
        telaFilaPadrao.setLocal();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloTriagem = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JLabel();
        chamarProximo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        campoCadastro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campoContato1 = new javax.swing.JTextField();
        finalizarGuiche = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(156, 166, 131));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloTriagem.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        tituloTriagem.setForeground(new java.awt.Color(255, 255, 255));
        tituloTriagem.setText("GUICHÊ (INTERNO)");
        tituloTriagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetinho/Assets/Logo.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(tituloTriagem)
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 150));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(156, 166, 131));
        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        campoSenha.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        campoSenha.setText("Nenhuma");
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        chamarProximo.setBackground(new java.awt.Color(188, 198, 167));
        chamarProximo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        chamarProximo.setForeground(new java.awt.Color(255, 255, 255));
        chamarProximo.setText("Chamar Próximo");
        chamarProximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chamarProximoMouseClicked(evt);
            }
        });
        getContentPane().add(chamarProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(156, 166, 131));
        jLabel7.setText("Nome:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        campoNome.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        campoNome.setEnabled(false);
        campoNome.setName(""); // NOI18N
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 139, 32));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(156, 166, 131));
        jLabel14.setText("Contato:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        campoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(campoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 139, 32));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(156, 166, 131));
        jLabel13.setText("Cadastro:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        campoContato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContato1ActionPerformed(evt);
            }
        });
        getContentPane().add(campoContato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 139, 32));

        finalizarGuiche.setBackground(new java.awt.Color(188, 198, 167));
        finalizarGuiche.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        finalizarGuiche.setForeground(new java.awt.Color(255, 255, 255));
        finalizarGuiche.setText("Finalizar");
        finalizarGuiche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarGuicheMouseClicked(evt);
            }
        });
        getContentPane().add(finalizarGuiche, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chamarProximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chamarProximoMouseClicked
        // TODO add your handling code here:
        chamarProximo();
    }//GEN-LAST:event_chamarProximoMouseClicked

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed

    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadastroActionPerformed

    }//GEN-LAST:event_campoCadastroActionPerformed

    private void campoContato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContato1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContato1ActionPerformed

    private void finalizarGuicheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarGuicheMouseClicked
        // TODO add your handling code here:
        finalizarGuiche();
    }//GEN-LAST:event_finalizarGuicheMouseClicked

    public void chamarProximo() {
        String senha = acoes.chamadorGuiche().getSenha();
        campoSenha.setText(senha);

        telaFilaPadrao.setSenha(senha); //Exibe a chamada na telaFila
        
        campoNome.setText(acoes.chamadorGuiche().getNome());
        campoContato1.setText("");
        campoCadastro.setText("");
    }

    public void finalizarGuiche() {
        acoes.editorGuiche(campoCadastro.getText(), Integer.parseInt(campoCadastro.getText()));
        campoNome.setText("");
        campoContato1.setText("");
        campoCadastro.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCadastro;
    private javax.swing.JTextField campoContato1;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel campoSenha;
    private javax.swing.JButton chamarProximo;
    private javax.swing.JButton finalizarGuiche;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tituloTriagem;
    // End of variables declaration//GEN-END:variables
}
