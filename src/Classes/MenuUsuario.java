package Classes;

import java.util.Scanner;

import Classes.Usuario;

public class MenuUsuario {

    public void menuCadastro() {

        Scanner sc = new Scanner(System.in);
        boolean continuar = false;
        int escolha;

        do {
            System.out.println("- - - - - - - - - - - - - - - ");

            System.out.println("Bem vindo!");
            System.out.println("Digite seu nome: ");
            Usuario user = new Usuario(sc.nextLine());
            System.out.println("Usuário cadastrato!");
            continuar = false;


        } while (continuar == true);

    }

}
