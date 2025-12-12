package gui;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GuiCoordinador extends JFrame {
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
            new Object[]{"ID", "Nombre", "Créditos", "Área"}, 0);

    
	private JTable tabla = new JTable(model);
	 public GuiCoordinador() {
	        super("Menú Coordinador");
	        
	 }}
