package logica;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import dominio.Usuario;
import gui.Gui;

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
