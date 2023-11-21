package projetinho.View;

import projetinho.Controller.InterfaceActions;

public class TelaTriagem extends javax.swing.JFrame {

    InterfaceActions acoes;
    TelaFila telaFila;

    public TelaTriagem(InterfaceActions acoes, TelaFila telaFila) {
        this.acoes = acoes;
        this.telaFila = telaFila;
        telaFila.setLocal();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoNome = new javax.swing.JTextField();
        campoIdade = new javax.swing.JTextField();
        finalizarTriagem = new javax.swing.JButton();
        chamarProximo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoSintoma = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tituloTriagem = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        prioridadeText = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoNome.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        campoNome.setName(""); // NOI18N
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 139, 32));

        campoIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdadeActionPerformed(evt);
            }
        });
        getContentPane().add(campoIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 139, 32));

        finalizarTriagem.setBackground(new java.awt.Color(188, 198, 167));
        finalizarTriagem.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        finalizarTriagem.setForeground(new java.awt.Color(255, 255, 255));
        finalizarTriagem.setText("Finalizar");
        finalizarTriagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarTriagemMouseClicked(evt);
            }
        });
        getContentPane().add(finalizarTriagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

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

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(156, 166, 131));
        jLabel1.setText("Senha:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        campoSenha.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        campoSenha.setText("Nenhuma");
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetinho/Assets/Logo.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 119, 150));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(156, 166, 131));
        jLabel8.setText("Prioridade:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(5, 31, 230));
        jLabel9.setText("0 - NÃO URGENTE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 321, 171, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(98, 191, 61));
        jLabel10.setText("1 - POUCO URGENTE");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 351, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(222, 192, 60));
        jLabel11.setText("2 - URGENTE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 378, -1, -1));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(194, 45, 39));
        jLabel12.setText("3 - EMERGÊNCIA");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 405, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(156, 166, 131));
        jLabel7.setText("Nome:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(156, 166, 131));
        jLabel13.setText("Sintomas:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        campoSintoma.setColumns(20);
        campoSintoma.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        campoSintoma.setRows(5);
        jScrollPane1.setViewportView(campoSintoma);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(156, 166, 131));
        jLabel14.setText("Idade:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jPanel1.setBackground(new java.awt.Color(156, 166, 131));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloTriagem.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        tituloTriagem.setForeground(new java.awt.Color(255, 255, 255));
        tituloTriagem.setText("TRIAGEM (INTERNO)");
        tituloTriagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(tituloTriagem)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 660, 150));

        jScrollPane2.setViewportView(prioridadeText);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed

    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdadeActionPerformed

    }//GEN-LAST:event_campoIdadeActionPerformed

    private void finalizarTriagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarTriagemMouseClicked
        // TODO add your handling code here:
        finalizarTriagem();
    }//GEN-LAST:event_finalizarTriagemMouseClicked

    private void chamarProximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chamarProximoMouseClicked
        // TODO add your handling code here:
        chamarProximo();
    }//GEN-LAST:event_chamarProximoMouseClicked

    public void chamarProximo() {
        String senha = acoes.chamadorTriagem().getSenha();                    // chama o paciente da filaTriagem pela senha, dessa forma consegui retornar a senha em si.
        campoSenha.setText(senha);

        telaFila.setSenha(senha);

        System.out.println("Proximo");
        campoNome.setText("");
        campoSintoma.setText("");
        campoIdade.setText("");
    }

    public void finalizarTriagem() {
        acoes.editorTriagem(campoNome.getText(), Integer.parseInt(campoIdade.getText()), campoSintoma.getText(), Integer.parseInt(prioridadeText.getText())); // edita as informações do paciente e adiciona a filaGuiche
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoIdade;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel campoSenha;
    private javax.swing.JTextArea campoSintoma;
    private javax.swing.JButton chamarProximo;
    private javax.swing.JButton finalizarTriagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane prioridadeText;
    private javax.swing.JLabel tituloTriagem;
    // End of variables declaration//GEN-END:variables
}
