package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class GuiAdmin {
	
	public  GuiAdmin() {
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

}
