package proyecto;

import java.util.ArrayList;

public class grupo extends elementoUNI {

    private String nombre;
    private ArrayList<elementoUNI> element;

    

    public grupo(String nombre) {
        this.nombre = nombre;
        this.element  = new ArrayList<>();
    }

    



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addElement(elementoUNI e){
        this.element.add(e);
    }
    public ArrayList<elementoUNI> getElementoUNIs(){
        return new ArrayList<elementoUNI>(this.element);
    }
    






    @Override
    public int getCantidadAlumnos() {
        int aux = 0;
        for (int i = 0; i < element.size(); i++) {
            aux += element.get(i).getCantidadAlumnos();
        }
        return aux;
    }
    
}
