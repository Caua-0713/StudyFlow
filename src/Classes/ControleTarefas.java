package Classes;
import java.util.Scanner;

import Esqueletos.GerenciadorDeTarefasEsqueleto;

import java.util.ArrayList;

public class ControleTarefas implements GerenciadorDeTarefasEsqueleto {

    ArrayList<Tarefas> tarefasSalvas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void adicionarTarefa(Tarefas t) {

        tarefasSalvas.add(t);
        System.out.println("Tarefa Adicionada.");

    }

       @Override
    public void listarTarefas() { // Tarefas pendentes
        System.out.println(" -Tarefas Pendentes- ");
        for (Tarefas taref : tarefasSalvas) {
        System.out.println(taref.getNomeTarefa() + "-\n" + taref.getStatusTarefa() + "-\n" + taref.getDescricao());
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

    @Override
    public void historicotarefas() {
      System.out.println("-Tarefas completas-");

        for (Tarefas tarefas : tarefasSalvas) {

            if (tarefas.getStatusTarefa() == true) {

                System.out.println(tarefas);
            } else {
                continue;
            }

        }
    }

    @Override
    public void excluirTarefa(Tarefas t) {
        boolean removido = tarefasSalvas.remove(t);
        if (removido) {
            System.out.println("Tarefa excluída.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }


}
