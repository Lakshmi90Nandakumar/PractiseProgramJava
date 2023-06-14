package javaPractise;

import java.util.Scanner;

public class PrintTrdEleInSeries {

	public static void main(String[] args) {

	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		long input=sc.nextLong();
		String s=Long.toString(input);	
		System.out.println(s);
		char[] ch=s.toCharArray();
		for(int i=1;i<ch.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(ch[i]+" ");
			}
		}
		*/
		int[] a= {8,8,8,7,4,6,8,7,2,1,5,6,7,8};
		int fmax=a[0],smax=a[4],tmax=a[5];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				tmax=smax;
				smax=fmax;
				fmax=a[i];
			}
			else if((a[i]!=fmax) && (a[i]>smax))
			{
				tmax=smax;
				smax=a[i];
			}
			else if(a[i]!=smax && a[i]!=fmax && a[i]>tmax)
			{
				tmax=a[i];
			}
		}
		System.out.println(fmax+" "+smax+" "+tmax);
	}

}
