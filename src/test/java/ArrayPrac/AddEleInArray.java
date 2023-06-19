package ArrayPrac;

public final class AddEleInArray {

	public static void main(String[] args)
	{

		int[] a= {1,2,4,6,8};
		int b=12,in=2;
		int[] c=new int[a.length+1];
		c[in]=b;
		for(int i=0;i<a.length;i++)
		{
		  if(i<in)
		  {
			  c[i]=a[i];
		  }
		  else
		  {
			  c[i+1]=a[i];
		  }
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
