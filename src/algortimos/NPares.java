package algortimos;

public class NPares 
{
	public static void imprimeNPares(int limite)
	{
		int numero=1;
		while(numero <= limite)
		{
			if(numero%2==0)
			{
				System.out.println(numero);
			}
			numero++;
		}
	}
	
	public static void main(String[] args) {
		imprimeNPares(50);
	}
}
