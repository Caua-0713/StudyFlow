package Classes;

import java.util.UUID;
import java.util.Scanner;

import Esqueletos.MenuUsuarioEsqueleto;

public class Usuario implements MenuUsuarioEsqueleto {

    private String nome;
    private UUID id;
    private int cont = 0;
    Scanner sc = new Scanner(System.in);

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
            setNome(sc.next(nome));
            if (nome == "") {
                System.out.println("Nome inválido ou vazio!");
                sucesso = false;

            } else {

                sucesso = true;

            }

        } while (sucesso != true);

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

}
