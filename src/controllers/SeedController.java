package controllers;

import models.Product;
import models.users.cliente.Cliente;
import models.users.entregador.EntregadorCarro;
import models.users.entregador.EntregadorMoto;

public class SeedController {
    public static void seed() {

        new Product("Notebook");
        new Product("Mouse");
        new Product("Teclado");

        new Cliente("Lucas", "lucas@gmail.com", "12345");
        new Cliente("Maria", "maria@gmail.com", "123456");

        new EntregadorCarro("Carlos", "carlos@gmail.com", "1234567");
        new EntregadorMoto("Luan", "luan@gmail.com", "12345678");
    }
}
