package projetinho;

import java.io.Console;

public class InterfaceActions {

    FilaConsulta filaTriagem = new FilaConsulta();
    int contador = 1;
    int contadorPrioridade = 1;
    int limite = 0;

    public void adicionarPacienteTriagem() {

        String chamada = "A" + String.format("%04d", contador++);
        Paciente paciente = new Paciente(false, chamada);
        paciente.setSenha(chamada);
        System.out.println(paciente.getSenha());
        filaTriagem.inserirPaciente(paciente);
        filaTriagem.moverPacientePrioritarioTriagem();

    }

    public void adiconarPacientePreferencialTriagem() {

        String chamada = "B" + String.format("%04d", contadorPrioridade++);
        Paciente paciente1 = new Paciente(true, chamada);
        paciente1.setSenha(chamada);
        System.out.println(paciente1.getSenha());
        filaTriagem.inserirPaciente(paciente1);
        filaTriagem.moverPacientePrioritarioTriagem();
    }

    public String chamarFilaTriagem() {
        Paciente topo = null;

        if (filaTriagem.getFilaPadrao().estaVazia() && filaTriagem.getFilaPrioritaria().estaVazia()) {
            System.out.println("Fila está vazia");

        }
        if (limite != 2 && !filaTriagem.getFilaPrioritaria().estaVazia()||filaTriagem.getFilaPadrao().estaVazia()) {
            topo = filaTriagem.getFilaPrioritaria().peek();
            filaTriagem.getFilaPrioritaria().removerPacienteObj(topo);
            limite++;
            System.out.println("Numero impresso:" + topo.getSenha());
            return topo.senha ;
        }
        if (limite==2 || filaTriagem.getFilaPrioritaria().estaVazia()) {
            topo = filaTriagem.getFilaPadrao().peek();
            filaTriagem.getFilaPadrao().removerPacienteObj(topo);
            limite = 0;
            System.out.println("Numero impresso:" + topo.getSenha());
            return topo.senha;
        }
        return "Deu problema";
    }

}
