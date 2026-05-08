package models;

public class Status {
    private String status = "Pendente";
    private int statusNum = 0;


    //setters
    public boolean setStatusEmSeparacao() {
        status = "Em separação";
        statusNum = 1;
        System.out.println("Entrega em separação");
        return true;
    }

    public boolean setStatusProntoParaRetirar() {
        status = "Pronto para retirar";
        statusNum = 2;
        System.out.println("Entrega pronta para retirada de nosso entregador");

        return true;
    }

    public boolean setStatusEmRota() {
        status = "Em rota";
        statusNum = 3;
        System.out.println("Entrega Em rota");

        return true;
    }

    public boolean setStatusConcluido() {
        status = "Concluido";
        statusNum = 4;
        System.out.println("Entrega concluida");
        return true;
    }

    //getters
    public int getStatusNum() {
        return statusNum;
    }

    public String getStatus() {
        return status;
    }
}
