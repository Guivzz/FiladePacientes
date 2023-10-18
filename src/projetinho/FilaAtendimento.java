package projetinho;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {

    public static void main(String[] args) {

        

        
        InterfaceActions botao = new InterfaceActions();

        
        botao.adiconarPacientePreferencialTriagem();
        botao.adiconarPacientePreferencialTriagem();
        botao.adiconarPacientePreferencialTriagem();
        botao.adiconarPacientePreferencialTriagem();
        botao.adiconarPacientePreferencialTriagem();
        botao.adicionarPacienteTriagem();
        botao.adiconarPacientePreferencialTriagem();
        

        botao.chamarFilaTriagem();
        botao.chamarFilaTriagem();
        botao.chamarFilaTriagem();
        botao.chamarFilaTriagem();
        botao.chamarFilaTriagem();
        botao.chamarFilaTriagem();   
    }
}
