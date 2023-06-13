package javaPractise;

import java.util.Scanner;

public class PrintNotRepChar {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		long l=sc.nextLong();
		String s=Long.toString(l);
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(ch[i]+" ");
			}
		}

	}

}
