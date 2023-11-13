package projetinho;

import projetinho.Enums.EnumPrioridade;

public class InterfaceActions {

    FilaConsulta filaTriagem;
    FilaConsulta filaGuiche;
    FilaConsulta filaConsultorio;
    Paciente pacienteEmTriagem, pacienteNoGuiche, pacienteNoConsultorio = null;
    int contador = 1;
    int contadorPrioridade = 1;
    int limite, limiteGuiche, limiteConsultorio = 0;

    //Adiciona os pacientes à filaTriagem

    public InterfaceActions(FilaConsulta filaTriagem, FilaConsulta filaGuiche, FilaConsulta filaConsultorio){

        this.filaTriagem = filaTriagem;
        this.filaGuiche = filaGuiche;
        this.filaConsultorio = filaConsultorio;

    }
        
    public String adicionarPacienteTriagem() {

        String chamada = "A" + String.format("%04d", contador++);
        Paciente paciente = new Paciente(false, chamada);
        paciente.setSenha(chamada);
        System.out.println(paciente.getSenha());
        filaTriagem.inserirPaciente(paciente);
        filaTriagem.moverPacientePrioritarioTriagem();

        return paciente.getSenha();
    }

    public void adiconarPacientePreferencialTriagem() {

        String chamada = "B" + String.format("%04d", contadorPrioridade++);
        Paciente paciente1 = new Paciente(true, chamada);
        paciente1.setSenha(chamada);
        System.out.println(paciente1.getSenha());
        filaTriagem.inserirPaciente(paciente1);
        filaTriagem.moverPacientePrioritarioTriagem();
    }

    ////////////////////////////////////////////////////////////////////////////
    //Metodos que chamam o proximo paciente das filas
    public Paciente chamadorTriagem() {  //verifica se a filaTriagem(padrao||prioritaria) esta vazia, se nao estiver ele chama em um padrão 2x1 sendo 2 pacientes prioritarios a cada padrão.
        pacienteEmTriagem = null;              //caso não haja pacientes em alguma das respectivas filas, ele devera ignorar e imprimir qualquer paciente que haja.

        if (filaTriagem.getFilaPadrao().estaVazia() && filaTriagem.getFilaPrioritaria().estaVazia()) {
            System.out.println("Fila está vazia");
            return pacienteEmTriagem;
        }
        if (limite != 2 && !filaTriagem.getFilaPrioritaria().estaVazia() || filaTriagem.getFilaPadrao().estaVazia()) {
            pacienteEmTriagem = filaTriagem.getFilaPrioritaria().peek();
            limite++;
            System.out.println("Numero impresso:" + pacienteEmTriagem.getSenha());
            return pacienteEmTriagem;
        }
        if (limite == 2 || filaTriagem.getFilaPrioritaria().estaVazia()) {
            pacienteEmTriagem = filaTriagem.getFilaPadrao().peek();
            limite = 0;
            System.out.println("Numero impresso:" + pacienteEmTriagem.getSenha());
            return pacienteEmTriagem;
        }
        return pacienteEmTriagem;
    }

    public Paciente chamadorGuiche() { //Esta sendo implementado, falta editar o metodo e criar um metodo conjunto editGuiche, que enviara para a filaConsultorio.
        pacienteNoGuiche = null;

        if (filaGuiche.getFilaPadrao().estaVazia() && filaGuiche.getFilaPrioritaria().estaVazia()) {
            System.out.println("Fila está vazia");
            return pacienteNoGuiche;
        }
        if (limiteGuiche != 2 && !filaGuiche.getFilaPrioritaria().estaVazia() || filaGuiche.getFilaPadrao().estaVazia()) {
            pacienteNoGuiche = filaGuiche.getFilaPrioritaria().peek();
            System.out.println("Numero impresso no Guiche:" + pacienteNoGuiche.getSenha());
            limiteGuiche++;
            return pacienteNoGuiche;
        }
        if (limiteGuiche == 2 || filaGuiche.getFilaPrioritaria().estaVazia()) {
            pacienteNoGuiche = filaGuiche.getFilaPadrao().peek();
            System.out.println("Numero impresso:" + pacienteNoGuiche.getSenha());
            limiteGuiche = 0;
            return pacienteNoGuiche;
        }
        return pacienteNoGuiche;
    }

