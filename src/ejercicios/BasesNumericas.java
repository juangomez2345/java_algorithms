package ejercicios;

public class BasesNumericas 
{

	public static void decimalBinario(int numero) 
	{
		int temp = numero;
		String resultado = "";
		
		while (temp != 0) 
		{
			if (temp % 2 == 0) 
			{
				resultado = "0" + resultado;
			} 
			else 
			{
				resultado = "1" + resultado;
			}
			temp = temp / 2;
		}
		System.out.println(resultado);
	}

	
	public static void binarioDecimal(String numero) 
	{
		int longitud = numero.length();
		int resultado = 0;
		int potencia = longitud - 1;
		
		for (int i = 0; i < longitud; i++) 
		{
			if (numero.charAt(i) == '1') 
			{
				resultado += Math.pow(2, potencia);
			}
			potencia--;
		}
		System.out.println(resultado);
	}

	
	public static void decimalOctal(int OctalNumber) 
	{
		int counter = 0;
		int result = 0;
		
		while (OctalNumber != 0) 
		{
			int temp = (int) ((OctalNumber % 8) * Math.pow(10, counter));
			counter++;
			result += temp;
			OctalNumber /= 8;
		}
		System.out.println(result);
	}

	
	public static void octalDecimal(String oct) 
	{
		int i = 0;
		
		for (int j = 0; j < oct.length(); j++) 
		{
			char num = oct.charAt(j);
			num -= '0';
			if (num < 0 || num > 7) 
			{
				System.out.println("invalid number");
				break;
			}
			i *= 8;
			i += num;
		}
		System.out.println(i);
	}

	
	public static void decimalHexa(int d) 
	{
		String digits = "0123456789ABCDEF";
		String hex = "";
		
		while (d > 0) 
		{
			int digit = d % 16;
			hex = digits.charAt(digit) + hex;
			d = d / 16;
		}
		System.out.println(hex);
	}

	
	public static void hexaDecimal(String s) 
	{
		String digits = "0123456789ABCDEF";
		s = s.toUpperCase();
		int val = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			int d = digits.indexOf(c);
			val = 16 * val + d;
		}
		System.out.println(val);
	}

	public static void main(String[] args) {
		decimalBinario(12);
		binarioDecimal("1100");
		decimalOctal(12);
		octalDecimal("14");
		decimalHexa(15);
		hexaDecimal("F");
	}
}
