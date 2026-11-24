public class UsuarioService {

    // Depende da abstração (interface), não de uma implementação concreta
    private final Notificador notificador;

    // Injeção de dependência via construtor
    public UsuarioService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void registrar(String nome) {
        System.out.println("Usuário " + nome + " registrado.");
        notificador.enviarMensagem("Bem-vindo " + nome + "!");
    }
}