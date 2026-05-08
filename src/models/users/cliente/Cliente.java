package models.users.cliente;

import interfaces.Autenticavel;
import interfaces.CriadorDePedido;
import models.Entrega;
import models.Product;

import java.util.ArrayList;

public class Cliente implements Autenticavel, CriadorDePedido {
    private int id;
    private String nome;
    private String email;
    private String password;
    private Boolean logado = false;

    private static int count = 0;
    private ArrayList<Entrega> pedidos = new ArrayList<>();

    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente(String nome, String email, String password) {
        if (nome.isBlank() || password.isBlank() || email.isBlank()) {
            throw new RuntimeException("porfavor insira todos os dados");
        }
        this.nome = nome;
        this.email = email;
        this.password = password;
        id = ++count;

        clientes.add(this);
    }

    //autenticavel
    public boolean logar(String email, String password) {

        if (this.logado) {
            System.out.println("Usuário já logado");
            return false;
        }

        if (this.email.equals(email) && this.password.equals(password)) {
            this.logado = true;
            return true;
        }

        return false;
    }


    public boolean isLogado(String email) {
        return logado;
    }

    public void logout(String email) {
        setLogado(false);
    }

    //criar pedidos
    public boolean criarPedido(String endereco, Product product) {
        if (endereco.isBlank()) {
            return false;
        }
        Entrega entrega = new Entrega(endereco, product, this);

        pedidos.add(entrega);

        return true;
    }

    public void verPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("nenhum pedido realizado");
        } else {
            for (Entrega i : pedidos) {
                System.out.println("id: " + i.getId());
                System.out.println("produto: " + i.getProduto().getNome());
                System.out.println("Local de entrega: " + i.getEndereco_de_entrega());

            }
        }

    }

    //setters e getters

    public String getNome() {
        return nome;
    }

    public void setLogado(Boolean logado) {
        this.logado = logado;
    }


}
