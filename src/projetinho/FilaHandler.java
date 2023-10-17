/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetinho;

/**
 *
 * @author guigu
 */
class FilaHandler {

    public Nodo getInicio() {
        return inicio;
    }

    private Nodo inicio;
    private Nodo fim;
    private int tamanho;

    public FilaHandler() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserirPaciente(Paciente paciente) {
        Nodo novoNodo = new Nodo(paciente);

        if (this.inicio == null) {
            this.inicio = novoNodo;
            this.fim = novoNodo;
        } else {
            this.fim.proximo = novoNodo;
            novoNodo.anterior = this.fim;
            this.fim = novoNodo;
        }

        this.tamanho++;
    }

    public int tamanho() {
        return tamanho;
    }

    public Paciente chamarPrimeiroPaciente() {
        if (this.estaVazia()) {
            return null;
        }

        Paciente paciente = this.inicio.paciente;
        this.inicio = this.inicio.proximo;

        if (this.inicio == null) {
            this.fim = null;
        } else {
            this.inicio.anterior = null;
        }

        this.tamanho--;
        return paciente;
    }

    public void removerPacienteObj(Paciente paciente) {
        Nodo nodoAtual = this.inicio;
        while (nodoAtual != null) {
            if (nodoAtual.paciente.equals(paciente)) {
                if (nodoAtual == this.fim) {
                    this.fim = nodoAtual.anterior;
                }
                nodoAtual.anterior.proximo = nodoAtual.proximo;
                if (nodoAtual.proximo != null) {
                    nodoAtual.proximo.anterior = nodoAtual.anterior;
                }
                nodoAtual = null;
                return;
            }
            nodoAtual = nodoAtual.proximo;
        }
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public void imprimir() {
        Nodo nodo = this.inicio;

        while (nodo != null) {
            System.out.println(nodo.paciente);
            nodo = nodo.proximo;
        }
    }

    public class Nodo {

        public Paciente getPaciente() {
            return paciente;
        }

        public void setPaciente(Paciente paciente) {
            this.paciente = paciente;
        }

        public Nodo getAnterior() {
            return anterior;
        }

        public void setAnterior(Nodo anterior) {
            this.anterior = anterior;
        }

        public Nodo getProximo() {
            return proximo;
        }

        public void setProximo(Nodo proximo) {
            this.proximo = proximo;
        }

        private Paciente paciente;
        private Nodo anterior;
        private Nodo proximo;

        public Nodo(Paciente paciente) {
            this.paciente = paciente;
            this.anterior = null;
            this.proximo = null;
        }
    }

}
