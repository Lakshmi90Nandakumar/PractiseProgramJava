package sanjaySirProgram;

import java.util.Arrays;
import java.util.HashSet;

public class Frst3MinEleInArray {

	public static void main(String[] args)
	{

		int a[]= {3,4,5,1,67,21,2,3,5,1};
		int fmin=a[0],smin=a[1],tmin=a[2];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				tmin=smin;
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin && a[i]!=fmin)
			{
				tmin=smin;
				smin=a[i];
			}
			else if(a[i]<tmin && a[i]!=fmin && a[i]!=smin)
			{
				tmin=a[i];
			}
		}
		System.out.println(fmin+","+smin+","+tmin);
		
		//Using Collections
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
			hs.add(a[i]);
		 Object[] b = hs.toArray();
		Arrays.sort(b);
		System.out.println(b[0]+","+b[1]+","+b[2]);
	}

}
