package models.users.entregador;

public class EntregadorMoto extends Entregador {
    public EntregadorMoto(String name, String email, String password) {
        super(name, email, password);

        setVeiculo("Moto");
    }

    @Override
    public void tipoDeEntrega() {
        System.out.println("Entrega realizada via moto");
    }
}
