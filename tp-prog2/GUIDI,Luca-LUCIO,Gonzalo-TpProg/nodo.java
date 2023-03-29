package proyecto;

public class nodo<T> {

    private T valor;
    private nodo<T> siguienteNodo;

    public nodo(T valor) {
        this.valor = valor;
    }
    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }


    public nodo<T> getSiguiente() {
        return this.siguienteNodo;
    }

    public void setSiguiente(nodo<T> n){
        this.siguienteNodo = n;
    }

    public String toString(){
        return " "+valor;
    }


   
}
