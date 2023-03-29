package proyecto.comparadores;

import java.util.Comparator;

import proyecto.alumno;

public class comparadorNombre implements Comparator<alumno>{

    @Override
    public int compare(alumno o1, alumno o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
    
}
