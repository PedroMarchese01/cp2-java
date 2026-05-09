package models.users.entregador;

public class EntregadorCarro extends Entregador {
    private String placa;

    public EntregadorCarro(String name, String email, String password) {
        super(name, email, password);

        setVeiculo("Carro");
    }

    // Sobrecarga de métodos
    public EntregadorCarro(String name, String email, String password, String placa) {
        super(name, email, password);
        this.placa = placa;

        setVeiculo("Carro");
    }

    @Override
    public void tipoDeEntrega() {
        System.out.println("Entrega realizada via carro");
    }
}
