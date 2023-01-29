package service;

import modelo.Estudiante;

public class EnvioMaterial{

    public void enviarMaterialEstudiante(Estudiante estudiante) {


        EmailServicio servicio = new EmailServicio(new EmailOutlook());
        servicio.envioEmail(estudiante.getEnvio());

        /*

        Problema de open close ya que al agregar una nueva carrera es necesario agregarla en el codigo, 
        ademas se localizo un problema de inversion de dependencia ( en email) ya que depende de la implementacion y no de abstracciones.
        
        if (estudiante.carrera.equals("Informatica")) {
            Envio envio = new Envio();
            envio.material = new ArrayList<>();
            envio.material.add("Computador");
            envio.material.add("Mouse");
            envio.saludoDirector = "Jenny envia saludos";
            EmailOutlook email = new EmailOutlook();
            email.enviarEmail(envio);
        }
        if (estudiante.carrera.equals("Administracion")) {
            //lo mismo de arriba pero con otra informacion
        }
        if (estudiante.carrera.equals("Industrial")) {
            //
        }

        */

    }
}
