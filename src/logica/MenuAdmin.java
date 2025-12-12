package logica;

import java.util.ArrayList;
/**Juan Guzman, 21679842-2,ITI
 * Camila Morales 21539145-0, ICCI
 * 
 * 
 */
import dominio.Coordinador;
import dominio.Estudiantes;
import dominio.Usuario;

public class MenuAdmin {
    private static MenuAdmin instance;
    public static MenuAdmin getInstance() {
        if (instance == null) instance = new MenuAdmin();
        return instance;
    }
    private Controlador c = Controlador.getInstance();
    		

	public boolean guardar(String nombre, String password, String info) {
		return c.agregarCoordinador(nombre, password, info);
	}
	
	
	public boolean modificarCoorContraseña(String nombre,String contraseñaNueva) {

		return c.modificarCoorContraseña(nombre, contraseñaNueva);
		
	}
	public boolean modificarCoorInfo(String nombre,String infoNueva) {
		return c.modificarCoorInfo(nombre, infoNueva);
	}
	
	public boolean eliminar(String nombre) {
	
		return c.eliminar(nombre);
	}
//estudiante
	public boolean guardarEstu(String rut, String nombre, String carrera, int semestre, String email, String pass) {
        return c.agregarEstudiante(rut, nombre, carrera, semestre, email, pass);
    }
    public Estudiantes buscarEstu(String rut) {
        return c.buscarEstudiante(rut);
    }

    public boolean eliminarEst(String rut) {
        return c.eliminarEstudiante(rut);
    }

    public java.util.ArrayList<Estudiantes> getEstudiantes() {
        return c.getEstudiantes();
    }
}
