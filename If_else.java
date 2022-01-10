package helloworld;

public class If_else {	
	public static void main(String[] args)
	{
		int a=2;
		if(a%2==0)
		{
			System.out.println("even");
		}
		else if(a%2==0 & a>10)
		{
			System.out.println("even great");
			
		}
		else
		{
			System.out.println("odd");
		}
		int g=90;
		a = g>10?1:2;
		System.out.println(a);
		
	}
}
