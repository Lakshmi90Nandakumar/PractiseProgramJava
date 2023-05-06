package javaPractise;

import java.util.Scanner;

public class PrintTrdEleInSeries {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
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
		
	}

}
