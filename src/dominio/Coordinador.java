package dominio;
/**Juan Guzman, 21679842-2,ITI
 * Camila Morales 21539145-0, ICCI
 * 
 * 
 */
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
