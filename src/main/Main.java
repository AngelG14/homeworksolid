package main;

import modelo.*;

import service.EnvioMaterial;

public class Main {

    public static void main(String[] args) {

        new Main();

        /*

        *Code refactoring debido a que en el main se deberia hacer uso del constructor


        Estudiante[] listadoEstudiantes = {
                new Estudiante("Daniel", "Informatica"),
                new Estudiante("Monica", "Administracion"),
                new Estudiante("Liliana", "Industrial")
        };
        verMateriasEstudiantes(listadoEstudiantes);

        *Problema de inversion de dependencia debido a la dependencia entre material y la clase Estudiante

        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Estudiante("Daniel", "Informatica"));

        */
    }

    public Main() {

        Estudiante[] listadoEstudiantes = {
                new Informatica("Daniel"),
                new Administracion("Monica"),
                new Industrial("Liliana")
        };

        verMateriasEstudiantes(listadoEstudiantes);

        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Informatica("Daniel"));

    }



    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getMaterias());
        }

        /*

        *Problema Open Closed ya que al agregar una nueva carrera a la clase estudiante se debe modificar directamente el metodo

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.carrera.equals("Informatica")) {
                System.out.println("Programacion, Arquitectura, Base de datos");
            }
            if (estudiante.carrera.equals("Administracion")) {
                System.out.println("Negocios, Administracion I, Historia de la Administracion");
            }
            if (estudiante.carrera.equals("Industrial")) {
                System.out.println("Procesos, Analitica de datos, Gestion de Calidad ");
            }
        }

        */

    }
}
