package projetinho;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {

    public static void main(String[] args) {

        

        
        InterfaceActions botao = new InterfaceActions();


        botao.adicionarPacienteTriagem();
        botao.adicionarPacienteTriagem();
        botao.adiconarPacientePreferencialTriagem();
        botao.adicionarPacienteTriagem();
        botao.adiconarPacientePreferencialTriagem();
        botao.adiconarPacientePreferencialTriagem();
        botao.adiconarPacientePreferencialTriagem();

        botao.chamarFilaTriagem();
    }
}
