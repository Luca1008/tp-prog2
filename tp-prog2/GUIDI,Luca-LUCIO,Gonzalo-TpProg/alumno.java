package proyecto;

import java.util.ArrayList;

public class alumno  extends elementoUNI{
     private String nombre, apellido;
    private int dni,edad;
    private ArrayList<String> intereses;
    public alumno(String nombre, String apellido, int dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.intereses = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setAprellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void addInteres(String i){
        if (this.intereses.contains(i)) {
            this.intereses.add(i);
        }
    }
    public ArrayList<String> getIntereses(){
        return new ArrayList<String>(this.intereses);
    }
    @Override
    public int getCantidadAlumnos() {
        return 1;
    }
    

    
}
