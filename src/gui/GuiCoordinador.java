package gui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GuiCoordinador extends JFrame{
	private JTextField nombre = new JTextField(15);
	private JTextField contraseña = new JTextField(15);
	private JTextField info = new JTextField(15);	
	private JTextField modificadorNombre = new JTextField(15);
	private JTextField modificadorcontraseña = new JTextField(15);
	private JTextField modificadorInfo = new JTextField(15);
	private JTextField eliminar = new JTextField(15);
	private DefaultTableModel model = new DefaultTableModel(
	            new Object[]{"Nombre", "Password", "Rol", "Info"}, 0);

	private JTable tabla = new JTable(model);
	
	public  GuiCoordinador() {
		super("Menú Administrador");
		setSize(600,400);
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane t = new JTabbedPane();
        t.add("agregar",panelAgregar());
        t.add("Modificar",panelMod());
        t.add("Eliminar",panelEliminar());
        add(t);
	}

	private JPanel panelEliminar() {
		 JPanel p = new JPanel(new GridLayout(4, 2, 5, 5));
	        p.add(new JLabel("Nombre:"));
	        p.add(eliminar);
	     
	        JButton botonA =new JButton("Eliminar Coordinador");
	        botonA.addActionListener(e -> eliminarC());
	        p.add(botonA);
	        return p;		
	}

	private Object eliminarC() {
		// TODO Auto-generated method stub
		return null;
	}

	private JPanel panelMod() {
		 JPanel p = new JPanel(new GridLayout(4, 2, 5, 5));
	        p.add(new JLabel("Nombre:"));
	        p.add(modificadorNombre);
	        p.add(new JLabel("Contraseña:"));
	        p.add(modificadorcontraseña);
	        p.add(new JLabel("Informacion:"));
	        p.add(modificadorInfo);
	        
	        JButton botonA =new JButton("Modificar Coordinador");
	        botonA.addActionListener(e -> modificar());
	        p.add(botonA);
	        return p;		
	}

	private Object modificar() {
		// TODO Auto-generated method stub
		return null;
	}

	private JPanel panelAgregar() {
        JPanel p = new JPanel(new GridLayout(4, 2, 5, 5));
        p.add(new JLabel("Nombre:"));
        p.add(nombre);
        p.add(new JLabel("Contraseña:"));
        p.add(contraseña);
        p.add(new JLabel("Informacion:"));
        p.add(info);
        
        JButton botonA =new JButton("Agregar Coordinador");
        botonA.addActionListener(e -> agregarCoor());
        p.add(botonA);
        return p;
	}

	private Object agregarCoor() {
		// TODO Auto-generated method stub
		return null;
	}
	 
}
