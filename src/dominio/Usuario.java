package dominio;

public class Usuario {
	private String nombre;
	private String password;
	private String rol;
	private String info;
	
	public Usuario(String nombre, String password, String rol, String info) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.rol = rol;
		this.info = info;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getPassword() {
		return password;
	}
	public String getRol() {
		return rol;
	}
	public String getInfo() {
		return info;
	}
	

}
