package controllers;

import java.util.Scanner;

public class MainController {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao E-commerce");
        while (true) {
            System.out.println("-----------------------");
            System.out.println("1 - Logar");
            System.out.println("2 - Cadastrar");
            System.out.println("0 - Sair");
            System.out.println("-----------------------");
            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("-----------------------");
                    System.out.println("1 - logar como cliente");
                    System.out.println("2 - logar como Entregador");
                    System.out.println("-----------------------");

                    int loginOpt = sc.nextInt();
                    sc.nextLine();
                    if (loginOpt == 1) {
                        LoginController.loginCliente();
                    } else if (loginOpt == 2) {

                        LoginController.loginEntregador();
                    } else {
                        System.out.println("Opção inválida, digite um número de 1 - 2");
                    }

                    break;

                case 2:
                    RegisterController.register();

                    break;

                case 0:
                    System.out.println("Encerrando...");
                    return;
                default:
                    System.out.println("Opção inválida, digite um número de 0 - 1");
            }

        }


    }
}
