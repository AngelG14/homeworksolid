package modelo;

import db.Database;

public class EstudianteDb {

    public void guardarCocheDB(Estudiante estudiante) {
        Database db = new Database();
        db.guardar();
    }

}
