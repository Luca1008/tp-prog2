package proyecto;

import java.util.Iterator;

public class myiterador<T> implements Iterator<T>{

    private nodo<T> cursor;

    
    public myiterador(nodo<T> cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean hasNext() {
        return (this.cursor!=null);
    }

    @Override
    public T next() {
        T res = this.cursor.getValor();
        cursor = cursor.getSiguiente();
        return res;
    }
    
    public nodo<T> getCursor() {
        return cursor;
    }

    public void setCursor(nodo<T> cursor) {
        this.cursor = cursor;
    }
    
    
}
