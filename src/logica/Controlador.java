package logica;

import java.util.ArrayList;
import dominio.Coordinador;
import dominio.Cursos;
import dominio.Certificacion;
import dominio.AsignaturaCertificacion;
import dominio.Estudiantes;
import dominio.Notas;
import dominio.Usuario;

public class Controlador {
    private static Controlador instance;
    public static Controlador getInstance() {
        if (instance == null) instance = new Controlador();
        return instance;
    }

    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Estudiantes> estudiantes = new ArrayList<>();
    private static ArrayList<Cursos> cursos = new ArrayList<>();
    private static ArrayList<Certificacion> certificaciones = new ArrayList<>();
    private static ArrayList<AsignaturaCertificacion> asignaturasCert = new ArrayList<>();
    private static ArrayList<Notas> notas = new ArrayList<>();

    private Controlador() {}

    public static ArrayList<Usuario> getUsuarios() { return usuarios; }
    public ArrayList<Estudiantes> getEstudiantes() { return estudiantes; }
    public ArrayList<Cursos> getCursos() { return cursos; }
    public ArrayList<Certificacion> getCertificaciones() { return certificaciones; }
    public ArrayList<AsignaturaCertificacion> getAsignaturasCert() { return asignaturasCert; }
    public ArrayList<Notas> getNotas() { return notas; }

    public Usuario login(String nombre, String pass) {
        Usuario u = buscar(nombre);
        if (u != null && u.getPassword().equals(pass))
            return u;
        return null;
    }

    public Usuario buscar(String nombre) {
        for (Usuario u : usuarios)
            if (u.getNombre().equalsIgnoreCase(nombre))
                return u;
        return null;
    }

    public boolean agregarCoordinador(String nombre, String pass, String info) {
        if (buscar(nombre) != null) return false;
        usuarios.add(new Coordinador(nombre, pass, "Coordinador", info));
        return true;
    }

    public boolean modificarCoorContraseña(String nombre, String nuevaPass) {
        Usuario u = buscar(nombre);
        if (u == null) return false;
        u.setPassword(nuevaPass);
        return true;
    }

    public boolean modificarCoorInfo(String nombre, String infoNueva) {
        Usuario u = buscar(nombre);
        if (u instanceof Coordinador c) {
            c.setInfo(infoNueva);
            return true;
        }
        return false;
    }

    public boolean eliminar(String nombre) {
        Usuario u = buscar(nombre);
        if (u == null) return false;
        usuarios.remove(u);
        return true;
    }

    public Estudiantes buscarEstudiante(String rut) {
        for (Estudiantes e : estudiantes)
            if (e.getRut().equalsIgnoreCase(rut))
                return e;
        return null;
    }

    public boolean agregarEstudiante(String rut, String nombre, String carrera, int semestre, String email, String contra) {
        if (buscarEstudiante(rut) != null) return false;
        estudiantes.add(new Estudiantes(rut, nombre, carrera, semestre, email, contra));
        return true;
    }

    public boolean eliminarEstudiante(String rut) {
        Estudiantes e = buscarEstudiante(rut);
        if (e == null) return false;
        estudiantes.remove(e);
        return true;
    }

    public boolean modificarEstudiante(Estudiantes e, String nombre, String carrera, int semestre, String email, String contra) {
        if (e == null) return false;
        e.setNombre(nombre);
        e.setCarrera(carrera);
        e.setSemestre(semestre);
        e.setEmail(email);
        e.setContrasena(contra);
        return true;
    }

    public void agregarCurso(Cursos c) { cursos.add(c); }
    public void agregarCertificacion(Certificacion c) { certificaciones.add(c); }
    public void agregarAsignaturaCert(AsignaturaCertificacion ac) { asignaturasCert.add(ac); }
    public void agregarNota(Notas n) { notas.add(n); }
}