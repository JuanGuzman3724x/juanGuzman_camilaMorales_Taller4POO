package logica;

import java.security.cert.Certificate;
import java.util.ArrayList;

import dominio.AsignaturaCertificacion;
import dominio.Certificacion;
import dominio.Cursos;
import dominio.Estudiantes;
import dominio.Notas;

public class menuCoor {
	 private static menuCoor instance;

	    public static menuCoor getInstance() {
	        if (instance == null) instance = new menuCoor();
	        return instance;
	    }
	    private ArrayList<Certificacion> certificaciones = new ArrayList<>();
	    private menuCoor() {}


	public boolean modificarLinea(String id, String nombre, String descripcion, int requisito, int validez) {
		for(Certificacion c:  certificaciones) {
			if(c.getId().equalsIgnoreCase(id)) {
				c.setNombre(nombre);
				c.setDescripcion(descripcion);
				c.setRequisito(requisito);
				c.setValidez(validez);
				return true;

			}
		}
		return false;
	}
	
}
