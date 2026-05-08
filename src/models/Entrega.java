package models;

import models.users.cliente.Cliente;
import models.users.entregador.Entregador;

import java.util.ArrayList;

public class Entrega {

    private int id;
    private String endereco_de_entrega;
    private Product produto;
    private Status status = new Status();
    private Cliente cliente;
    private Entregador entregador;

    private static int count = 0;
    private static ArrayList<Entrega> entregas = new ArrayList<>();

    public Entrega(String endereco_de_entrega, Product produto, Cliente cliente){
        if(endereco_de_entrega.isBlank()){
            throw new RuntimeException("Porfavor insira um endereço de entrega com pelomenos 1 caracter");
        }
        id = ++count;
        this.endereco_de_entrega = endereco_de_entrega;
        this.produto =produto;
        this.cliente = cliente;
        entregas.add(this);
        System.out.println("Pedido Adicionado em nossas entregas com sucesso!");
    }

    public static Entrega retirarPedido(Entregador entregador){

        if(entregas.isEmpty()){
            System.out.println("não há entregas disponiveis");
            return null;
        }

        Entrega primeiraEntrega = entregas.getFirst();

        primeiraEntrega.setEntregador(entregador);
        Status status = primeiraEntrega.getStatus();
        status.setStatusEmSeparacao();
        status.setStatusProntoParaRetirar();


        entregas.removeFirst();

        return primeiraEntrega;
    }


    //setters e getters


    public Status getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getEndereco_de_entrega() {
        return endereco_de_entrega;
    }

    public Product getProduto() {
        return produto;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }
}
