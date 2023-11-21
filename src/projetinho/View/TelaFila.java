/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetinho.View;

import java.util.Random;
import projetinho.Controller.InterfaceActions;

public class TelaFila extends javax.swing.JFrame {

    Random random = new Random();

    InterfaceActions acoes;
    String senha;
    String local;

    public TelaFila(InterfaceActions acoes, String local) {
        this.acoes = acoes;
        this.local = local;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        senhaTextField = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        localTextField1 = new javax.swing.JLabel();
        chamadaVar = new javax.swing.JLabel();
        localTextField = new javax.swing.JLabel();
        localTextField4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(188, 198, 167));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        senhaTextField.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 60)); // NOI18N
        senhaTextField.setForeground(new java.awt.Color(255, 255, 255));
        senhaTextField.setText("SEM SENHA");
        jPanel1.add(senhaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 512, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetinho/Assets/Logo.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 119, 150));

        localTextField1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 60)); // NOI18N
        localTextField1.setForeground(new java.awt.Color(255, 255, 255));
        localTextField1.setText("SENHA:");
        jPanel1.add(localTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, -1));

        chamadaVar.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 65)); // NOI18N
        chamadaVar.setForeground(new java.awt.Color(255, 255, 255));
        chamadaVar.setText("CHAMADA");
        jPanel1.add(chamadaVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 480, -1));

        localTextField.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 60)); // NOI18N
        localTextField.setForeground(new java.awt.Color(255, 255, 255));
        localTextField.setText("NENHUMA SALA");
        jPanel1.add(localTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 512, -1));

        localTextField4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 60)); // NOI18N
        localTextField4.setForeground(new java.awt.Color(255, 255, 255));
        localTextField4.setText("SALA:");
        jPanel1.add(localTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 154, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 660, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setSenha(String senha) {
        senhaTextField.setText(senha);
        localTextField.setText(this.local.toUpperCase() + " " + (random.nextInt(5) + 1));

    }

    public void setLocal() {
        chamadaVar.setText(this.local.toUpperCase());
    }


    public void tocarSom(){
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chamadaVar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel localTextField;
    private javax.swing.JLabel localTextField1;
    private javax.swing.JLabel localTextField4;
    private javax.swing.JLabel senhaTextField;
    // End of variables declaration//GEN-END:variables

}
