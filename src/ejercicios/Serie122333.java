package ejercicios;
/* 
 
 Diseñar un algoritmo que muestre la siguiente serie 1223334444...nnnnn.

*/
public class Serie122333 
{
	public static void imprimeSerie(int limite) 
	{
		String cad = "";
		int i, j;
		
		for (i = 1; i < limite + 1; i++) 
		{
			for (j = 1; j < i + 1; j++) 
			{
				cad = cad + i;
			}
			cad = cad + "\n";
		}
		System.out.println(cad);
	}

	public static void main(String[] args) {
		imprimeSerie(10);
	}
}
