/**
 * Contrato para qualquer canal de notificação.
 */
public interface Notificador {

    void enviarMensagem(String mensagem);
}