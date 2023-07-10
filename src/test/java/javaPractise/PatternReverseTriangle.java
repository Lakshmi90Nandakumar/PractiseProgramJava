package javaPractise;

import java.util.Scanner;

public class PatternReverseTriangle {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			
			if(i%2!=0)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print("  ");
				}
			  for(int j=1;j<=i;j++)
			     {
				
					System.out.print(" * ");
				
			      }
			}
			System.out.println();
		}
		
	}

}
