package sanjaySirProgram;

public class FstMax3EleWthoutBBsrt {

	public static void main(String[] args)
	{

		int[] a= {7,2,4,1,7,6,7,2,4};
		int fmax=a[0],smax=a[1],tmax=a[3];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				tmax=smax;
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax && a[i]!=fmax)
			{
				tmax=smax;
				smax=a[i];
			}
			else if(a[i]>tmax &&a[i]!=smax &&a[i]!=fmax)
			{
				tmax=a[i];
			}
		}
		System.out.println(fmax+","+smax+","+tmax);
	}

}
