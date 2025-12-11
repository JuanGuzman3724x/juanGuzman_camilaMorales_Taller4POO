package dominio;
/**Juan Guzman, 21679842-2,ITI
 * Camila Morales 21539145-0, ICCI
 * 
 * 
 */
public class Registros {
	private String rut;
	private String idCertificacion;
	private String fecha;
	private String estado;
	private int porcentaje;
	public Registros(String rut, String idCertificacion, String fecha, String estado, int porcentaje) {
		super();
		this.rut = rut;
		this.idCertificacion = idCertificacion;
		this.fecha = fecha;
		this.estado = estado;
		this.porcentaje = porcentaje;
	}
	public String getRut() {
		return rut;
	}
	public String getIdCertificacion() {
		return idCertificacion;
	}
	public String getFecha() {
		return fecha;
	}
	public String getEstado() {
		return estado;
	}
	public int getPorcentaje() {
		return porcentaje;
	}
	@Override
	public String toString() {
		return "["+ rut + ";" + idCertificacion + ";" + fecha + ";" + estado + ";" + porcentaje + "]";
	}
	

}
