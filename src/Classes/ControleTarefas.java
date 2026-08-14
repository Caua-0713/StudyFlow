package Classes;

import java.util.ArrayList;

import Esqueletos.TarefasAbstract;

public class ControleTarefas extends TarefasAbstract {

    ArrayList<ControleTarefas> tarefasAtuais = new ArrayList<ControleTarefas>();
    

    public ControleTarefas(String titulo, boolean status, String descricao) {
        super(titulo, status, descricao);

    }

    @Override
    public void listarTarefas() {        //Esse método deve listar as tarefas a serem feitas, depois vou criar o resto da lógica

        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println(" - Tarefas Atuais -");
        for (ControleTarefas t : tarefasAtuais) {
    System.out.println("-" + t);

        }
        System.out.println("- - - - - - - - - - - - - - -");

    }

    @Override
    public void historicoDetarefas() { //Aqui deve mostrar as tarefas já concluidas, a lógica ainda vai ser completada

         System.out.println("- - - - - - - - - - - - - - -");
        System.out.println(" - Tarefas concluidas -");
        for (ControleTarefas t : tarefasAtuais) {
        System.out.println("-" + t);

        }
        System.out.println("- - - - - - - - - - - - - - -");

    }

    
    public void adicionarTarefa(ControleTarefas t1) {

        tarefasAtuais.add(t1);

    System.out.println("Tarefa criada com sucesso!");

    }

    @Override
    public void editarTarefa() {

    }

    
    public void excluirTarefa(ControleTarefas t1) { 

        System.out.println("Editar tarefa: ");


    }

}
