/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetinho.Controller;

import projetinho.Model.Paciente;
import projetinho.Model.FilaHandler;
import projetinho.Model.EnumPrioridade;
import projetinho.Model.FilaHandler.Nodo;

/**
 *
 * @author guigu
 */
public class FilaConsulta {

    private final FilaHandler filaPadrao;
    private final FilaHandler filaPrioritaria;

    public FilaConsulta() {
        this.filaPadrao = new FilaHandler();
        this.filaPrioritaria = new FilaHandler();
    }

    public void inserirPaciente(Paciente paciente) {

        this.filaPadrao.inserirPaciente(paciente);
    }

    public void moverPacientePrioritario() {
        Nodo nodoAtual = this.filaPadrao.getInicio();
        while (nodoAtual != null) {
            Paciente paciente = nodoAtual.getPaciente();
            if (paciente.getPrioridade() == EnumPrioridade.AMARELO) {
                this.filaPrioritaria.inserirPaciente(paciente);
                this.filaPadrao.removerPacienteObj(paciente);
            }
            nodoAtual = nodoAtual.getProximo();
        }
    }

    public void moverPacientePrioritarioTriagem() {

        Nodo nodoAtual = this.filaPadrao.getInicio();
        while (nodoAtual != null) {
            Paciente paciente = nodoAtual.getPaciente();
            if (paciente.isIdoso()) {
                this.filaPrioritaria.inserirPaciente(paciente);
                this.filaPadrao.removerPacienteObj(paciente);
            }
            nodoAtual = nodoAtual.getProximo();
        }
    }

    public void imprimirFila() {
        System.out.println("Fila Padrão: \n");
        filaPadrao.imprimir();
        System.out.println("Fila Prioritaria: \n");
        filaPrioritaria.imprimir();
    }

    public FilaHandler getFilaPadrao() {
        return filaPadrao;
    }

    public FilaHandler getFilaPrioritaria() {
        return filaPrioritaria;
    }

}
