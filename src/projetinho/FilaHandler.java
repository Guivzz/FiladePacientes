package projetinho;

import projetinho.Enums.EnumPrioridade;
import projetinho.Paciente;

import java.util.Iterator;
import java.util.Queue;

public class FilaHandler {

    private int contadorPacientes = 0;

    public void filtroFila(Queue<Paciente> filaPrincipal, Queue<Paciente> filaPrioritaria) {
        Iterator<Paciente> iterator = filaPrincipal.iterator();
        while (iterator.hasNext()) {
            Paciente paciente = iterator.next();
            if (paciente.prioridade == EnumPrioridade.Valor(1)) {
                filaPrioritaria.add(paciente);
                iterator.remove();
            }
        }
    }

    public Paciente removerPaciente(Queue<Paciente> filaPrincipal, Queue<Paciente> filaPrioritaria) {

        Paciente pacientePadrao = filaPrincipal.peek();
        Paciente pacientePrioritario = filaPrioritaria.peek();

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

        if (contadorPacientes == 2 || filaPrioritaria.isEmpty()) {
            filaPrincipal.poll();
            contadorPacientes = 0;
            return pacientePadrao;

        }
        filaPrioritaria.poll();
        contadorPacientes++;
        return pacientePrioritario;
    }

}

