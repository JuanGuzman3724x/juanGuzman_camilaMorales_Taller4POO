package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {
	public void iniciar() {
		JFrame ventanaPrincipal = new JFrame("Ventana");
		ventanaPrincipal.setSize(800,600);
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		ventanaPrincipal.setVisible(true);
		
	}


	
	

	
}
