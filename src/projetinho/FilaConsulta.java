/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetinho;

import projetinho.Enums.EnumPrioridade;
import projetinho.FilaHandler.Nodo;

/**
 *
 * @author guigu
 */
class FilaConsulta {

    private FilaHandler filaPadrao;
    private FilaHandler filaPrioritaria;

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


    public void impreimirFila() {
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
