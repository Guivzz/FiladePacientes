/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetinho;

import projetinho.Enums.EnumPrioridade;

/**
 *
 * @author guigu
 */
public class Paciente {
    String nome;
    int idade;
    String contato;
    int cadastro;
    String sintomas;
    EnumPrioridade prioridade;
    boolean idoso;
    String numeroChamada;

    public Paciente(String nome, int idade, String contato, int cadastro, String sintomas, int prioridade) {
        this.nome = nome;
        this.idade = idade;
        this.contato = contato;
        this.cadastro = cadastro;
        this.sintomas = sintomas;
        this.prioridade = EnumPrioridade.Valor(prioridade);
    }

    public Paciente(boolean idoso) {
        this.nome = null;
        this.idade = 0;
        this.contato = null;
        this.cadastro = 0;
        this.sintomas = null;
        this.prioridade = null;
        this.idoso = idoso;
    }
    
    
    //GETTERS AND SETTERS;

    public String getNumeroChamada() {
        return numeroChamada;
    }

    public void setNumeroChamada(String numeroChamada) {
        this.numeroChamada = numeroChamada;
    }

    public boolean isIdoso() {
        return idoso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public EnumPrioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(EnumPrioridade prioridade) {
        this.prioridade = prioridade;
    }

    //FIM GETTERS AND SETTERS;
    
    @Override
    public String toString() {
        return  
                "\nPaciente: "
                + "\nNome: " + nome + " " 
                + "\nIdade: " + idade + " " 
                + "\nContato: " + contato + " "
                + "\nCadastro: " + cadastro + " "
                + "\nSintomas: " + sintomas + " "
                + "\n" + prioridade + " "
                +  "\n" + idoso;
                
    }
    
}
