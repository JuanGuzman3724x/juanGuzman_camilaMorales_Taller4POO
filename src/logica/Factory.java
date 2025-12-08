package logica;

import dominio.Admin;
import dominio.Coordinador;
import dominio.Usuario;

public class Factory {
	public static Usuario crearU(String nombre, String password, String rol, String info) {
		switch (rol) {
		
		case "Admin": 
			return new Admin(nombre, password, rol);
			
		case "Coordinador": 
			return new 	Coordinador(nombre, nombre, rol, info);
	
		}
		return null;
	}
}
