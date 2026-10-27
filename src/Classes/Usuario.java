package Classes;

import java.util.Scanner;
import java.util.UUID;

import Esqueletos.MenuInteracaoEsqueleto;

public class Usuario implements MenuInteracaoEsqueleto {

    private String nome;
    private UUID id;
    private ControleTarefas controle = new ControleTarefas();
    private Scanner sc = new Scanner(System.in);

    public Usuario(String nome) {
        setNome(nome);
        this.id = UUID.randomUUID();
    }

    @Override
    public void imprimir() {
        System.out.println("Usuário ");
        System.out.println("Nome: " + getNome());
        System.out.println("ID: " + getId());
    }

    @Override
    public void editarNome() {
        boolean sucesso;

        do {
            System.out.println("Digite o seu nome: ");
            String novoNome = sc.nextLine();

            if (novoNome == null || novoNome.isBlank()) {
                System.out.println("Nome inválido ou vazio!");
                sucesso = false;
            } else {
                setNome(novoNome);
                sucesso = true;
            }

        } while (!sucesso);
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public ControleTarefas getControle() {
        return controle;
    }
}