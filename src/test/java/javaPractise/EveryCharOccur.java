package javaPractise;

import java.util.Scanner;

public class EveryCharOccur {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		int ch[]=new int[128];
		for(int i=0;i<st.length();i++)
		{
			char c=st.charAt(i);
			ch[c]++;
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=0)
			{
				System.out.println((char)(i)+" ---> "+ch[i]);
			}
		}

	}

}
