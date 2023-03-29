package proyecto.comparadores;

import java.util.Comparator;

import proyecto.alumno;

public class comparadorDNI implements Comparator<alumno> {

    @Override
    public int compare(alumno o1, alumno o2) {
        int aux = o1.getDni() - o2.getDni();
        if(aux > 0){
            return 1;
        }
        else if(aux<0){
            return -1;
        }
        else {
            return 0;
        }
    }

    
    
}