    public Paciente chamadorConsultorio() {

        if (filaConsultorio.getFilaPadrao().estaVazia() && filaConsultorio.getFilaPrioritaria().estaVazia()){
            System.out.println("Não há pacientes para proceguir ao consultorio.");
            return null;
        }
        if (limiteConsultorio != 2 && !filaConsultorio.getFilaPrioritaria().estaVazia()|| filaConsultorio.getFilaPadrao().estaVazia()) {
            pacienteNoConsultorio = filaConsultorio.getFilaPrioritaria().peek();
            filaConsultorio.getFilaPrioritaria().removerPacienteObj(pacienteNoGuiche);
            System.out.println("Proximo paciente a se dirigir ao consultório" + pacienteNoConsultorio);
            limiteConsultorio++;
            return pacienteNoConsultorio;
        }
        
        if (limiteConsultorio == 2 || filaConsultorio.getFilaPrioritaria().estaVazia()) {
            pacienteNoConsultorio = filaConsultorio.getFilaPadrao().peek();
            filaConsultorio.getFilaPadrao().removerPacienteObj(pacienteNoGuiche);
            System.out.println("Proximo paciente a se dirigir ao consultório" + pacienteNoConsultorio);
            limiteConsultorio = 0;
            return pacienteNoConsultorio;
        }
        return null;
    }

    //Editores de Dados:
    public void editorTriagem(String nome, int idade, String sintomas, int prioridade) { //pega a variavel "pacienteEmTriagem", que esta sendo alocada pelo metodo chamadorTriagem e 

        pacienteEmTriagem.setNome(nome);
        pacienteEmTriagem.setIdade(idade);
        pacienteEmTriagem.setSintomas(sintomas);
        pacienteEmTriagem.setPrioridade(EnumPrioridade.Valor(prioridade));
        if (pacienteEmTriagem != null) {
            if (null == pacienteEmTriagem.prioridade) {
                System.out.println("deu erro !");
            }
            else switch (pacienteEmTriagem.prioridade) {
                case AZUL:
                    filaTriagem.getFilaPadrao().removerPacienteObj(pacienteEmTriagem);
                    filaTriagem.getFilaPrioritaria().removerPacienteObj(pacienteEmTriagem);
                    filaGuiche.getFilaPadrao().inserirPaciente(pacienteEmTriagem);
                    System.out.println("Paciente Não-priotário adicionado ao Guiche");
                    break;
                case VERDE:
                    filaTriagem.getFilaPadrao().removerPacienteObj(pacienteEmTriagem);
                    filaTriagem.getFilaPrioritaria().removerPacienteObj(pacienteEmTriagem);
                    filaGuiche.getFilaPadrao().inserirPaciente(pacienteEmTriagem);
                    System.out.println("Paciente Padrão adicionado ao Guiche");
                    break;
                case AMARELO:
                    filaTriagem.getFilaPrioritaria().removerPacienteObj(pacienteEmTriagem);
                    filaTriagem.getFilaPadrao().removerPacienteObj(pacienteEmTriagem);
                    filaGuiche.getFilaPrioritaria().inserirPaciente(pacienteEmTriagem);
                    System.out.println("Paciente Prioritario adicionado ao guiche");
                    break;
                case VERMELHO:
                    filaTriagem.getFilaPrioritaria().removerPacienteObj(pacienteEmTriagem);
                    filaTriagem.getFilaPadrao().removerPacienteObj(pacienteEmTriagem);
                    System.out.println("Paciente enviado para emergencia");
                    break;
                default:
                    System.out.println("deu erro !");
                    break;
            }
        }
    }

    public void editorGuiche(String contato, int cadastro) {
        pacienteNoGuiche.setContato(contato);
        pacienteNoGuiche.setCadastro(cadastro);
        if (pacienteNoGuiche != null) {
            if (pacienteNoGuiche.prioridade == EnumPrioridade.VERDE || pacienteNoGuiche.prioridade == EnumPrioridade.AZUL) {
                filaConsultorio.getFilaPadrao().inserirPaciente(pacienteNoGuiche);
                filaGuiche.getFilaPadrao().removerPacienteObj(pacienteNoGuiche);

                System.out.println("Paciente editado e encaminhado ao consultorio");
                return;
            }
            if (pacienteNoGuiche.prioridade == EnumPrioridade.AMARELO) {
                filaConsultorio.getFilaPrioritaria().inserirPaciente(pacienteNoGuiche);
                filaGuiche.getFilaPrioritaria().removerPacienteObj(pacienteNoGuiche);
                System.out.println("Paciente editado e encaminhado ao consultorio");
            }
        }
    }

    public void removerGuiche() {
        filaGuiche.getFilaPadrao().removerPacienteObj(pacienteNoGuiche);
        filaGuiche.getFilaPrioritaria().removerPacienteObj(pacienteNoGuiche);
        System.out.println("Paciente removido!");
    }
    
    public void removerConsultorio(){
        filaConsultorio.getFilaPadrao().removerPacienteObj(pacienteNoConsultorio);
        filaConsultorio.getFilaPrioritaria().removerPacienteObj(pacienteNoConsultorio);
    }
    public Paciente chamadorConsultorioDados() { 
        return pacienteNoConsultorio;
    }
}