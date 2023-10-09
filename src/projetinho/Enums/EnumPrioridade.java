/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetinho.Enums;

/**
 *
 * @author guigu
 */
public enum EnumPrioridade {
    NAO_PRIORITARIO(-1),
    PADRAO(0),
    PRIORITARIO(1),
    URGENTE(2);

    int valor;

    private EnumPrioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static EnumPrioridade Valor(int valor) {
        for (EnumPrioridade prioridade : values()) {
            if (prioridade.getValor() == valor) {
                return prioridade;
            }
        }
        throw new IllegalArgumentException("Valor de prioridade inválido: " + valor);
    }

}
