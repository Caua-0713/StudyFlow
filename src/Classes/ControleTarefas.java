package Classes;

import Esqueletos.TarefasAbstract;
import java.util.Scanner;
import java.util.ArrayList;

public class ControleTarefas extends TarefasAbstract {

    ArrayList<Tarefas> tarefasSalvas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

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
    public void historicoDetarefas(Tarefas t) { // Lista as tarefas completas

        System.out.println("-Tarefas completas-");

        for (Tarefas tarefas : tarefasSalvas) {

            if (t.isStatusTarefa() == false) {

                System.out.println(tarefas);
            } else {
                continue;
            }

        }
    }

    public void editarTarefa(Tarefas t) {
        String escolha;
        System.out.println("Atualizar título? S ou N");
        escolha = sc.nextLine();
        if (escolha.equalsIgnoreCase("S")) {

            System.out.println("Digite o título.");
            t.setNomeTarefa(sc.nextLine());

        }

    System.out.println("Deseja atualiazar a descrição? S ou N");
          escolha = sc.nextLine();
        if (escolha.equalsIgnoreCase("S")) {

            System.out.println("Digite a descrição: ");
    
            t.setDescricao(sc.nextLine());
        System.out.println("Descrição atualizada!");

        }




    }

}
