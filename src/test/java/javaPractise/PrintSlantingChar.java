package javaPractise;

import java.util.Scanner;

public class PrintSlantingChar {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		long l=sc.nextLong();
		String s=Long.toString(l);
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(i==j)
				{
					System.out.print(ch[i]);
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
