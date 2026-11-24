public class WhatsappNotificador implements Notificador {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[WhatsApp] Enviando: " + mensagem);
    }
}