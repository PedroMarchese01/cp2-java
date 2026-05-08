package models;

import java.util.ArrayList;

public class Product {
    private int id;
    private String nome;

    private static int count = 0;

    private static ArrayList<Product> produtos = new ArrayList<>();

    public Product(String nome) {
        if (!nome.isBlank()) {
            id = ++count;
            produtos.add(this);
        } else {
            throw new RuntimeException("Nome do produto deve conter pelomenos 1 caracter");
        }
    }

    //getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public static ArrayList<Product> getProdutos() {
        return produtos;
    }
}
