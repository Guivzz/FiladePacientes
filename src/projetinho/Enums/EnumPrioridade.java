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

    // Verde: Nível de emergência baixo
    VERDE(0),
    // Amarelo: Nível de emergência médio
    AMARELO(1),
    // Vermelho: Nível de emergência alto
    VERMELHO(2);

    final int valor;

    EnumPrioridade(int valor) {
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
