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


public class App {
	public static void lectura() throws FileNotFoundException {
		File file = new File("usuarios.txt");
		Scanner lector = new Scanner(file);
		while(lector.hasNextLine()) {
			String[] partes = lector.nextLine().split(";");
			String info = "";
			if(partes.length == 4) {
				info = partes[3];
			}
			Usuario us = Factory.crearU(partes[0], partes[1], partes[2], info);
		}
		
	}
	public static void lecturaEstudiantes() throws FileNotFoundException {
		File file = new File("estudiantes.txt");
		Scanner lector = new Scanner(file);
		while(lector.hasNextLine()) {
			String[] partes = lector.nextLine().split(";");
			Estudiantes n = new Estudiantes(partes[0], partes[1],(partes[2]), partes[3],partes[4],partes[5]);
		
	}}
	
	public static void lecturaCertificaciones() throws FileNotFoundException {
		File file = new File("certificaciones.txt");
		Scanner lector = new Scanner(file);
		while(lector.hasNextLine()) {
			String[] partes = lector.nextLine().split(";");
			Certificacion n = new Certificacion(partes[0], partes[1],(partes[2]), Integer.valueOf(partes[3]),Integer.valueOf(partes[4]));
		
	}}
	/*
	 * private String nrc; 0
	private String nombre;1
	private int semestre;2
	private int creditos;3
	private String area;4
	private String requisito;5
	 */
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

		
	public static void lectorCertifi() throws FileNotFoundException {
		Scanner certi = new Scanner(new File("certificaciones.txt"));
		while (certi.hasNextLine()) {
			String[] partes= certi.nextLine().split(";");
			
			
		}
		
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		lectura();
		Gui menu = new Gui();
		menu.iniciar();
	}
	//lectura
	
}
