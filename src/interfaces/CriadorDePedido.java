package interfaces;

import models.Product;

public interface CriadorDePedido {
    public boolean criarPedido(String endereco, Product product);
    public void verPedidos();
}
