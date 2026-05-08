package models.users.entregador;

public class EntregadorCarro extends Entregador {

    public EntregadorCarro(String name, String email, String password) {
        super(name, email, password);
    }

    @Override
    public void tipoDeEntrega() {
        System.out.println("Entrega realizada via carro");
    }
}
