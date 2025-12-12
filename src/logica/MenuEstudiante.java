package logica;

import dominio.Estudiantes;

public class MenuEstudiante {
    private static MenuEstudiante instance;
    public static MenuEstudiante getInstance() {
        if (instance == null) instance = new MenuEstudiante();
        return instance;
    }
    private Controlador c = Controlador.getInstance();		
    private MenuEstudiante() {}
    public Estudiantes buscar(String rut) {
        return c.buscarEstudiante(rut);
    }

}
