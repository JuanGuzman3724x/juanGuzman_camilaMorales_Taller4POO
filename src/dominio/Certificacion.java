package dominio;
/**Juan Guzman, 21679842-2,ITI
 * Camila Morales 21539145-0, ICCI
 * 
 * 
 */
public class Certificacion {
	private String id;
	private String nombre;
	private String descripcion;
	private int requisito;
	private int validez;
	public Certificacion(String id, String nombre, String descripcion, int requisito, int validez) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.requisito = requisito;
		this.validez = validez;
	}
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getRequisito() {
		return requisito;
	}
	public int getValidez() {
		return validez;
	}
	@Override
	public String toString() {
		return "["+ id + ";"+ nombre + ";"+descripcion +";"+ requisito + ";" + validez + "]";
	}

}
