package sanjaySirProgram;

public class PrintPrime1TO20 {

	public static void main(String[] args) 
	{

		int n=20;
		for(int i=2;i<=20;i++)
		{
			boolean res=isPrime(i);
			if(res)
				System.out.println(i);
		}
	}

	public static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
