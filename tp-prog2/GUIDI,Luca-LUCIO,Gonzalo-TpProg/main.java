package proyecto;

import java.util.Comparator;

import proyecto.comparadores.comparadorCantidad;
import proyecto.comparadores.comparadorNumero;
import proyecto.comparadores.comparadorString;
import proyecto.comparadores.comparadorinverso;
import proyecto.*;
import proyecto.nodo;
import proyecto.listavinculada;

public class main {
    public static <T> void main (String[] args){
        /* Se cree la lista de números mostrada en la figura del punto 2, con los valores
insertados en el siguiente orden: 10, 21, 1, 5, 11 */

        int s  = 11;
        int d = 5; 
        int a= 1;
        int w = 21;
        int F = 10;

        nodo<T> e = new nodo(s);
        nodo<T> ee = new nodo(d);
        nodo<T> eee = new nodo(a);
        nodo<T> eeee = new nodo(w);
        nodo<T> eeeee = new nodo(F);

        e.setSiguiente(ee);
        ee.setSiguiente(eee);
        eee.setSiguiente(eeee);
        eeee.setSiguiente(eeeee);

        comparadorNumero Asd = new comparadorNumero();
        
        listavinculada<T> listNum = new listavinculada(e, Asd);



        /* Se recorra la lista creada (utilizando un foreach) y se impriman los valores por
consola */

        myiterador<T> it = new myiterador<>(e);
        while(it.hasNext()){
                System.out.println(it.getCursor().getValor());
                T i = it.next();
        }


        /* Se elimine el primer elemento de la lista (por posición), luego el elemento “5” y luego
el elemento “11” (dado el elemento). Volver a recorrer e imprimir la lista resultante. */ 

        listNum.eliminarNodoPos(0);
        listNum.eliminarAllOcurrencias(d);
        listNum.eliminarAllOcurrencias(s);

        System.out.println(listNum.recorrer());


        /* Se cree la lista de strings mostrada en la figura 2 del punto 1, con los valores
insertados en el siguiente orden: “Fácil”, “Es”, “Parcial”, “Prog 2”. */
        String z = "facil";
        String x = "es";
        String m = "parcial";
        String v = "prog 2";
        nodo<T> qw = new nodo(v);
        nodo<T>  we= new nodo(m);
        nodo<T>  er= new nodo(x);
        nodo<T>  rt= new nodo(z);

        qw.setSiguiente(we);
        we.setSiguiente(er);
        er.setSiguiente(rt);

        comparadorString zxc = new comparadorString();

        listavinculada<T> listPala  = new listavinculada(rt, zxc);

        /* Se recorra la lista creada y se impriman los valores por consola */

        myiterador<T> it2 = new myiterador<>(rt);
        while(it2.hasNext()){
                System.out.println(it2.getCursor().getValor());
                T i = it2.next();
        }
        


        /* Imprimir por consola en qué posición se encuentra la palabra “Parcial”. */


        System.out.println(listPala.getPrimeraOcurrencia(m));



        /* Imprimir por consola en qué posición se encuentra la palabra “Recuperatorio” */

        System.out.println(listPala.getPrimeraOcurrencia("recuperatorio"));

        /* Se cambie el orden de la lista de strings para que los elementos queden ordenados
descendentemente. */

        comparadorinverso<T> qwe = new comparadorinverso(zxc);
        listPala.setC(qwe);


        /* Implementar las siguientes dos estructuras e insértelas en una lista vinculada
ordenadas por cantidad total de alumnos (de mayor a menor) */

        grupo unicen = new grupo("Unicen");
        grupo exactas = new grupo("exactas");
        grupo humanas = new grupo("Humanas");
        grupo historia = new grupo("Historia");

        alumno fede = new alumno("Federico", "Lopez",35999888,20 );
        fede.addInteres("redes");
        fede.addInteres("php");
        fede.addInteres("java");
        fede.addInteres("python");
        alumno juanita = new alumno("Juana", "Gasrcia",27123455,19 );
        juanita.addInteres("programacion");
        juanita.addInteres("php");
        juanita.addInteres("java");
        alumno john = new alumno("Doe", "Lopez",1200000,21 );
        john.addInteres("intercambio");
        alumno fio = new alumno("Fiora", "Riava",34555111,18 );
        fio.addInteres("historia");
        fio.addInteres("antigua");
        alumno tincho = new alumno("Martin", "Gomez",34111222,22 );
        tincho.addInteres("romanos");
        tincho.addInteres("egipcios");
        tincho.addInteres("griegos");
        alumno morita = new alumno("Mora", "Diaz",37124425,17 );
        morita.addInteres("psicologia");
        morita.addInteres("Freud");
        alumno romancio = new alumno("Roman", "Bazan",32555111,21 )
        romancio.addInteres("argentina");
        
        unicen.addElement(exactas);
        unicen.addElement(humanas);
        unicen.addElement(john);
        exactas.addElement(fede);
        exactas.addElement(juanita);
        humanas.addElement(historia);
        humanas.addElement(morita);
        historia.addElement(fio);
        historia.addElement(tincho);
        historia.addElement(romancio);



        grupo Olimpiada = new grupo("Olimpiadas matematicas");
        grupo matea = new grupo("Matea2");
        grupo fibo = new grupo("LosFibo");

        alumno juan = new alumno("Juan", "Juarez",33222444,19 );
        morita.addInteres("sucesiones");
        morita.addInteres("algebra");
        alumno juli = new alumno("Julio", "Cesar",33222111,17 );
        morita.addInteres("sucesiones");
        morita.addInteres("algebra");
        alumno berna = new alumno("Bernardio", "Rivas",30987654,21 );
        morita.addInteres("matematicas");
        alumno jose = new alumno("Jose", "Paso",33322112,22 );
        morita.addInteres("problemas");
        alumno isacc = new alumno("Isaac", "Newton",12343565,14 );
        morita.addInteres("sucesiones");

        Olimpiada.addElement(matea);
        Olimpiada.addElement(fibo);

        matea.addElement(juan);
        matea.addElement(juli);

        fibo.addElement(berna);
        fibo.addElement(jose);
        fibo.addElement(isacc);

        nodo<T> nod2 = new nodo(Olimpiada);
        nodo<T> nod1 = new nodo(unicen);

        nod1.setSiguiente(nod2);

        comparadorCantidad alum = new comparadorCantidad();

        listavinculada<T> universidad = new listavinculada(nod1, alum);

        universidad.ordenar();


    }
}
