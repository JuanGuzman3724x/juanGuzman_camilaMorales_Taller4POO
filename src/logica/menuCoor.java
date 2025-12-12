package logica;

import java.security.cert.Certificate;
import java.util.ArrayList;

import dominio.AsignaturaCertificacion;
import dominio.Certificacion;
import dominio.Cursos;
import dominio.Estudiantes;
import dominio.Notas;

public class menuCoor {
	  private ArrayList<Certificacion> certificaciones;
	  private ArrayList<AsignaturaCertificacion> asignaturas;
	  private ArrayList<Cursos> cursos;
	  private ArrayList<Estudiantes> estudiantes;
	  private ArrayList<Notas> nota;

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
