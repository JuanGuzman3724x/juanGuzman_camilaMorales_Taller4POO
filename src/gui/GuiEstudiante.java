package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class GuiEstudiante {
    private JTabbedPane tabs = new JTabbedPane();

    public void EstudianteGUIBase(){
    	JFrame ventanaEstudiante = new JFrame("Estudiante");
    	
    	JPanel main = new JPanel(new BorderLayout());

        main.setSize(1100, 700);
        ventanaEstudiante.setLocationRelativeTo(null);
        ventanaEstudiante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear pestañas
        tabs.addTab("Perfil", crearPerfilPanel());
        tabs.addTab("Malla Curricular", crearMallaPanel());
        tabs.addTab("Certificaciones", crearCertPanel());
        tabs.addTab("Dashboard", crearDashboardPanel());

        // Barra superior
        JPanel top = new JPanel(new BorderLayout());
        JLabel lbl = new JLabel("Portal Estudiante (GUI base)");
        lbl.setFont(new Font("Segoe UI", Font.BOLD, 16));
        top.add(lbl, BorderLayout.WEST);

        main.setBorder(new EmptyBorder(10, 10, 10, 10));
        main.add(top, BorderLayout.NORTH);
        main.add(tabs, BorderLayout.CENTER);

        add(main);
    }

    // --------------------------
    // PANEL DE PERFIL
    // --------------------------
    private JPanel crearPerfilPanel() {
        JPanel p = new JPanel(new BorderLayout(8, 8));
        p.setBorder(new EmptyBorder(8, 8, 8, 8));

        JTextArea info = new JTextArea();
        info.setEditable(false);
        info.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        info.setText(
                "Nombre: Estudiante Demo\n" +
                "RUT: 12345678-9\n" +
                "Carrera: Ingeniería en TI\n" +
                "Semestre: 5\n\n" +
                "Promedio general: --\n" +
                "Promedio por semestre: --\n"
        );

        p.add(new JScrollPane(info), BorderLayout.CENTER);
        return p;
    }

    // --------------------------
    // PANEL MALLA CURRICULAR (DEMO)
    // --------------------------
    private JPanel crearMallaPanel() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(8, 8, 8, 8));

        JLabel title = new JLabel("Malla Curricular (interactiva) - Base");
        title.setFont(new Font("Segoe UI", Font.BOLD, 14));
        p.add(title, BorderLayout.NORTH);

        JPanel grid = new JPanel(new GridLayout(4, 1, 8, 8)); // 4 semestres demo

        for (int sem = 1; sem <= 4; sem++) {
            JPanel semestrePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 8));
            semestrePanel.setBorder(BorderFactory.createTitledBorder("Semestre " + sem));

            for (int i = 1; i <= 4; i++) {
                String codigo = "C" + sem + "0" + i;
                JButton btn = new JButton("<html><center>" + codigo + "<br><small>Asignatura</small></center></html>");
                btn.setPreferredSize(new Dimension(180, 70));

                // Colores demo
                if ((i + sem) % 3 == 0) btn.setBackground(new Color(0xC8F7C5)); // Aprobada
                else if ((i + sem) % 3 == 1) btn.setBackground(new Color(0xFFF2B5)); // Cursando
                else btn.setBackground(new Color(0xFDCFCF)); // Reprobada

                btn.setOpaque(true);
                btn.setBorderPainted(false);

                semestrePanel.add(btn);
            }

            grid.add(semestrePanel);
        }

        p.add(new JScrollPane(grid), BorderLayout.CENTER);
        return p;
    }

    // --------------------------
    // PANEL CERTIFICACIONES
    // --------------------------
    private JPanel crearCertPanel() {
        JPanel p = new JPanel(new BorderLayout(8, 8));
        p.setBorder(new EmptyBorder(8, 8, 8, 8));

        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("CERT-001 - Sistemas Inteligentes");
        model.addElement("CERT-002 - Ciberseguridad");
        model.addElement("CERT-003 - Desarrollo de Software");

        JList<String> list = new JList<>(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JTextArea info = new JTextArea();
        info.setEditable(false);

        JPanel left = new JPanel(new BorderLayout());
        left.add(new JScrollPane(list), BorderLayout.CENTER);

        JButton btnVer = new JButton("Ver requisitos");
        JButton btnInscribir = new JButton("Inscribirse");

        JPanel leftButtons = new JPanel(new FlowLayout());
        leftButtons.add(btnVer);
        leftButtons.add(btnInscribir);

        left.add(leftButtons, BorderLayout.SOUTH);

        p.add(left, BorderLayout.WEST);
        p.add(new JScrollPane(info), BorderLayout.CENTER);

        // Acciones demo
        btnVer.addActionListener(e -> {
            if (list.getSelectedIndex() < 0) {
                JOptionPane.showMessageDialog(this, "Seleccione una certificación");
                return;
            }
            JOptionPane.showMessageDialog(this, "Mostrar requisitos (GUI base)");
        });

        btnInscribir.addActionListener(e -> {
            if (list.getSelectedIndex() < 0) {
                JOptionPane.showMessageDialog(this, "Seleccione una certificación");
                return;
            }
            JOptionPane.showMessageDialog(this, "Inscripción simulada");
        });

        return p;
    }

    // --------------------------
    // PANEL DASHBOARD
    // --------------------------
    private JPanel crearDashboardPanel() {
        JPanel p = new JPanel(new BorderLayout(8, 8));
        p.setBorder(new EmptyBorder(8, 8, 8, 8));

        JLabel t = new JLabel("Dashboard (Progreso) - Base");
        t.setFont(new Font("Segoe UI", Font.BOLD, 14));
        p.add(t, BorderLayout.NORTH);

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setText("Aquí se mostrará el progreso real cuando se conecte a Sistema.\n");
        p.add(new JScrollPane(area), BorderLayout.CENTER);

        JButton btnVisitor = new JButton("Ejecutar Visitor (demo)");
        btnVisitor.addActionListener(e -> JOptionPane.showMessageDialog(this, "Visitor aplicado (demo)"));

        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.LEFT));
        bottom.add(btnVisitor);

        p.add(bottom, BorderLayout.SOUTH);

        return p;
    }

    // --------------------------
    // MAIN de prueba
    // --------------------------
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EstudianteGUIBase().setVisible(true);
        });
    }
}

}
