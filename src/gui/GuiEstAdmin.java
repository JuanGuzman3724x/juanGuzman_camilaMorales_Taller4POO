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

public class GuiEstAdmin extends JFrame{
	private JTextField rut = new JTextField(15);  
	private JTextField nombre = new JTextField(15);  
	private JTextField carrera = new JTextField(15);  
	private JTextField semestre = new JTextField(15);  
	private JTextField correo = new JTextField(15);  
	private JTextField contraseña = new JTextField(15);  
	private JTextField eliminar= new JTextField(15);
	
	
	private JTextField mRut = new JTextField(15);  
	private JTextField mNombre = new JTextField(15);  
	private JTextField mCarrera = new JTextField(15);  
	private JTextField mSemestre = new JTextField(15);  
	private JTextField mCorreo = new JTextField(15);  
	private JTextField mContraseña = new JTextField(15);  
	private DefaultTableModel model = new DefaultTableModel(
            new Object[]{"RUT", "Nombre", "Carrera", "Semestre", "Email"}, 0
    );
	private JTable tabla = new JTable(model);
	
	public  GuiEstAdmin() {
		super("Menú Administrador de Estudiantes");
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
	        p.add(new JLabel("rut:"));
	        p.add(eliminar);
	     
	        JButton botonA =new JButton("Eliminar Estudiante");
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
		 	p.add(new JLabel("Rut:"));
	        p.add(mRut);
		 	p.add(new JLabel("Nombre:"));
	        p.add(mNombre);
	        p.add(new JLabel("Carrera:"));
	        p.add(mCarrera);
	        p.add(new JLabel("Semestre:"));
	        p.add(mSemestre);
	        p.add(new JLabel("correo:"));
	        p.add(mCorreo);
	        p.add(new JLabel("contraseña:"));
	        p.add(mContraseña);
	        
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
	 	p.add(new JLabel("Rut:"));
        p.add(rut);
	 	p.add(new JLabel("Nombre:"));
        p.add(nombre);
        p.add(new JLabel("Carrera:"));
        p.add(carrera);
        p.add(new JLabel("Semestre:"));
        p.add(semestre);
        p.add(new JLabel("correo:"));
        p.add(correo);
        p.add(new JLabel("contraseña:"));
        p.add(contraseña);
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
