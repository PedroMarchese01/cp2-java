package models;

public class Product {
    private int id;
    private String nome;

    private static int count = 0;

    public Product(String nome) {
        if (!nome.isBlank()) {
            id = ++count;
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
}
