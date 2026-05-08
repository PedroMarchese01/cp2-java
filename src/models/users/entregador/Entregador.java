package models.users.entregador;

import interfaces.Autenticavel;
import interfaces.RealizaEntrega;
import models.Entrega;
import models.Status;

import java.util.ArrayList;

public abstract class Entregador implements Autenticavel, RealizaEntrega {
    private int id;
    private String name;
    private String email;
    private String password;
    private String veiculo;
    private boolean logado = false;

    private static ArrayList<Entregador> entregadores = new ArrayList<>();
    private ArrayList<Entrega> entregasRealizadas = new ArrayList<>();

    private static int count = 0;

    //contrutor

    public Entregador(String name, String email, String password) {
        id = ++count;
        this.name = name;
        this.email = email;
        this.password = password;
        entregadores.add(this);
    }

    // método abstrato
    public abstract void tipoDeEntrega();

    //Autenticavel
    //----------------
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


    //Realiza Entrega
    //----------------
    public void realizarEntrega() {
        Entrega pedido = Entrega.retirarPedido(this);
        if (pedido != null) {
            System.out.println("Entrega de " + pedido.getCliente().getNome());
            System.out.println("Entrega em: " + pedido.getEndereco_de_entrega());
            System.out.println("Retire na em nossa matriz agora!");

            Status status = pedido.getStatus();
            status.setStatusEmRota();
            status.setStatusConcluido();
            entregasRealizadas.add(pedido);
        }

    }

    public void verEntregasRealizadas() {
        if (entregasRealizadas.isEmpty()) {
            System.out.println("Nenhuma entrega realizada");
        } else {
            System.out.println("Entregas:");
            System.out.println("-------------------------------------");
            for (Entrega i : entregasRealizadas) {
                System.out.println("id: " + i.getId());
                System.out.println("id: " + i.getEndereco_de_entrega());
                System.out.println("Cliente: " + i.getCliente().getNome());
                System.out.println("-------------------------------------");
            }
        }
    }

    //setters
    public void setLogado(Boolean value) {
        logado = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public static ArrayList<Entregador> getEntregadores() {
        return entregadores;
    }
}
