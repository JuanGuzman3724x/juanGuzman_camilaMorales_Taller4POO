package logica;

import java.util.ArrayList;

import dominio.Usuario;

public class MenuAdmin {
	private ArrayList<Usuario> u = new ArrayList<>();
	
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
	public void modificarCoorContraseña(String nombre,String contraseñaNueva) {
		Usuario us = buscar(nombre);
		us.setPassword(contraseñaNueva);;
		
	}
	public void modificarCoorInfo(String nombre,String contraseñaNueva) {
		Usuario us = buscar(nombre);
	//	us.setInfo(contraseñaNueva);
		
	}
	public boolean eliminar(String nombre) {
		Usuario us = buscar(nombre);
		if(u == null) {
			return false;
		}
		u.remove(us);
		return true;
	}

	public ArrayList<Usuario> getU() {
		return u;
	}
	
}
