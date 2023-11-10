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

        filaAdulto = new javax.swing.JButton();
        filaPreferencial = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        filaAdulto.setText("Fila Adulto");
        filaAdulto.setActionCommand("filaAdulto");
        filaAdulto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filaAdultoMouseClicked(evt);
            }
        });

        filaPreferencial.setText("Fila Preferencial");
        filaPreferencial.setActionCommand("filaPreferencial");
        filaPreferencial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filaPreferencialMouseClicked(evt);
            }
        });

        jButton1.setText("Ver fila");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(filaPreferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filaAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(filaPreferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(filaAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        filaAdulto.getAccessibleContext().setAccessibleName("filaAdulto");
        filaPreferencial.getAccessibleContext().setAccessibleName("filaPreferencial");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void filaPreferencialMouseClicked(java.awt.event.MouseEvent evt) {                                              

        acoes.adicionarPacienteTriagem();

    }

    private void filaAdultoMouseClicked(java.awt.event.MouseEvent evt) {


    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {


        
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton filaAdulto;
    private javax.swing.JButton filaPreferencial;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
