package interfaces;

public interface Autenticavel {
    public boolean logar(String email, String password);

    public boolean isLogado(String email);

    public void logout(String email);
}
