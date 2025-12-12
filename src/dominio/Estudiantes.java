package dominio;

import java.util.ArrayList;

/**Juan Guzman, 21679842-2,ITI
 * Camila Morales 21539145-0, ICCI
 * 
 * 
 */

public class Estudiantes {
	private String rut;
	private String nombre;
	private String carrera;
	private int semestre;
	private String email;
	private String contrasena;
    private ArrayList<Notas> notas = new ArrayList<>();

	public Estudiantes(String rut, String nombre, String carrera, int semestre, String email, String contrasena) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.carrera = carrera;
		this.semestre = semestre;
		this.email = email;
		this.contrasena = contrasena;
	}
	public String getRut() {
		
		return rut;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public int getSemestre() {
		return semestre;
	}
	public String getEmail() {
		return email;
	}
	public String getContrasena() {
		return contrasena;
	}
	@Override
	public String toString() {
		return"["+rut +"," + nombre +","+  carrera + ","+ semestre + ","+ email+","+contrasena + "]";

}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public void agregarNota(Notas n) {
        notas.add(n);
    }
	}
