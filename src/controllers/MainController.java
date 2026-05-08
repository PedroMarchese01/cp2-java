package controllers;

import java.util.Scanner;

public class MainController {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao E-commerce");
        while (true) {
            System.out.println("-----------------------");
            System.out.println("1 - logar");
            System.out.println("2 - cadastrar");
            System.out.println("0 - sair");
            System.out.println("-----------------------");
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("-----------------------");
                System.out.println("1 - logar como cliente");
                System.out.println("2 - logar como Entregador");
                System.out.println("-----------------------");

                break;
            }
            if (opt == 2) {

                break;
            }
            if (opt == 0) {

                break;
            } else {
                System.out.println("opção invalida, digite um numero de 0 - 1");
            }

        }


    }
}
