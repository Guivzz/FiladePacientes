package projetinho;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {

    public static void main(String[] args) {

        
        Paciente paciente1 = new Paciente("Pedro", 40, "93344434467", 99003, "Dores na coluna", 0);
        Paciente paciente2 = new Paciente("Maneiro", 22, "93344434467", 99003, "Dores na coluna", 1);
        
        FilaConsulta fila = new FilaConsulta();

        fila.inserirPaciente(paciente1);
        fila.inserirPaciente(paciente2);
        fila.inserirPaciente(new Paciente("Joao", 40, "93344434467", 99003, "Dores na coluna", 1));
        fila.inserirPaciente(new Paciente("Maicon", 40, "93344434467", 99003, "Dores na coluna", 0));
        fila.inserirPaciente(new Paciente("Jose", 40, "93344434467", 99003, "Dores na coluna", 0));
        fila.moverPacientePrioritario();
        fila.impreimirFila();
        
        
        
    }
}
