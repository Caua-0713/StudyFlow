package Classes;

import Esqueletos.TarefasAbstract;
import java.util.Scanner;
import java.util.ArrayList;

public class ControleTarefas extends TarefasAbstract {

    ArrayList<Tarefas> tarefasSalvas = new ArrayList<>();

    @Override
    public void adicionarTarefa(Tarefas t) {

        tarefasSalvas.add(t);
        System.out.println("Tarefa Adicionada.");

    }

    @Override
    public void listarTarefas(Tarefas t) { // Lista as tarefas pendentes

        System.out.println(" -Tarefas Pendentes- ");
        for (Tarefas taref : tarefasSalvas) {

            if (t.isStatusTarefa() == true) {
                continue;
            } else {

                System.out.println(taref);

            }

        }

    }

    @Override
    public void historicoDetarefas(Tarefas t) { //Lista as tarefas completas

    System.out.println("-Tarefas completas-");
    
    for (Tarefas tarefas : tarefasSalvas) {

        if (t.isStatusTarefa() == false){

            System.out.println(tarefas);
        } else {
            continue;
        }  
      
        
    }
}

    public void editarTarefa(Tarefas t) {

    }
    
}
