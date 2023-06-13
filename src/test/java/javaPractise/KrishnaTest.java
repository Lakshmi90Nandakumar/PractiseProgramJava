package javaPractise;

import org.testng.reporters.jq.Main;

public class KrishnaTest
{
	public static void main(String[] args)
	{
		int[] a= {2,5,6,2,0,2,1,7,8,10};
		int fmin=a[0],smin=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin && a[i]!=fmin)
			{
				smin=a[i];
			}
			
		}
		System.out.println("Second minimum is:"+smin);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("From bubble sort: "+a[1]);
    }

}
