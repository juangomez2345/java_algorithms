package estructuras;


class Nodo 
{
    Nodo nodoDer;
    int dato;
    public Nodo(int dato) 
    {
        this.dato = dato;
        this.nodoDer = null;
    }
}

public class Lista 
{
    private Nodo primero;
    private Nodo ultimo;
    private int tamano;
    
    public Lista() 
    {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }
    
    public boolean vacia() {
        return (this.primero == null);
    }
    
    public int longitud(Lista lista) {
        System.out.print("longitud: ");
        return (lista.tamano);
    }    
    
    public void agregar(int dato) 
    {
        if(vacia()) 
        {
            Nodo nuevo = new Nodo(dato);
            nuevo.nodoDer = nuevo;
            primero = nuevo;
            ultimo = nuevo;
        }
        else 
        {
            Nodo nuevo = new Nodo(dato);
            nuevo.nodoDer = null;
            ultimo.nodoDer = nuevo;
            ultimo = nuevo;
        }
        this.tamano++;
    } 
    
    public Nodo eliminarUltimo() {
        Nodo eliminar = null;
        if(vacia()) 
        {
            System.out.println("lista vacia");
            return null;
        }
        if(primero == ultimo) 
        {
            primero = null;
            ultimo = null;
        }
        else 
        {
            Nodo actual = primero;
            while(actual.nodoDer != ultimo) 
            {
                actual = actual.nodoDer;
            }
            eliminar = actual.nodoDer;
            actual.nodoDer = null;
            ultimo = actual;
        }
        this.tamano--;
      return eliminar;
    }
    
   public void mostrar() 
   {
        if(tamano != 0) 
        {
            Nodo temp = primero;
            String str = "";
            
            for(int i = 0; i < this.tamano; i++) 
            {
                str = str + temp.dato + "\n";
                temp = temp.nodoDer;
            }
            System.out.println(str);
        }
    }
   
   public static void main(String[] arg)
   {
       Lista lista = new Lista();
       
       System.out.println(lista.vacia());
       
       lista.agregar(0);
       lista.agregar(1);
       lista.agregar(2);
       lista.agregar(3);
       
       System.out.println(lista.longitud(lista));
       lista.mostrar();
              
       
       lista.eliminarUltimo();
       
       lista.agregar(4);
       lista.agregar(5);
       
       System.out.println(lista.longitud(lista));
       lista.mostrar();      
   }
    
}
