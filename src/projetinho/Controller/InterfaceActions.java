package projetinho.Controller;

import projetinho.Model.Paciente;
import projetinho.Model.EnumPrioridade;

public class InterfaceActions {

    FilaConsulta filaTriagem;
    FilaConsulta filaGuiche;
    FilaConsulta filaConsultorio;
    Paciente pacienteEmTriagem, pacienteNoGuiche, pacienteNoConsultorio = null;
    int contador = 1;
    int contadorPrioridade = 1;
    int limite, limiteGuiche, limiteConsultorio = 0;

    //Adiciona os pacientes à filaTriagem
    public InterfaceActions(FilaConsulta filaTriagem, FilaConsulta filaGuiche, FilaConsulta filaConsultorio) {

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
    public Paciente chamadorTriagem() {
        try {
            
            if (filaTriagem == null) {
                throw new NullPointerException("A fila de triagem não foi inicializada.");
            }
          
            if (filaTriagem.getFilaPadrao().estaVazia() && filaTriagem.getFilaPrioritaria().estaVazia()) {
                System.out.println("Fila está vazia");
                return pacienteEmTriagem;
            }

            if (limite != 2 && !filaTriagem.getFilaPrioritaria().estaVazia() || filaTriagem.getFilaPadrao().estaVazia()) {
                pacienteEmTriagem = filaTriagem.getFilaPrioritaria().peek();
                if (pacienteEmTriagem == null) {
                    throw new IllegalStateException("Fila prioritária está vazia, mas o paciente não foi recuperado corretamente.");
                }
                limite++;
                System.out.println("Numero impresso:" + pacienteEmTriagem.getSenha());
                return pacienteEmTriagem;
            }

            if (limite == 2 || filaTriagem.getFilaPrioritaria().estaVazia()) {
                pacienteEmTriagem = filaTriagem.getFilaPadrao().peek();
                if (pacienteEmTriagem == null) {
                    throw new IllegalStateException("Fila padrão está vazia, mas o paciente não foi recuperado corretamente.");
                }
                limite = 0;
                System.out.println("Numero impresso:" + pacienteEmTriagem.getSenha());
                return pacienteEmTriagem;
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
        return null;
    }

    public Paciente chamadorGuiche() {
        try {
            
            if (filaGuiche == null) {
                throw new FilaException("A fila do guichê não foi inicializada.");
            }
            
            if (filaGuiche.getFilaPadrao().estaVazia() && filaGuiche.getFilaPrioritaria().estaVazia()) {
                System.out.println("Fila esta vazia");
                return pacienteNoGuiche;
            }

            if (limiteGuiche != 2 && !filaGuiche.getFilaPrioritaria().estaVazia() || filaGuiche.getFilaPadrao().estaVazia()) {
                pacienteNoGuiche = filaGuiche.getFilaPrioritaria().peek();
                if (pacienteNoGuiche == null) {
                    throw new FilaException("Fila prioritária está vazia, mas o paciente não foi recuperado corretamente.");
                }
                return pacienteNoGuiche;
            }

            if (limiteGuiche == 2 || filaGuiche.getFilaPrioritaria().estaVazia()) {
                pacienteNoGuiche = filaGuiche.getFilaPadrao().peek();
                if (pacienteNoGuiche == null) {
                    throw new FilaException("Fila padrao esta vazia, mas o paciente não foi recuperado corretamente.");
                }
                return pacienteNoGuiche;
            }
        } catch (FilaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return null;
    }

    public Paciente chamadorConsultorio() {
        try {
            
            
            if (filaConsultorio == null) {
                throw new FilaException("A fila do consultório não foi inicializada.");
            }
            
            if (filaConsultorio.getFilaPadrao().estaVazia() && filaConsultorio.getFilaPrioritaria().estaVazia()) {
                throw new FilaException("Não há pacientes para proceguir ao consultorio.");
            }
            
            
            if (limiteConsultorio != 2 && !filaConsultorio.getFilaPrioritaria().estaVazia() || filaConsultorio.getFilaPadrao().estaVazia()) {
                pacienteNoConsultorio = filaConsultorio.getFilaPrioritaria().peek();
                if (pacienteNoConsultorio == null) {
                    throw new FilaException("Fila prioritária está vazia, mas o paciente não foi recuperado corretamente.");
                }
                filaConsultorio.getFilaPrioritaria().removerPacienteObj(pacienteNoGuiche);
                System.out.println("Proximo paciente a se dirigir ao consultório" + pacienteNoConsultorio);
                limiteConsultorio++;
                return pacienteNoConsultorio;
            }

            if (limiteConsultorio == 2 || filaConsultorio.getFilaPrioritaria().estaVazia()) {
                pacienteNoConsultorio = filaConsultorio.getFilaPadrao().peek();
                if (pacienteNoConsultorio == null) {
                    throw new FilaException("Fila padrão está vazia, mas o paciente não foi recuperado corretamente.");

                }
                filaConsultorio.getFilaPadrao().removerPacienteObj(pacienteNoGuiche);
                System.out.println("Proximo paciente a se dirigir ao consultório" + pacienteNoConsultorio);
                limiteConsultorio = 0;
                return pacienteNoConsultorio;
            }
        } catch (FilaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return null;

    }

//Editores de Dados:
    public void editorTriagem(String nome, int idade, String sintomas, int prioridade) { 

        pacienteEmTriagem.setNome(nome);
        pacienteEmTriagem.setIdade(idade);
        pacienteEmTriagem.setSintomas(sintomas);
        pacienteEmTriagem.setPrioridade(EnumPrioridade.Valor(prioridade));

        try {
            if (pacienteEmTriagem == null) {
                throw new FilaException("Não há pacientes a serem chamados à triagem.");
            }
            if (null == pacienteEmTriagem.getPrioridade()) {
                throw new FilaException("Ocorreu um erro ao ler a prioridade do paciente.");
            } else {
                switch (pacienteEmTriagem.getPrioridade()) {
                    case AZUL -> {
                        filaTriagem.getFilaPadrao().removerPacienteObj(pacienteEmTriagem);
                        filaTriagem.getFilaPrioritaria().removerPacienteObj(pacienteEmTriagem);
                        filaGuiche.getFilaPadrao().inserirPaciente(pacienteEmTriagem);
                        System.out.println("Paciente Não-priotário adicionado ao Guiche");
                    }
                    case VERDE -> {
                        filaTriagem.getFilaPadrao().removerPacienteObj(pacienteEmTriagem);
                        filaTriagem.getFilaPrioritaria().removerPacienteObj(pacienteEmTriagem);
                        filaGuiche.getFilaPadrao().inserirPaciente(pacienteEmTriagem);
                        System.out.println("Paciente Padrão adicionado ao Guiche");
                    }
                    case AMARELO -> {
                        filaTriagem.getFilaPrioritaria().removerPacienteObj(pacienteEmTriagem);
                        filaTriagem.getFilaPadrao().removerPacienteObj(pacienteEmTriagem);
                        filaGuiche.getFilaPrioritaria().inserirPaciente(pacienteEmTriagem);
                        System.out.println("Paciente Prioritario adicionado ao guiche");
                    }
                    case VERMELHO -> {
                        filaTriagem.getFilaPrioritaria().removerPacienteObj(pacienteEmTriagem);
                        filaTriagem.getFilaPadrao().removerPacienteObj(pacienteEmTriagem);
                        System.out.println("Paciente enviado para emergencia");
                    }
                    default ->
                        throw new FilaException("Ocorreu um erro ao ler a prioridade do paciente.");
                }
            }
        } catch (FilaException e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

    }

    public void editorGuiche(String contato, int cadastro) {
        try {
            pacienteNoGuiche.setContato(contato);
            pacienteNoGuiche.setCadastro(cadastro);
            if (pacienteNoGuiche != null) {
                if (pacienteNoGuiche.getPrioridade() == EnumPrioridade.VERDE || pacienteNoGuiche.getPrioridade() == EnumPrioridade.AZUL) {
                    filaConsultorio.getFilaPadrao().inserirPaciente(pacienteNoGuiche);
                    filaGuiche.getFilaPadrao().removerPacienteObj(pacienteNoGuiche);

                    System.out.println("Paciente editado e encaminhado ao consultorio");
                    return;
                }
                if (pacienteNoGuiche.getPrioridade() == EnumPrioridade.AMARELO) {
                    filaConsultorio.getFilaPrioritaria().inserirPaciente(pacienteNoGuiche);
                    filaGuiche.getFilaPrioritaria().removerPacienteObj(pacienteNoGuiche);
                    System.out.println("Paciente editado e encaminhado ao consultorio");
                }
            } else {
                throw new FilaException("Nao há pacientes para editar informacoes no guiche");
            }
        } catch (FilaException e) {
            System.out.println("Erro inexperado: " + e.getMessage());
        }
    }

    public void removerGuiche() {
        filaGuiche.getFilaPadrao().removerPacienteObj(pacienteNoGuiche);
        filaGuiche.getFilaPrioritaria().removerPacienteObj(pacienteNoGuiche);
        System.out.println("Paciente removido!");
    }

    public void removerConsultorio() {
        filaConsultorio.getFilaPadrao().removerPacienteObj(pacienteNoConsultorio);
        filaConsultorio.getFilaPrioritaria().removerPacienteObj(pacienteNoConsultorio);
    }

    public Paciente chamadorConsultorioDados() {
        return pacienteNoConsultorio;
    }
}
