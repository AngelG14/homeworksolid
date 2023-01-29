package modelo;

public abstract class Estudiante {

    private String nombre;
    private String materias;
    private Envio envio;

    public Estudiante(String nombre, String materias, Envio envio) {
        this.nombre = nombre;
        this.materias = materias;
        this.envio = envio;
    }



    /*
    Problema de Single responsability
    void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }
    */

    public String getNombre() {
        return nombre;
    }

    public String getMaterias() {
        return materias;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }



}
