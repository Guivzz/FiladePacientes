package projetinho;

public class UIController {

    InterfaceActions interfaceActionsModel;
    TelaInicial telaInicial;
    TelaFilaPadrao telaFilaPadrao;
    TelaGuiche telaGuiche;
    TelaMedico telaMedico;

    public UIController(InterfaceActions interfaceActionsModel, TelaInicial telaInicial, TelaFilaPadrao telaFilaPadrao, TelaGuiche telaGuiche, TelaMedico telaMedico) {

        this.interfaceActionsModel = interfaceActionsModel;
        this.telaInicial = telaInicial;
        this.telaFilaPadrao = telaFilaPadrao;
        this.telaGuiche = telaGuiche;
        this.telaMedico = telaMedico;
    }

    private void adicionarPacienteNaoPrioritario(){

        interfaceActionsModel.adicionarPacienteTriagem();

    }

}
