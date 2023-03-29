package proyecto;

import java.util.Comparator;

public class listavinculada<T> {
    private nodo<T> primernodo;
    private Comparator<T> Comp;


    public listavinculada(nodo<T> primernodo, Comparator<T> c) {
        this.primernodo = primernodo;
        this.Comp = c;
    }
    

    public nodo<T> getPrimernodo() {
        return primernodo;
    }


    public void setPrimernodo(nodo<T> primernodo) {
        primernodo.setSiguiente(this.primernodo);
        this.primernodo = primernodo;
    }


    public Comparator<T> getC() {
        return Comp;
    }


    public void setC(Comparator<T> c) {
        this.Comp = c;
        this.ordenar();
    }


    public void insertarOrdenado(nodo<T> nod){
        int cont = 0;
        nodo<T> aux = this.primernodo;
        nodo<T> auxSig = this.primernodo.getSiguiente();
        boolean inserto = false;
        while((cont < this.getSize())&&(!inserto)){
            if(this.Comp.compare(nod.getValor(), primernodo.getValor()) > 1){
                nod.setSiguiente(primernodo);
                this.primernodo = nod;
                inserto = true;
            }
            if(this.Comp.compare(nod.getValor(), auxSig.getValor()) > 1){
                aux.setSiguiente(nod);
                nod.setSiguiente(auxSig);
                inserto = true;
            }
            aux = aux.getSiguiente();
            auxSig = auxSig.getSiguiente();
            cont++;
        }
    }

    public void eliminarNodoPos(int pos){
        if( pos < this.getSize()){
            if(pos == 0){
                this.primernodo= this.primernodo.getSiguiente();
            }
            else{
                int cont = 1;
                nodo<T> aux = this.primernodo;
                nodo<T> auxDelete = this.primernodo.getSiguiente();
                while(cont < pos){
                    aux = aux.getSiguiente();
                    auxDelete = auxDelete.getSiguiente();
                    cont++;
                }
                aux.setSiguiente(auxDelete.getSiguiente());
            }
        }
    }
    public int getSize(){
        int aux = 0;
        myiterador<T> it = new myiterador<>(primernodo);
        while(it.hasNext()){
            it.next();
            aux++;
        }
        return aux;
    }

    public void eliminarAllOcurrencias(T s){
        int cont = 0;
        nodo<T> aux = this.primernodo;
        nodo<T> auxSig = this.primernodo.getSiguiente();
        while (cont < this.getSize()) {
            if(this.Comp.compare(s, primernodo.getValor()) == 0){
                this.primernodo = primernodo.getSiguiente();
            }
            if(this.Comp.compare(s, auxSig.getValor()) == 0){
                aux.setSiguiente(auxSig.getSiguiente());
            }
            aux = aux.getSiguiente();
            auxSig = auxSig.getSiguiente();
            cont++;
        }
    }


    public int getPrimeraOcurrencia(T n){
        nodo<T> aux = this.primernodo;
        int cont= 0;
        while(cont < this.getSize()){
            if(aux.getValor().equals(n)){
                return cont;
            }
            cont ++;
        }
        return cont;

    }

    /* public T recorrer(){
        myiterador<T> it = new myiterador(this.primernodo);
        while(it.hasNext()){
            T i = it.next();
            return i;
        }
        return null;
    } */

    void ordenar(){
        nodo<T> aux = this.primernodo;
        this.primernodo = null;
        while (aux != null) {
            this.insertarOrdenado(aux);
            aux  = aux.getSiguiente(); 
        }
    }
}
