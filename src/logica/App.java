package logica;
/**Juan Guzman, 21679842-2,ITI
 * Camila Morales 21539145-0, ICCI
 * 
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import dominio.Usuario;
import gui.Gui;

import dominio.AsignaturaCertificacion;
import dominio.Certificacion;
import dominio.Cursos;
import dominio.Estudiantes;
import dominio.Notas;
import dominio.Registros;


public class App {
    private static Controlador c = Controlador.getInstance();

	
	public static void lecturaUsuarios() throws FileNotFoundException {
        File file = new File("usuarios.txt");
        Scanner lector = new Scanner(file);

        while (lector.hasNextLine()) {

            String[] p = lector.nextLine().split(";");
            String nombre = p[0];
            String pass = p[1];
            String rol = p[2];
            String info = (p.length == 4) ? p[3] : "";

            Usuario u = Factory.crearU(nombre, pass, rol, info);
            c.getUsuarios().add(u);
        }
    }
	
	public static void lecturaEstudiantes() throws FileNotFoundException {
		File file = new File("estudiantes.txt");
		Scanner lector = new Scanner(file);
		String[] p = lector.nextLine().split(";");

        Estudiantes e = new Estudiantes(p[0],p[1],p[2],Integer.parseInt(p[3]),p[4],p[5] );
		c.getEstudiantes().add(e);}

	
	public static void lecturaCertificaciones() throws FileNotFoundException {
		File file = new File("certificaciones.txt");
		Scanner lector = new Scanner(file);
		while(lector.hasNextLine()) {
			String[] partes = lector.nextLine().split(";");
			Certificacion n = new Certificacion(partes[0], partes[1],(partes[2]), Integer.valueOf(partes[3]),Integer.valueOf(partes[4]));
		
	}}
	
	public static void lecturaCursos() throws FileNotFoundException {
		File file = new File("cursos.txt");
		Scanner lector = new Scanner(file);
		while(lector.hasNextLine()) {
			String[] partes = lector.nextLine().split(";");
			Cursos n = new Cursos(partes[0], partes[1],Integer.valueOf(partes[2]), Integer.valueOf(partes[3]),partes[4]);
		
	}}
	
	public static void lecturaAsignatura() throws FileNotFoundException {
		File file = new File("asignaturas_certificacion.txt");
		Scanner lector = new Scanner(file);
		while(lector.hasNextLine()) {
			String[] partes = lector.nextLine().split(";");
			AsignaturaCertificacion n = new AsignaturaCertificacion(partes[0], partes[1]);
		
	}}
	
	public static void lecturaNotas() throws FileNotFoundException {
		File file = new File("notas.txt");
		Scanner lector = new Scanner(file);
		while(lector.hasNextLine()) {
			String[] partes = lector.nextLine().split(";");
			Notas n = new Notas(partes[0], partes[1],Double.valueOf(partes[2]), partes[3],partes[4]);
		
	}
	}

		
	public static void lectorRegistro() throws FileNotFoundException {
		Scanner certi = new Scanner(new File("certificaciones.txt"));
		while (certi.hasNextLine()) {
			String[] partes= certi.nextLine().split(";");
			Registros r = new Registros(partes[0],partes[1], partes[2], partes[3], Integer.parseInt(partes[4]) ); 

			
		}
		
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		Gui menu = new Gui();
		menu.iniciar();
	}
	//lectura
	
}
