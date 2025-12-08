package logica;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import dominio.Usuario;
import gui.Gui;

public class App {
	public static void main(String[] args) {
		Gui menu = new Gui();
		menu.iniciar();
	}
	//lectura
	public void lectura() throws FileNotFoundException {
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
}
