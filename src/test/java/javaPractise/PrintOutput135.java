package javaPractise;

import java.util.Scanner;

public class PrintOutput135 {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(n==1 || n==2)
		{
			System.out.print(1);
		}
		else
		{
		
		   for(int i=1;i<=n+2;i++)
		    {
				if(i%2!=0)
				System.out.print(i);
		     }
		}
		
	}

}
