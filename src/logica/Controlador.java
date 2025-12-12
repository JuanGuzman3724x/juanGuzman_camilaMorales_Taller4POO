package logica;

public class Controlador {
	private static Controlador instance;
    public static Controlador getInstance() {
        if (instance == null) instance = new Controlador();
        return instance;
    }
    private Controlador() {}

}
