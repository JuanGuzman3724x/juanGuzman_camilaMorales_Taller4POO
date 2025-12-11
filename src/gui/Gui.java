package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Gui {
	public void iniciar() {
		JFrame ventanaPrincipal = new JFrame("Ventana");
		JTextField login = new JTextField();
		JTextField contraField = new JTextField();
		JPanel panel = new JPanel( new BorderLayout() );
		JPanel contenido = new JPanel();
		JTabbedPane tabs = new JTabbedPane();
		
		ventanaPrincipal.setSize(800,600);
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setLocationRelativeTo(null);
		ventanaPrincipal.add(panel);
		ventanaPrincipal.setVisible(true);
	
	}
	public void menuAdministrador() {
		
	}
	
	public void menuUsuario() {
		JFrame ventanaUsuarioFrame = new JFrame("Usuario")
				
;		
	}


	
	

	
}
