package controllers;

import models.Product;
import models.users.cliente.Cliente;

import java.util.Scanner;

public class ClienteController {
    public static void menuCliente(Cliente cliente) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Criar pedido");
            System.out.println("2 - Ver pedidos");
            System.out.println("0 - Sair");

            int opt = sc.nextInt();
            sc.nextLine();

            if (opt == 1) {
                System.out.println("Digite o endereço:");
                String endereco = sc.nextLine();

                System.out.println("Produtos:");

                for (Product p : Product.getProdutos()) {
                    System.out.println(p.getId() + " - " + p.getNome());
                }

                int idProduto = sc.nextInt();

                Product produtoEscolhido = null;

                for (Product p : Product.getProdutos()) {
                    if (p.getId() == idProduto) {
                        produtoEscolhido = p;
                    }
                }

                if (produtoEscolhido != null) {
                    cliente.criarPedido(endereco, produtoEscolhido);
                } else {
                    System.out.println("Produto não encontrado!");
                }
            } else if (opt == 2) {
                cliente.verPedidos();
            } else if (opt == 0) {
                cliente.logout("");

                System.out.println("Saindo...");
                break;
            }
        }
    }
}
