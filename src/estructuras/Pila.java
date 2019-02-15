package estructuras;


public class Pila 
{
    private final int MAX_ELEMENTOS = 5;
    private int[] elementos;
    private int tope;

    public Pila() 
    {
        this.elementos = new int[MAX_ELEMENTOS];
        this.tope = -1;
    }

    public boolean vacia(){
        return (tope == -1);
    }

    public boolean llena(){
        return (tope == MAX_ELEMENTOS - 1);
    }
    
    public int longitud() {
        return tope + 1;
    }
    
    public int cima(){
        return elementos[tope];
    }    

    public void apilar(int elemento) 
    {
        if (llena()) 
        {
            System.out.println("pila llena");
        } 
        else 
        {
            tope++;
            elementos[tope] = elemento;
        }
    }

    public int desapilar() 
    {
        int a = Integer.MIN_VALUE;
        if (vacia()) 
        {
            System.out.println("pila vacia");
        } 
        else 
        {
            a = elementos[tope];
            tope--;
        }
      return a;
    }

    public void vaciar(Pila B) 
    {
        while (!B.vacia()) 
        {
            this.apilar(B.desapilar());
        }
    }

    public void mostrar() 
    {
        Pila X = new Pila();
        while (!vacia()) 
        {
            int elemento = desapilar();
            System.out.println(" " + elemento);
            X.apilar(elemento);
        }
        this.vaciar(X);
    }
    
    
    public static void main(String[] arg)
    {
        Pila pila = new Pila();
        
        System.out.println(pila.vacia());
        
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(4);
        
        pila.mostrar();
        pila.desapilar();
                
        pila.apilar(5);
       
        pila.mostrar();
        pila.vaciar(pila);
        
        pila.mostrar();
    }
    
}
