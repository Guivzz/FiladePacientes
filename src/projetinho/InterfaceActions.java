package projetinho;


public class InterfaceActions {

    FilaConsulta filaTriagem = new FilaConsulta();
    int contador = 1;
    int contadorPrioridade = 1;

    public void adicionarPacienteTriagem(){
        Paciente paciente = new Paciente(false);
        String chamada = "A" + String.format("%04d",contador++);
        paciente.setNumeroChamada(chamada);
        System.out.println(paciente.getNumeroChamada());
        filaTriagem.inserirPaciente(paciente);
        filaTriagem.moverPacientePrioritarioTriagem();

    }
    public void adiconarPacientePreferencialTriagem(){
        Paciente paciente1 = new Paciente(true);
        String chamada = "B" + String.format("%04d",contadorPrioridade++);
        paciente1.setNumeroChamada(chamada);
        System.out.println(paciente1.getNumeroChamada());
        filaTriagem.inserirPaciente(paciente1);
        filaTriagem.moverPacientePrioritarioTriagem();
    }

    public void chamarFilaTriagem(){

        int contador = 0;

        if(filaTriagem.getFilaPadrao().estaVazia() && filaTriagem.getFilaPrioritaria().estaVazia()){
            System.out.println("Fila está vazia");
            return;
        }

        if(contador == 2 || filaTriagem.getFilaPrioritaria().estaVazia()){

            filaTriagem.getFilaPadrao().getInicio();

        }




        filaTriagem.impreimirFila();


    }



}
