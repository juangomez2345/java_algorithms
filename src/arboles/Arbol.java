package arboles;


public class Arbol 
{
	public Nodo padre;
	public Nodo raiz;
	
	public Arbol()
	{
		raiz = null;
	}
	
	public void inserta(int nuevoElemento) 
	{
		if (raiz == null)
		{
			raiz = new Nodo(nuevoElemento);
		}
		else
		{
			raiz.insertar(nuevoElemento);
		}
	}	
	
	
	public void preOrden(Nodo nodo) 
	{
		if (nodo == null)
		{
			return;
		}
		else 
		{
			System.out.print(nodo.elemento + " ");
			preOrden(nodo.nodoIzq);
			preOrden(nodo.nodoDer);
		}
	}
	
	public void postOrden(Nodo nodo) 
	{
		if (nodo == null)
		{
			return;
		}
		else 
		{
			postOrden(nodo.nodoIzq);
			postOrden(nodo.nodoDer);
			System.out.print(nodo.elemento + " ");
		}
	}
	
	public void entreOrden(Nodo nodo) 
	{
		if (nodo == null)
		{
			return;
		}
		else 
		{
			entreOrden(nodo.nodoIzq);
			System.out.print(nodo.elemento + " ");
			entreOrden(nodo.nodoDer);
		}
	}
	
	public int altura(Nodo nodo) 
	{
		if (nodo == null)
		{
			return -1;
		}
		else
		{
			return (1 + Math.max(altura(nodo.nodoIzq), altura(nodo.nodoDer)));
		}
	}
	
	public int nodos(Nodo nodo) 
	{
		if (nodo == null)
		{			
			return 0;
		}
		else
		{
			return (1 + nodos(nodo.nodoIzq) + nodos(nodo.nodoDer));
		}
	}
	
	
	public void buscar(int elemento, Nodo nodo) 
	{
		if (nodo == null | nodo.elemento == elemento) 
		{
			System.out.print(nodo.elemento + " ");
			return;
		} 
		else 
		{
			if (elemento > nodo.elemento)
			{
				buscar(elemento, nodo.nodoDer);
			}
			else
			{
				buscar(elemento, nodo.nodoIzq);
			}
		}
	}	
	
	
	public static void main(String[] args) 
	{
		try
		{
			int valores[]={14, 15, 4, 9, 7, 18, 3, 5, 16, 4, 20, 17, 9, 14, 5};
			
			Arbol arbol = new Arbol();
			for(int index=0; index<valores.length; index++)
			{
				arbol.inserta(valores[index]);
			}
			
			System.out.println("Nodos: "+ arbol.nodos(arbol.raiz));
			System.out.println("Altura: " + arbol.altura(arbol.raiz));
			System.out.println(); System.out.print("Preorden: "); 	arbol.preOrden(arbol.raiz);
			System.out.println(); System.out.print("Entreorden: ");  arbol.entreOrden(arbol.raiz);
			System.out.println(); System.out.print("Postorden: ");  arbol.postOrden(arbol.raiz);
			System.out.println(); System.out.print("Busqueda (3): ");  arbol.buscar(3, arbol.raiz);  
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
