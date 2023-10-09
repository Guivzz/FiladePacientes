/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetinho;

import java.util.LinkedList;
import java.util.Queue;
import projetinho.Enums.EnumPrioridade;

/**
 *
 * @author guigu
 */
public class FilaAtendimento {
    // MAIN EXECUTION
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Paciente> fila = new LinkedList<>();
        
        
        fila.add(new Paciente("Joao", 20, "98423332267", 5093, "Dores", 1));
        fila.add(new Paciente("Clever", 22, "93344434467", 99003, "Dores na coluna", 0));
        
        
        fila.poll(); // remove o primeiro elemento, caso esteja vazia retorna null
        
        System.out.println(fila);
    }
    
    //FIM MAIN EXECUTION
}
