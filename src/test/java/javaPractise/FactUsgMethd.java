package javaPractise;

import java.util.Scanner;

public class FactUsgMethd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		int res=fact(n);
		System.out.println(res);

	}
   public static int fact(int n)
   {
	   int res=1;
	   while(n>0)
	   {
		   res=res*n;
		   n--;
	   }
	   return res;
   }
}
