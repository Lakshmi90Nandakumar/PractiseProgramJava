package javaPractise;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramTwoWay {

	public static void main(String[] args) 
	{
		String s="acct",s1="cact";
		
		char[] c1=s.toCharArray();
		char[] c2=s1.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");
		
		System.out.println("========================");
		
		
		char[] ch=s.toCharArray();
		char[] ch1=s1.toCharArray();
		int sum=0,sum1=0;
		if(s.length()==s1.length())
		{
		for(int i=0;i<s.length();i++)
		{
			sum=sum+ch[i];
			sum1=sum1+ch1[i];
		}
		if(sum==sum1)
			System.out.println("second method---->Anagram");
		else
			System.out.println("second method--->Not anagram");
	}
		else
			System.out.println("Not anagram");
	}

}
