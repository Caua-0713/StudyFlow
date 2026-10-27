package Classes;

import java.util.Scanner;

public class MenuUsuario {

    private Scanner sc = new Scanner(System.in);

    public Usuario menuCadastro() {
        System.out.println("- - - - - - - - - - - - - - - ");
        System.out.println("Bem vindo!");
        System.out.println("Digite seu nome: ");
        Usuario user = new Usuario(sc.nextLine());
        System.out.println("Usuário cadastrado!");
        return user;
    }

    public void menuPrincipal(Usuario user) {
        int escolha;

        do {
            System.out.println("- - - - - - - - - - - - - - - ");
            System.out.println("1 - Tarefas");
            System.out.println("2 - Perfil");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            escolha = lerOpcao();

            switch (escolha) {
                case 1:
                    menuTarefas(user);   // abre o menu de tarefas
                    break;
                case 2:
                    user.imprimir();
                    break;
                case 0:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }

    private void menuTarefas(Usuario user) {
        ControleTarefas controle = user.getControle();
        int escolha;

        do {
            System.out.println("- - - - - - - - - - - - - - - ");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar pendentes");
            System.out.println("3 - Editar tarefa");
            System.out.println("4 - Concluir tarefa");
            System.out.println("5 - Excluir tarefa");
            System.out.println("6 - Histórico (concluídas)");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            escolha = lerOpcao();

            switch (escolha) {
                case 1:
                    System.out.println("Título: ");
                    String titulo = sc.nextLine();
                    System.out.println("Descrição: ");
                    String desc = sc.nextLine();
                    controle.adicionarTarefa(new Tarefas(titulo, desc));
                    break;
                case 2:
                    controle.listarTarefas();
                    break;
                case 3:
                    Tarefas paraEditar = escolherTarefa(controle);
                    if (paraEditar != null) controle.editarTarefa(paraEditar);
                    break;
                case 4:
                    Tarefas paraConcluir = escolherTarefa(controle);
                    if (paraConcluir != null) {
                        paraConcluir.setStatusTarefa(true);
                        System.out.println("Tarefa concluída!");
                    }
                    break;
                case 5:
                    Tarefas paraExcluir = escolherTarefa(controle);
                    if (paraExcluir != null) controle.excluirTarefa(paraExcluir);
                    break;
                case 6:
                    controle.historicotarefas();
                    break;
                case 0:
                    break;   // volta ao menu principal
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }

    // Mostra a lista numerada e devolve a tarefa escolhida (ou null)
    private Tarefas escolherTarefa(ControleTarefas controle) {
        if (controle.getTarefasSalvas().isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return null;
        }
        controle.listarTodas();
        System.out.print("Número da tarefa: ");
        try {
            int i = Integer.parseInt(sc.nextLine()) - 1;
            return controle.getTarefasSalvas().get(i);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Tarefa inválida!");
            return null;
        }
    }

    // Lê a opção digitada sem quebrar se o usuário digitar letras
    private int lerOpcao() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}