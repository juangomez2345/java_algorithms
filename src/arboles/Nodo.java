package arboles;


public class Nodo 
{
	public int elemento;
	public Nodo nodoIzq, nodoDer;
		
	public Nodo(int nuevoElemento)
	{
		this.elemento = nuevoElemento;
		this.nodoIzq = null;
		this.nodoDer = null;
	}
	
	public void insertar(int nuevoElemento) 
	{
		if (nuevoElemento < elemento) 
		{
			if (nodoIzq == null)
			{
				nodoIzq = new Nodo(nuevoElemento);
			}
			else
			{
				nodoIzq.insertar(nuevoElemento);
			}
		}
		else 
		{
			if (nuevoElemento > elemento) 
			{
				if (nodoDer == null)
				{
					nodoDer = new Nodo(nuevoElemento);
				}
				else
				{
					nodoDer.insertar(nuevoElemento);
				}
			}
		}
	}
	
}
