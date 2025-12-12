package logica;

import java.util.ArrayList;

import dominio.Coordinador;
import dominio.Estudiantes;
import dominio.Usuario;

public class Controlador {
	private static Controlador instance;
    public static Controlador getInstance() {
        if (instance == null) instance = new Controlador();
        return instance;
    }
    private Controlador() {}
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Estudiantes> estudiantes = new ArrayList<>();

    public ArrayList<Usuario> getUsuarios() { 
		return usuarios;
	}
	public ArrayList<Estudiantes> getEstudiantes() {
		return estudiantes;
	}
	public Usuario buscar(String nombre) {
        for (Usuario u : usuarios)
            if (u.getNombre().equalsIgnoreCase(nombre))
                return u;
        return null;
    }

    public boolean modificarCoorContraseña(String nombre,String contraseñaNueva) {
		Usuario us = buscar(nombre);
		if(us == null) {
			return false;
		}
		
		us.setPassword(contraseñaNueva);;
		return true;
		
	}
    public boolean agregarCoordinador(String nombre, String pass, String info) {
        if (buscar(nombre) != null) {
        	return false;
        }

        usuarios.add(new Coordinador(nombre, pass, "Coordinador", info));
        return true;
    }
	public boolean modificarCoorInfo(String nombre,String infoNueva) {
		Usuario us = buscar(nombre);
		if(us == null) {
			return false;
		}
		
		if(us instanceof Coordinador) {
			Coordinador c = (Coordinador) us;
			c.setInfo(infoNueva);
			return true;
		}
		return false;
	}
	public boolean eliminar(String nombre) {
		Usuario us = buscar(nombre);
		if(us == null) {
			return false;
		}
		usuarios.remove(us);
		return true;}
	
	public Estudiantes buscarEstudiante(String rut) {
        for (Estudiantes e : estudiantes)
            if (e.getRut().equalsIgnoreCase(rut))
                return e;
        return null;
    }
	public boolean agregarEstudiante(String rut, String nombre, String carrera, int semestre, String email, String contra) {
        if (buscarEstudiante(rut) != null) {
        	return false;
        }

        estudiantes.add(new Estudiantes(rut, nombre, carrera, semestre, email, contra));
        return true;
    }

    public boolean eliminarEstudiante(String rut) {
        Estudiantes e = buscarEstudiante(rut);
        if (e == null) {
        	return false;
        }

        estudiantes.remove(e);
        return true;
    }
    public boolean modificarEstudiante(Estudiantes e, String nombre, String carrera, int semestre, String email, String contra) {
        if (e == null) return false;

        e.setNombre(nombre);
        e.setCarrera(carrera);
        e.setSemestre(semestre);
        e.setEmail(email);
        e.setContrasena(contra);

        return true;
    }

}
