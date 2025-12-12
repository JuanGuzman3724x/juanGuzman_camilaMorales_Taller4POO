package gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dominio.Usuario;
import logica.MenuAdmin;

public class Gui {
	ArrayList<Usuario> usuario =MenuAdmin.getU();
	
	
	public void iniciar() {
	    JFrame ventanaPrincipal = new JFrame("Ventana");
	    JTextField login = new JTextField(15);
	    JTextField contraField = new JTextField(15);

	    JPanel panel = new JPanel(new BorderLayout());
	    JPanel contenido = new JPanel();
	    contenido.setLayout(new GridBagLayout());

	    GridBagConstraints gbc = new GridBagConstraints();
	    gbc.insets = new Insets(10, 10, 10, 10);
	    gbc.fill = GridBagConstraints.HORIZONTAL;

	    JLabel lblUsuario = new JLabel("Usuario:");
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    contenido.add(lblUsuario, gbc);

	    gbc.gridx = 1;
	    contenido.add(login, gbc);

	    JLabel lblPass = new JLabel("Contraseña:");
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    contenido.add(lblPass, gbc);

	    gbc.gridx = 1;
	    contenido.add(contraField, gbc);

	    JButton btnIngresar = new JButton("Ingresar");
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    gbc.gridwidth = 2;
	    contenido.add(btnIngresar, gbc);

	    panel.add(contenido, BorderLayout.CENTER);

	    ventanaPrincipal.setSize(800, 600);
	    ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ventanaPrincipal.setLocationRelativeTo(null);
	    ventanaPrincipal.add(panel);
	    ventanaPrincipal.setVisible(true);

	    btnIngresar.addActionListener(e -> {
	    	verificar(login.getText(),contraField.getText());
	    	
	    
	       

	        
	    });
	    
	}
	public Usuario verificar(String user, String pass) {

        if (user == null || pass == null) return null;

        for (Usuario u : usuario) {
            if (u.getNombre().equals(user) && u.getPassword().equals(pass)) {
            	switch(u.getRol().toLowerCase()) {
            	case"admin":
            	break;
            	case "estudiante":
            		break;
            	case "coordinador":
            		break;
				default:
					break;
            	
            	}
                return u;
            }
        }
        return null;
    }
	}
