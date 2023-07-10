package javaPractise;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
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
		
		//another way to find occurance
		
		System.out.println("Another way");
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
			  if(ch[i]==ch[j])
			  {
				  c++;
				  ch[j]='*';
			  }
			}
			if(ch[i]!='*')
				System.out.println(ch[i]+" : "+c);
		}
		
		//Using Map Concept
		
		String s2="Madam";
		s2=s2.toLowerCase();
		char[] ch2=s2.toCharArray();
		HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
		for(int i=0;i<ch2.length;i++)
		{
			if(hs.containsKey(ch2[i]))
			{
				hs.put(ch2[i],hs.get(ch2[i])+1);
			}
			else
			{
				hs.put(ch2[i],1);
			}
		}
		for(Entry<Character, Integer> kvp:hs.entrySet())
		{
			System.out.println(kvp.getKey()+":"+kvp.getValue());
		}
		
	}

}
