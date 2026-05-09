package controllers;

import models.users.entregador.Entregador;

import java.util.Scanner;

public class EntregadorController {
    public static void menuEntregador(Entregador entregador) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Realizar entrega");
            System.out.println("2 - Ver entregas realizadas");
            System.out.println("0 - Sair");

            int opt = sc.nextInt();

            if (opt == 1) {
                entregador.realizarEntrega();
            } else if (opt == 2) {
                entregador.verEntregasRealizadas();
            } else if (opt == 0) {
                entregador.logout("");

                System.out.println("Saindo...");
                break;
            }
        }
    }
}
