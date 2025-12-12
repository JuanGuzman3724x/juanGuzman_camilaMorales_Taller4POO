package logica;

import dominio.Estudiantes;

public class PromedioGeneral implements IstrategyPromedio{

	@Override
	public double calcular(Estudiantes e) {
        int semestreActual = e.getSemestre();
		double suma = 0;
        int cont = 0;
        for (var n : e.getNotas()) {
            if (n.getSemestre() == ) {
                suma += n.getCalificacion();
                cont++;
            }
        }
        
        if (cont == 0) {
        	return 0;
        }
        return suma / cont;
}}
        

