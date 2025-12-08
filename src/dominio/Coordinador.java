package dominio;

public class Coordinador extends Usuario {
	protected String info;

	public Coordinador(String nombre, String password, String rol, String info) {
		super(nombre, password, "Coordinador");
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	


}
