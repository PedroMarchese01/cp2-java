package models.users.entregador;

import interfaces.Autenticavel;
import interfaces.RealizaEntrega;

import java.util.ArrayList;


public abstract class Entregador implements Autenticavel, RealizaEntrega {
    private int id;
    private String name;
    private String email;
    private String password;
    private String veiculo;
    private boolean logado = false;

    private static ArrayList<Entregador> entregadores = new ArrayList<>();

    private static int count = 0;

    //contrutor

    public Entregador(String name, String email, String password){
        id = ++count;
        this.name = name;
        this.email = email;
        this.password = password;
        entregadores.add(this);
    }

    //Autenticavel
    //----------------
    public boolean logar(String email, String password){

        if(this.logado){
            System.out.println("Usuário já logado");
            return false;
        }

        if(this.email.equals(email) && this.password.equals(password)){
            this.logado = true;
            return true;
        }

        return false;
    }


    public boolean isLogado(String email){
        return logado;
    }

    public void logout(String email){
        setLogado(false);
    }


    //Realiza Entrega
    //----------------
    public void realizarEntrega(){

    }
    public void verEntregasRealizadas(){

    }

    //setters
    public void setLogado(Boolean value){
        logado = value;
    }

}
