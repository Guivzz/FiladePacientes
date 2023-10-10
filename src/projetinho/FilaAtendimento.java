/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetinho;

import java.util.Iterator;
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
        Queue<Paciente> filaPrincipal = new LinkedList<>();
        Queue<Paciente> filaPrioritaria = new LinkedList<>();

        filaPrincipal.add(new Paciente("Joao", 20, "98423332267", 5093, "Dores", 1));
        filaPrincipal.add(new Paciente("Clever", 22, "93344434467", 99003, "Dores na coluna", 0));
        filaPrincipal.add(new Paciente("Maria", 30, "98423332267", 5093, "Dores", 1));
        filaPrincipal.add(new Paciente("Pedro", 40, "93344434467", 99003, "Dores na coluna", 0));
        filaPrincipal.add(new Paciente("Pedrox", 40, "93344434467", 99003, "dores na prostrata", 2));

        // remove o primeiro elemento, caso esteja vazia retorna null
        Iterator<Paciente> iterator = filaPrincipal.iterator();
        while (iterator.hasNext()) {
            Paciente paciente = iterator.next();
            if (paciente.prioridade == EnumPrioridade.Valor(1)) {
                filaPrioritaria.add(paciente);
                iterator.remove();
            }
        }

        System.out.println(sla.removerPaciente(filaPrincipal, filaPrioritaria));
        System.out.println(sla.removerPaciente(filaPrincipal, filaPrioritaria));
        System.out.println(sla.removerPaciente(filaPrincipal, filaPrioritaria));
        System.out.println(sla.removerPaciente(filaPrincipal, filaPrioritaria));
    }

    //FIM MAIN EXECUTION
    public class sla {

        public static int pacientesPrioritarios = 0;

        public static Paciente removerPaciente(Queue<Paciente> filaPrincipal, Queue<Paciente> filaPrioritaria) {
            // Verifica se a lista principal está vazia
            if (filaPrincipal.isEmpty()) {
                return null;
            }

            // Verifica se o primeiro paciente da lista principal tem prioridade 2
            Iterator<Paciente> iterator = filaPrincipal.iterator();
        while (iterator.hasNext()) {
            Paciente paciente = iterator.next();
            if (paciente.prioridade == EnumPrioridade.Valor(2)) {
                iterator.remove();
                return paciente;
            }
        }

            Paciente paciente = filaPrincipal.peek();
            Paciente paciente1 = filaPrioritaria.peek();

            if (pacientesPrioritarios == 2) {
                filaPrincipal.poll();
                return paciente;
            }
            filaPrioritaria.poll();
            pacientesPrioritarios++;
            return paciente1;
        }
    }
}
