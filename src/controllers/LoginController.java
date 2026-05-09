package controllers;

import models.users.cliente.Cliente;
import models.users.entregador.Entregador;

import java.util.Scanner;

public class LoginController {
    public static void loginCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("Senha:");
        String senha = sc.nextLine();

        for (Cliente c : Cliente.getClientes()) {
            if(c.logar(email, senha)) {
                System.out.println("Login realizado com sucesso!");

                ClienteController.menuCliente(c);

                return;
            }
        }

        System.out.println("Email ou senha inválidos");
    }

    public static void loginEntregador() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("Senha:");
        String senha = sc.nextLine();

        for (Entregador e : Entregador.getEntregadores()) {
            if (e.logar(email, senha)) {
                System.out.println("Login realizado com sucesso!");
                System.out.println("Tipo de entregador: " + e.getVeiculo());
                EntregadorController.menuEntregador(e);

                return;
            }
        }

        System.out.println("Email ou senha inválidos");
    }
}
