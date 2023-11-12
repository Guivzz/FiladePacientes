/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetinho;

import projetinho.FilaConsulta;
import projetinho.InterfaceActions;

public class TelaInicial extends javax.swing.JFrame {

    InterfaceActions acoes;

    public TelaInicial(InterfaceActions acoes) {
        this.acoes = acoes;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        filaPreferencial = new javax.swing.JButton();
        filaAdulto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(188, 198, 167));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetinho/img/Logo.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 119, 150));

        jPanel1.setBackground(new java.awt.Color(188, 198, 167));
        jPanel1.setMaximumSize(new java.awt.Dimension(640, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        filaPreferencial.setBackground(new java.awt.Color(254, 255, 255));
        filaPreferencial.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        filaPreferencial.setForeground(new java.awt.Color(156, 166, 131));
        filaPreferencial.setText("Atendimento Preferencial");
        filaPreferencial.setActionCommand("filaPreferencial");
        filaPreferencial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filaPreferencialMouseClicked(evt);
            }
        });
        jPanel1.add(filaPreferencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 340, 72));
        filaPreferencial.getAccessibleContext().setAccessibleName("filaPreferencial");

        filaAdulto.setBackground(new java.awt.Color(254, 255, 255));
        filaAdulto.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        filaAdulto.setForeground(new java.awt.Color(156, 166, 131));
        filaAdulto.setText("Atendimento Comum");
        filaAdulto.setActionCommand("filaAdulto");
        filaAdulto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filaAdultoMouseClicked(evt);
            }
        });
        jPanel1.add(filaAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 340, 72));
        filaAdulto.getAccessibleContext().setAccessibleName("filaAdulto");

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seja bem-vindo(a)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 43, 377, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecione o tipo de atendimento:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filaPreferencialMouseClicked(java.awt.event.MouseEvent evt) {
        acoes.adiconarPacientePreferencialTriagem();
    }

    private void filaAdultoMouseClicked(java.awt.event.MouseEvent evt) {

        acoes.adicionarPacienteTriagem();
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton filaAdulto;
    private javax.swing.JButton filaPreferencial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
