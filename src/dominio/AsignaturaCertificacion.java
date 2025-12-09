package dominio;

public class AsignaturaCertificacion {
	private String id;
	private String nrc;
	public AsignaturaCertificacion(String id, String nrc) {
		super();
		this.id = id;
		this.nrc = nrc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNrc() {
		return nrc;
	}
	public void setNrc(String nrc) {
		this.nrc = nrc;
	}
	@Override
	public String toString() {
		return "[" + id + ", " + nrc + "]";
	}
	

}
