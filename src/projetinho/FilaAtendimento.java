package projetinho;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {

    public static void main(String[] args) {

        FilaHandler filaHandler = new FilaHandler();

        Queue<Paciente> filaPrincipal = new LinkedList<>();
        Queue<Paciente> filaPrioritaria = new LinkedList<>();

        filaPrincipal.add(new Paciente("Joao", 20, "98423332267", 5093, "Dores", 1));
        filaPrincipal.add(new Paciente("Clever", 22, "93344434467", 99003, "Dores na coluna", 0));
        filaPrincipal.add(new Paciente("Maria", 30, "98423332267", 5093, "Dores", 1));
        filaPrincipal.add(new Paciente("Pedro", 40, "93344434467", 99003, "Dores na coluna", 0));
        filaPrincipal.add(new Paciente("Pedrox", 40, "93344434467", 99003, "dores na prostrata", 2));
        filaPrincipal.add(new Paciente("Jorge", 40, "93344434467", 99003, "Dores na coluna", 0));
        filaPrincipal.add(new Paciente("Maria", 30, "98423332267", 5093, "Dores", 1));
        filaPrincipal.add(new Paciente("Maria", 30, "98423332267", 5093, "Dores", 1));
        filaPrincipal.add(new Paciente("Pedro", 40, "93344434467", 99003, "Dores na coluna", 0));

        filaHandler.filtroFila(filaPrincipal, filaPrioritaria);

        for (int i = 0; i <= 8; i++) {
            System.out.println(filaHandler.removerPaciente(filaPrincipal, filaPrioritaria));
        }
    }
}
