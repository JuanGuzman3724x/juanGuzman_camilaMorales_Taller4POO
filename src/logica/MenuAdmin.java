package logica;

import java.util.ArrayList;

import dominio.Coordinador;
import dominio.Estudiantes;
import dominio.Usuario;

public class MenuAdmin {
	private ArrayList<Usuario> u = new ArrayList<>();
	private ArrayList<Estudiantes> estudiante = new ArrayList<>();

	public boolean guardar(String nombre, String password, String info) {
		if(buscar(nombre) != null) {
			return false;
			
		}
		Usuario us = Factory.crearU(nombre, password, "Coordinador", info);
		u.add(us);
		return true;
	}

	public Usuario buscar(String nombre) {
		for(Usuario usuarios : u) {
			if(usuarios.getNombre().equalsIgnoreCase(nombre)){
				return usuarios;
			}
		}
		return null;
	}
	public boolean modificarCoorContraseña(String nombre,String contraseñaNueva) {
		Usuario us = buscar(nombre);
		if(us == null) return false;
		
		us.setPassword(contraseñaNueva);;
		return true;
		
	}
	public boolean modificarCoorInfo(String nombre,String infoNueva) {
		Usuario us = buscar(nombre);
		if(us == null) return false;
		
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
		u.remove(us);
		return true;
	}
	public boolean guardarEstu(String rut, String nombre, String carrera, String semestre, String email, String contrasena) {
		if(buscarEstu(nombre) != null) {
			return false;
			
		}
		estudiante.add(new Estudiantes(rut, nombre, carrera, semestre, email, contrasena) );
		return true;

	}

	public Estudiantes buscarEstu(String rut) {
		for(Estudiantes e : estudiante) {
            if (e.getRut().equalsIgnoreCase(rut)) return e;
			}
		
		return null;
	}
	public boolean modificarEstu(String rut, String nombre, String carrera,
	        String semestre, String email, String contrasena) {

		Estudiantes e = buscarEstu(rut);
		if (e == null) return false;

		e.setNombre(nombre);
		e.setCarrera(carrera);
		e.setSemestre(semestre);
		e.setEmail(email);
		e.setContrasena(contrasena);

	return true;
	}
	public boolean eliminarEst(String rut) {
		Estudiantes es = buscarEstu(rut);
		if(es == null) {
			return false;
		}
		estudiante.remove(es);
		
		return true;
	}
	public ArrayList<Usuario> getU() {
		return u;
	}

	public ArrayList<Estudiantes> getEstudiante() {
		return estudiante;
	}
	
}
