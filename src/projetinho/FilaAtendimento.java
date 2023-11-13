package projetinho;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {
    
    public static void main(String[] args) {
        
        FilaConsulta filaTriagem = new FilaConsulta();
        FilaConsulta filaGuiche = new FilaConsulta();
        FilaConsulta filaConsultorio = new FilaConsulta();
        
        InterfaceActions interfaceActions = new InterfaceActions(filaTriagem, filaGuiche, filaConsultorio);
        System.out.println("teste");
        
        TelaFila telaFilaTriagem = new TelaFila(interfaceActions, "Triagem");
        TelaFila telaFilaGuiche = new TelaFila(interfaceActions, "Guiche");
        TelaFila telaFilaConsultorio = new TelaFila(interfaceActions, "Consultorio");
        TelaInicial telaInicial = new TelaInicial(interfaceActions);
        TelaTriagem telaTriagem = new TelaTriagem(interfaceActions, telaFilaTriagem);
        TelaGuiche telaGuiche = new TelaGuiche(interfaceActions, telaFilaGuiche);
        TelaConsultorio telaConsultorio = new TelaConsultorio(interfaceActions, telaFilaConsultorio);
        
        telaInicial.setVisible(true);
        //telaFilaTriagem.setVisible(true);
        //telaFilaGuiche.setVisible(true);
        //telaFilaConsultorio.setVisible(true);
        telaTriagem.setVisible(true);
        telaGuiche.setVisible(true);
        telaConsultorio.setVisible(true);

        /*  InterfaceActions botao = new InterfaceActions(filaTriagem, filaGuiche, filaConsultorio);

        botao.adiconarPacientePreferencialTriagem();
        botao.adiconarPacientePreferencialTriagem();
        botao.adiconarPacientePreferencialTriagem();
        botao.adicionarPacienteTriagem();

        String senha = botao.chamadorTriagem().getSenha();                    // chama o paciente da filaTriagem pela senha, dessa forma consegui retornar a senha em si.
        System.out.println("Senha impressa: " +senha);
        botao.editorTriagem("Joao", 20, "Dor na coluna", 1); // edita as informações do paciente e adiciona a filaGuiche


        botao.filaTriagem.getFilaPadrao().imprimir();                           // imprime a filaTriagem para verificar se o paciente foi removido corretamente
        System.out.println("SLAAAAAAAA");
        botao.filaTriagem.getFilaPrioritaria().imprimir();

        botao.filaGuiche.getFilaPadrao().imprimir();                            // imprime a filaGuiche para verificar se foi adicionado corretamente com as informações corretas;
        System.out.println("SLAAAAAAAA");
        botao.filaGuiche.getFilaPrioritaria().imprimir();

        senha = botao.chamadorGuiche().getSenha();


                                                                                // Precisamos agora editar as informações contato, cadastro e caso ele seja aprovado pelo guiche devera ir para uma fila separada, onde sera atendido pelo medico.
        botao.editorGuiche("2392329992", 23232333);

        botao.filaGuiche.getFilaPadrao().imprimir();
        botao.filaGuiche.getFilaPrioritaria().imprimir();

        System.out.println("Consultorio");

        botao.filaConsultorio.getFilaPadrao().imprimir();
        botao.filaConsultorio.getFilaPrioritaria().imprimir();

        botao.chamadorConsultorio();

        System.out.println(botao.chamadorConsultorioDados().getNome() + " " + botao.chamadorConsultorioDados().getSenha());
        botao.filaConsultorio.getFilaPadrao().imprimir();
        botao.filaConsultorio.getFilaPrioritaria().imprimir();
    }*/
    }
}
