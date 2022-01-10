package helloworld;

public class Loop {

	public static void main(String[] args)
	{
		int i=1;
		int j=1;
		while(i<=5)
		{
			System.out.println("*");
			i=i+1;
		}
		for (i=1;i<=5;i++)
		{

			for (j=1;j<=i;j++)
			{
				System.out.println(j	);
			}
			System.out.println("hello");
		}

	}
}
