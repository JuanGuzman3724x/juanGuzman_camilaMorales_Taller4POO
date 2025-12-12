package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class GuiAdmin extends JFrame {
    public static void main(String[] args) {
    	new GuiAdmin().setVisible(true);
    }
	
	public  GuiAdmin() {
		super("Administrador");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 2));
		JButton botonCoor = new JButton("coor");
		JButton botonEs = new JButton("coor");
		JButton botonSal = new JButton("coor");
		JPanel botonera = new JPanel(new GridLayout(1,1,5,5));
		JButton agregar =	new JButton("agregar");

		botonCoor.addActionListener(e ->{
			
		});
	}

}
