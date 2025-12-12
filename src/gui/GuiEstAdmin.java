package gui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dominio.Estudiantes;
import logica.Controlador;

public class GuiEstAdmin extends JFrame{
	private JTextField rut = new JTextField(15);  
	private JTextField nombre = new JTextField(15);  
	private JTextField carrera = new JTextField(15);  
	private JTextField semestre = new JTextField(15);  
	private JTextField correo = new JTextField(15);  
	private JTextField contraseña = new JTextField(15);  
	private JTextField eliminar= new JTextField(15);
    private Controlador c = Controlador.getInstance();

	
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
	        botonA.addActionListener(e -> eliminar());
	        p.add(botonA);
	        return p;		
	}

	private void eliminar() {
        String r = eliminar.getText();

        boolean listo = c.eliminarEstudiante(r);

        if (listo) {
            JOptionPane.showMessageDialog(this, "Estudiante eliminado");
        } else {
            JOptionPane.showMessageDialog(this, "No existe ese estudiante");
        }
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

	private void modificar() {
        String r = mRut.getText();
        Estudiantes e = c.buscarEstudiante(r);

        if (e == null) {
            JOptionPane.showMessageDialog(this, "No se encontró el estudiante");
            return;
        }

        try {
            String n = mNombre.getText();
            String crr = mCarrera.getText();
            int sem = Integer.parseInt(mSemestre.getText());
            String cor = mCorreo.getText();
            String con = mContraseña.getText();

            boolean ok = c.modificarEstudiante(e, n, crr, sem, cor, con);

            if (ok) {
                JOptionPane.showMessageDialog(this, "Estudiante modificado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Datos inválidos");
        }
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
        JButton botonA =new JButton("Agregar Estudiante");
        botonA.addActionListener(e -> agregarEstudiante());
        p.add(botonA);
        return p;
	}

	 private void agregarEstudiante() {
        try {
            String r = rut.getText();
            String n = nombre.getText();
            String crr = carrera.getText();
            int sem = Integer.parseInt(semestre.getText());
            String cor = correo.getText();
            String con = contraseña.getText();

            if (r.isBlank() || n.isBlank()) {
                JOptionPane.showMessageDialog(this, "RUT y Nombre son obligatorios");
                return;
            }

            boolean list = c.agregarEstudiante(r, n, crr, sem, cor, con);
            if (list) {
                JOptionPane.showMessageDialog(this, "Estudiante agregado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "El estudiante ya existe");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error en los datos");
        }
	   
	}
	 
}
