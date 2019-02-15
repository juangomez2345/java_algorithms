package algortimos;

public class NImpares 
{
	public static void imprimeNImpares(int limite)
	{
		int numero=1;
		while(numero <= limite)
		{
			if(numero%2!=0)
			{
				System.out.println(numero);
			}
			numero++;
		}
	}
	
	public static void main(String[] args) {
		imprimeNImpares(50);
	}
}
