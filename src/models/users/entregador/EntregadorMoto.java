package models.users.entregador;

public class EntregadorMoto extends Entregador {
    private String placa;

    public EntregadorMoto(String name, String email, String password) {
        super(name, email, password);

        setVeiculo("Moto");
    }

    public EntregadorMoto(String name, String email, String password, String placa) {
        super(name, email, password);
        this.placa = placa;

        setVeiculo("Moto");
    }

    @Override
    public void tipoDeEntrega() {
        System.out.println("Entrega realizada via moto");
    }
}
