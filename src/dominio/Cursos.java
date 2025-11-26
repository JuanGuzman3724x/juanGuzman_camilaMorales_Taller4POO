package dominio;

public class Cursos {
	private String nrc;
	private String nombre;
	private int semestre;
	private int creditos;
	private String area;
	private String requisito;
	
	public Cursos(String nrc, String nombre, int semestre, int creditos, String area) {
		super();
		this.nrc = nrc;
		this.nombre = nombre;
		this.semestre = semestre;
		this.creditos = creditos;
		this.area = area;
	}
	public String getNrc() {
		return nrc;
	}
	public String getNombre() {
		return nombre;
	}
	public int getSemestre() {
		return semestre;
	}
	public int getCreditos() {
		return creditos;
	}
	public String getArea() {
		return area;
	}
	public String getRequisito() {
		return requisito;
	}
	

}
