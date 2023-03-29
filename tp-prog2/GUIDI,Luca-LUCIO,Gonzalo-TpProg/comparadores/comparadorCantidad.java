package proyecto.comparadores;

import java.util.Comparator;

import proyecto.elementoUNI;

public class comparadorCantidad implements Comparator<elementoUNI>{

    @Override
    public int compare(elementoUNI o1, elementoUNI o2) {
        int aux = o1.getCantidadAlumnos() - o2.getCantidadAlumnos();
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
