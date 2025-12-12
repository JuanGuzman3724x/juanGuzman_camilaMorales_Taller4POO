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
		setLayout(new GridLayout(2,1));
		JButton botonCoor = new JButton("coordinador");
		JButton botonEs = new JButton("Estudiante");

		botonCoor.addActionListener(e ->{
			new GuiCoorAdmin().setVisible(true);
			
		});
		botonEs.addActionListener(e ->{
			new GuiEstAdmin().setVisible(true);

			
		});
		add(botonCoor);
		add(botonEs);

	}

}
