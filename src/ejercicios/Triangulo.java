package ejercicios;


public class Triangulo 
{

/*
1
22
333
4444
55555
*/
	public static void print01()
	{
		for( int index=1; index <= 5; index++ )
		{
			for ( int jndex=1; jndex < index;  jndex++ )
			{
				System.out.print(index);
			}
			
			System.out.println(index);
		}
	}
	
/*
1
12
123
1234
12345
*/
	public static void print02()
	{
		for( int index=1; index <= 5; index++ )
		{
			for ( int jndex=1; jndex < index;  jndex++ )
			{
				System.out.print(jndex);
			}
			
			System.out.println(index);
		}
	}	
	
/*
o
oo
ooo
oooo
ooooo
*/	
	public static void print03()
	{
		for( int index=1; index <= 5; index++ )
		{
			for ( int jndex=1; jndex < index;  jndex++ )
			{
				System.out.print("o");
			}
			
			System.out.println("o");
		}
	}	

/*
o
oo
ooo
oooo
ooooo
ooooo
oooo
ooo
oo
o
*/	
	public static void print04()
	{
		for( int index=1; index <= 5; index++ )
		{
			for ( int jndex=1; jndex < index;  jndex++ )
			{
				System.out.print("o");
			}
			
			System.out.println("o");
		}
		
		for( int index=5; index >= 1; index-- )
		{
			for ( int jndex=1; jndex < index;  jndex++ )
			{
				System.out.print("o");
			}
			
			System.out.println("o");
		}		
	}
	
/*	
        1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5 
   6 6 6 6 6 6 
  7 7 7 7 7 7 7 
 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 

*/	
	public static void print05()
	{
		int MAX_NO = 9;
		
		for( int index=1; index <= MAX_NO; index++ )
		{
			for( int sndex=MAX_NO; sndex >= index; sndex-- )
			{
				System.out.print(" ");
			}
			
			for( int jndex=1; jndex <= index;  jndex++ )
			{
				System.out.print(" " + index); 
			}
			
			System.out.println(" ");
		}	
	}
	

	public static void main(String[] args) {
		print05();
	}
	
}
