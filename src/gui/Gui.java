package gui;
/**Juan Guzman, 21679842-2,ITI
 * Camila Morales 21539145-0, ICCI
 * 
 * 
 */
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
		ventanaPrincipal.add(tabs);
		ventanaPrincipal.setVisible(true);
	
	}
	public void menuAdministrador(JTabbedPane tabs) {
		
		
	}
	
	public void menuUsuario(JTabbedPane tabs) {
		JFrame ventanaUsuarioFrame = new JFrame("Usuario")
				
;		
	}


	
	

	
}
