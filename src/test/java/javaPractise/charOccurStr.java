package javaPractise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class charOccurStr {

	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		for(Character c:set)
		{
            int count=0;
			for(int i=0;i<s.length();i++) 
			{
			   if(c==ch[i])
			     {
			       count++;	
			     }
			}
			System.out.println(c+" occured :"+count +"  times");
		}
	}

}
