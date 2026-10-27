package Classes;

import java.util.ArrayList;
import java.util.Scanner;

import Esqueletos.GerenciadorDeTarefasEsqueleto;

public class ControleTarefas implements GerenciadorDeTarefasEsqueleto {

    private ArrayList<Tarefas> tarefasSalvas = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void adicionarTarefa(Tarefas t) {
        tarefasSalvas.add(t);
        System.out.println("Tarefa adicionada.");
    }

    // Só as pendentes (não concluídas)
    @Override
    public void listarTarefas() {
        System.out.println(" -Tarefas Pendentes- ");
        boolean achou = false;
        for (Tarefas t : tarefasSalvas) {
            if (!t.getStatusTarefa()) {
                System.out.println(t.getNomeTarefa() + "\n" + t.getDescricao() + "\n");
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhuma tarefa pendente.");
        }
    }

    // Lista numerada com todas, usada para escolher qual editar/concluir/excluir
    public void listarTodas() {
        for (int i = 0; i < tarefasSalvas.size(); i++) {
            Tarefas t = tarefasSalvas.get(i);
            String situacao = t.getStatusTarefa() ? "[concluída]" : "[pendente]";
            System.out.println((i + 1) + " - " + t.getNomeTarefa() + " " + situacao);
        }
    }

    public void editarTarefa(Tarefas t) {
        System.out.println("Atualizar título? S ou N");
        if (sc.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Digite o título: ");
            t.setNomeTarefa(sc.nextLine());
            System.out.println("Título atualizado!");
        }

        System.out.println("Atualizar descrição? S ou N");
        if (sc.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Digite a descrição: ");
            t.setDescricao(sc.nextLine());
            System.out.println("Descrição atualizada!");
        }
    }

    // Só as concluídas
    @Override
    public void historicotarefas() {
        System.out.println("-Tarefas completas-");
        boolean achou = false;
        for (Tarefas t : tarefasSalvas) {
            if (t.getStatusTarefa()) {
                System.out.println(t.getNomeTarefa());
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhuma tarefa concluída.");
        }
    }

    @Override
    public void excluirTarefa(Tarefas t) {
        if (tarefasSalvas.remove(t)) {
            System.out.println("Tarefa excluída.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public ArrayList<Tarefas> getTarefasSalvas() {
        return tarefasSalvas;
    }
}