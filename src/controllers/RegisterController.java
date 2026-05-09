package controllers;

import models.users.cliente.Cliente;
import models.users.entregador.EntregadorCarro;
import models.users.entregador.EntregadorMoto;

import java.util.Scanner;

public class RegisterController {
    public static void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Cadastrar Entregador Carro");
        System.out.println("3 - Cadastrar Cliente Moto");
        System.out.println("-----------------------");

        int opt = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("Senha:");
        String senha = sc.nextLine();

        switch (opt) {
            case 1:
                new Cliente(nome, email, senha);

                System.out.println("Cliente cadastrado com sucesso!");
                break;

            case 2:
                new EntregadorCarro(nome, email, senha);
                System.out.println("Entregador carro cadastrado com sucesso!");
                break;

            case 3:
                new EntregadorMoto(nome, email, senha);
                System.out.println("Entregador moto cadastrado com sucesso!");
                break;

            default:
                System.out.println("Opção invalida");
        }
    }
}
