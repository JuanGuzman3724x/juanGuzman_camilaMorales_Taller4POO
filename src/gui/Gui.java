package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Gui {
	public void iniciar() {
	    JFrame ventanaPrincipal = new JFrame("Ventana");
	    JTextField login = new JTextField(15);
	    JTextField contraField = new JTextField(15);

	    JPanel panel = new JPanel(new BorderLayout());
	    JPanel contenido = new JPanel(); // Panel central
	    contenido.setLayout(new GridBagLayout());

	    GridBagConstraints gbc = new GridBagConstraints();
	    gbc.insets = new Insets(10, 10, 10, 10);
	    gbc.fill = GridBagConstraints.HORIZONTAL;

	    // --- Etiqueta Usuario ---
	    JLabel lblUsuario = new JLabel("Usuario:");
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    contenido.add(lblUsuario, gbc);

	    // --- Campo de texto Usuario ---
	    gbc.gridx = 1;
	    contenido.add(login, gbc);

	    // --- Etiqueta Contraseña ---
	    JLabel lblPass = new JLabel("Contraseña:");
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    contenido.add(lblPass, gbc);

	    // --- Campo de texto Contraseña ---
	    gbc.gridx = 1;
	    contenido.add(contraField, gbc);

	    // --- Botón Ingresar ---
	    JButton btnIngresar = new JButton("Ingresar");
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    gbc.gridwidth = 2;
	    contenido.add(btnIngresar, gbc);

	    // --- Agregar panel central a panel principal ---
	    panel.add(contenido, BorderLayout.CENTER);

	    // --- Config de ventana ---
	    ventanaPrincipal.setSize(800, 600);
	    ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ventanaPrincipal.setLocationRelativeTo(null);
	    ventanaPrincipal.add(panel);
	    ventanaPrincipal.setVisible(true);

	    // Acción del botón
	    btnIngresar.addActionListener(e -> {
	        String user = login.getText();
	        String pass = new String(contraField.getPassword());

	        JOptionPane.showMessageDialog(ventanaPrincipal,
	                "Usuario: " + user + "\nContraseña: " + pass);
	    });
	}
	public void menuAdministrador(JTabbedPane tabs) {
		
		
	}
	
	public void menuUsuario(JTabbedPane tabs) {
		JFrame ventanaUsuarioFrame = new JFrame("Usuario")
				
;		
	}


	
	

	
}
