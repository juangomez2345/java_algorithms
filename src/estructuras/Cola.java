package estructuras;


public class Cola 
{

    private final int MAX_ELEMENTOS = 5;
    private int[] elementos;
    private int inicio;
    private int fin;

    public Cola() 
    {
        this.elementos = new int[MAX_ELEMENTOS + 1];
        this.inicio = 0;
        this.fin = 0;
    }

    public boolean vacia(){
        return (inicio == fin);
    }

    public boolean llena(){
        return (longitud() == MAX_ELEMENTOS - 1);
    }
    
    public int longitud() {
        return (fin - inicio + MAX_ELEMENTOS) % MAX_ELEMENTOS;
    }    

    public void encolar(int elemento) 
    {
        if (llena()) 
        {
            System.out.println("cola llena");
        } 
        else 
        {
            fin = (fin + 1) % MAX_ELEMENTOS;
            elementos[fin] = elemento;
        }
    }

    public int desencolar() 
    {
        int elemento = Integer.MIN_VALUE;
        if (vacia()) 
        {
            System.out.println("cola vacia");
        } 
        else 
        {
            inicio = (inicio + 1) % MAX_ELEMENTOS;
            elemento = elementos[inicio];
        }
        return elemento;
    }

    private void copiar(Cola B) 
    {
        while (!B.vacia()) 
        {
            encolar(B.desencolar());
        }
    }

    public void mostrar() 
    {
        if (vacia()) 
        {
            System.out.println("cola vacia");
        } 
        else 
        {
            Cola X = new Cola();
            while (!vacia()) 
            {
                int a = desencolar();
                System.out.print(" " + a);
                X.encolar(a);
            }
            this.copiar(X);
            System.out.println("");
        }
    }
    
    public static void main(String[] arg)
    {
        Cola cola = new Cola();
        
        System.out.println(cola.vacia());
        
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        
        cola.mostrar();
        cola.desencolar();
        
        cola.encolar(4); 
        cola.mostrar();
        cola.encolar(5); 
        cola.encolar(6); 
        
        
    }
}
