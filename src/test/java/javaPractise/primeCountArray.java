package javaPractise;

public class primeCountArray {

	public static void main(String[] args) {

		int[] a= {23,45,67,12,38,77,31,29};
		System.out.println("Prime nubers in an array are: ");
		for(int i=0;i<a.length;i++)
		{
			boolean rs=isPrime(a[i]);
			if(rs)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

	private static boolean isPrime(int n) {
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
