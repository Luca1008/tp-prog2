package proyecto.comparadores;

import java.util.Comparator;

import proyecto.alumno;

public class comparadorApellido implements Comparator<alumno>{

    @Override
    public int compare(alumno o1, alumno o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
    
} 
