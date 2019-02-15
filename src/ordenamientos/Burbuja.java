package ordenamientos;


public class Burbuja {
/*
corrida 1               corrida 2           corrida 3           corrida 4           corrida 5
30 25 20 15 10 5	20 25 15 10 5 30	15 20 10 5 25 30	10 15 5 20 25 30	5 10 15 20 25 30 
25 30 20 15 10 5	20 15 25 10 5 30    15 10 20 5 25 30	10 5 15 20 25 30
25 20 30 15 10 5	20 15 10 25 5 30	15 10 5 20 25 30	
25 20 15 30 10 5	20 15 10 5 25 30	
25 20 15 10 30 5	
25 20 15 10 5 30	
*/	
	public void sort() 
	{
		int[] arreglo = { 30, 25, 20, 15, 10, 5 };
		int temp = 0;

		for (int i = arreglo.length; i >= 0; i--) 
		{
			for (int j = 0; j < arreglo.length - 1; j++)
				if (arreglo[j] > arreglo[j + 1]) 
				{
					temp = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = temp;
				}
		}
		for (int i = 0; i < arreglo.length; i++)
			System.out.print(arreglo[i] + " ");
	}


	public static void main(String[] arg) {
		new Burbuja().sort();
	}

}
