package dominio;

public class Usuario {
	protected String nombre;
	protected String password;
	protected String rol;
	
	public Usuario(String nombre, String password, String rol) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.rol = rol;
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
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return"[" + nombre +","+  password + ","+ rol + ",";
	}
	

}
