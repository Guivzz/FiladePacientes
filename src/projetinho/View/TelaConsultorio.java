/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetinho.View;

import projetinho.Controller.InterfaceActions;
import projetinho.Model.Paciente;
import projetinho.Controller.FilaException;

public class TelaConsultorio extends javax.swing.JFrame {

    InterfaceActions acoes;
    TelaFila telaFila;
    Paciente paciente = null;

    public TelaConsultorio(InterfaceActions acoes, TelaFila telaFila) {

        this.acoes = acoes;
        this.telaFila = telaFila;
        telaFila.setLocal();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        campoNome = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        campoPrioridade = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        campoIdade = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tituloTriagem = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        campoPrescricao = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        campoSintoma = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        campoContato = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        campoSenha = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoNome.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(campoNome);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 139, 32));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(156, 166, 131));
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 40, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(156, 166, 131));
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 41, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(156, 166, 131));
        jLabel3.setText("Idade:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 41, -1));

        campoPrioridade.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(campoPrioridade);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 90, 32));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(156, 166, 131));
        jLabel4.setText("Prioridade:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(156, 166, 131));
        jLabel6.setText("Prescrição:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        campoIdade.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jScrollPane7.setViewportView(campoIdade);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 80, 32));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(156, 166, 131));
        jLabel7.setText("Tel. :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 41, -1));

        jButton1.setBackground(new java.awt.Color(188, 198, 167));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Próximo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 139, -1));

        jPanel1.setBackground(new java.awt.Color(156, 166, 131));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloTriagem.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        tituloTriagem.setForeground(new java.awt.Color(255, 255, 255));
        tituloTriagem.setText("CONSULTA (INTERNO)");
        tituloTriagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetinho/Assets/Logo.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(tituloTriagem)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 660, 150));

        campoPrescricao.setColumns(20);
        campoPrescricao.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        campoPrescricao.setRows(5);
        jScrollPane8.setViewportView(campoPrescricao);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 530, 70));

        campoSintoma.setColumns(20);
        campoSintoma.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        campoSintoma.setRows(5);
        jScrollPane9.setViewportView(campoSintoma);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 530, 70));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(156, 166, 131));
        jLabel8.setText("Sintomas:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        campoContato.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jScrollPane10.setViewportView(campoContato);

        getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 130, 32));

        campoSenha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jScrollPane11.setViewportView(campoSenha);

        getContentPane().add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 80, 32));

        jButton2.setBackground(new java.awt.Color(188, 198, 167));
        jButton2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Próximo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 139, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        proximoPaciente();
        acoes.removerConsultorio();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    public void proximoPaciente() {
        try {
            paciente = acoes.chamadorConsultorio();
            campoSenha.setText(paciente.getSenha());

            telaFila.setSenha(paciente.getSenha());

            campoNome.setText(paciente.getNome());
            campoIdade.setText(Integer.toString(paciente.getIdade()));
            campoContato.setText(paciente.getContato());
            campoSintoma.setText(paciente.getSintomas());
            campoPrioridade.setText(paciente.getPrioridade().name());
            campoPrescricao.setText("");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane campoContato;
    private javax.swing.JTextPane campoIdade;
    private javax.swing.JTextPane campoNome;
    private javax.swing.JTextArea campoPrescricao;
    private javax.swing.JTextPane campoPrioridade;
    private javax.swing.JTextPane campoSenha;
    private javax.swing.JTextArea campoSintoma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel tituloTriagem;
    // End of variables declaration//GEN-END:variables
}
