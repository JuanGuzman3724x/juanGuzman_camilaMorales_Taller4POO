package dominio;

public class Notas {
	private String rut;
	private String codigoAsignatura;
	private double calificacion;
	private String estado;
	private String semestre;
	public Notas(String rut, String codigoAsignatura, double calificacion, String estado, String semestre) {
		super();
		this.rut = rut;
		this.codigoAsignatura = codigoAsignatura;
		this.calificacion = calificacion;
		this.estado = estado;
		this.semestre = semestre;
	}
	public String getRut() {
		return rut;
	}
	public String getCodigoAsignatura() {
		return codigoAsignatura;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public String getEstado() {
		return estado;
	}
	public String getSemestre() {
		return semestre;
	}
	@Override
	public String toString() {
		return "[" + rut + ";"+ codigoAsignatura + ";" + calificacion  + ";" + estado + ";" + semestre + "]";
	}
}
