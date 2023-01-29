package service;
import modelo.Envio;

public class EmailServicio {
    private IEmail interfaz;

    public EmailServicio(IEmail interfaz) {
        this.interfaz = interfaz;
    }
    void envioEmail(Envio envio){
        interfaz.enviarEmail(envio);
    }

}
