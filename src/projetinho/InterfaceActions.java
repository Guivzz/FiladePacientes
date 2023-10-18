package projetinho;

import projetinho.Enums.EnumPrioridade;

public class InterfaceActions {

    FilaConsulta filaTriagem = new FilaConsulta();
    FilaConsulta filaGuiche = new FilaConsulta();
    FilaConsulta filaConsultorio = new FilaConsulta();
    Paciente pacienteEmTriagem = null;
    int contador = 1;
    int contadorPrioridade = 1;
    int limite = 0;
    int limiteGuiche = 0;

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

    public Paciente chamadorTriagem() {  //verifica se a filaTriagem(padrao||prioritaria) esta vazia, se nao estiver ele chama em um padrão 2x1 sendo 2 pacientes prioritarios a cada padrão.
        Paciente topo = null;              //caso não haja pacientes em alguma das respectivas filas, ele devera ignorar e imprimir qualquer paciente que haja.

        if (filaTriagem.getFilaPadrao().estaVazia() && filaTriagem.getFilaPrioritaria().estaVazia()) {
            System.out.println("Fila está vazia");
            return null;
        }
        if (limite != 2 && !filaTriagem.getFilaPrioritaria().estaVazia() || filaTriagem.getFilaPadrao().estaVazia()) {
            topo = filaTriagem.getFilaPrioritaria().peek();
            limite++;
            System.out.println("Numero impresso:" + topo.getSenha());
            return pacienteEmTriagem = topo;
        }
        if (limite == 2 || filaTriagem.getFilaPrioritaria().estaVazia()) {
            topo = filaTriagem.getFilaPadrao().peek();
            limite = 0;
            System.out.println("Numero impresso:" + topo.getSenha());
            return pacienteEmTriagem = topo;
        }
        return null;
    }

    public Paciente chamadorGuiche() { //Esta sendo implementado, falta editar o metodo e criar um metodo conjunto editGuiche, que enviara para a filaConsultorio.
        Paciente topo = null;

        if (filaGuiche.getFilaPadrao().estaVazia() && filaGuiche.getFilaPrioritaria().estaVazia()) {
            System.out.println("Fila está vazia");
            return topo;
        }
        if (limiteGuiche != 2 && !filaGuiche.getFilaPrioritaria().estaVazia() || filaGuiche.getFilaPadrao().estaVazia()) {
            topo = filaGuiche.getFilaPrioritaria().peek();
            filaGuiche.getFilaPrioritaria().removerPacienteObj(topo);
            limiteGuiche++;
            System.out.println("Numero impresso Guiche:" + topo.getSenha());
            return topo;
        }
        if (limiteGuiche == 2 || filaGuiche.getFilaPrioritaria().estaVazia()) {
            topo = filaGuiche.getFilaPadrao().peek();
            filaGuiche.getFilaPadrao().removerPacienteObj(topo);
            limiteGuiche = 0;
            System.out.println("Numero impresso:" + topo.getSenha());
            return topo;
        }
        return null;
    }

    public void editorTriagem(String nome, int idade, String sintomas, int prioridade) { //pega a variavel "pacienteEmTriagem", que esta sendo alocada pelo metodo chamadorTriagem e 
        
        pacienteEmTriagem.setNome(nome);
        pacienteEmTriagem.setIdade(idade);
        pacienteEmTriagem.setSintomas(sintomas);
        pacienteEmTriagem.setPrioridade(EnumPrioridade.Valor(prioridade));
        if (pacienteEmTriagem != null) {
            if (pacienteEmTriagem.prioridade == EnumPrioridade.VERDE) {
                filaTriagem.getFilaPadrao().removerPacienteObj(pacienteEmTriagem);
                filaTriagem.getFilaPrioritaria().removerPacienteObj(pacienteEmTriagem);
                filaGuiche.getFilaPadrao().inserirPaciente(pacienteEmTriagem);
                System.out.println("Paciente Padrão adicionado ao Guiche");
                return;
            }
            if (pacienteEmTriagem.prioridade == EnumPrioridade.AMARELO) {
                filaTriagem.getFilaPrioritaria().removerPacienteObj(pacienteEmTriagem);
                filaTriagem.getFilaPadrao().removerPacienteObj(pacienteEmTriagem);
                filaGuiche.getFilaPrioritaria().inserirPaciente(pacienteEmTriagem);
                System.out.println("Paciente Prioritario adicionado ao guiche");
                return;
            }
            if (pacienteEmTriagem.prioridade == EnumPrioridade.VERMELHO) {
                filaTriagem.getFilaPadrao().removerPacienteObj(pacienteEmTriagem);
                filaTriagem.getFilaPrioritaria().removerPacienteObj(pacienteEmTriagem);
                System.out.println("Paciente enviado para emergencia");
            }
        }
    }

}
