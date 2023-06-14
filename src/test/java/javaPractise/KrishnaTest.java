package javaPractise;

import java.util.Arrays;

import org.testng.reporters.jq.Main;

public class KrishnaTest
{
	public static void main(String[] args)
	{
		int[] a= {2,5,6,2,0,2,1,7,8,10};
		int fmin=a[0],smin=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin && a[i]!=fmin)
			{
				smin=a[i];
			}
			
		}
		System.out.println("Second minimum is:"+smin);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("From bubble sort: "+a[1]);
		
		String s="Lakshmi chitra is good",rev="",rev1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				rev=s.charAt(i)+rev;
			}
		}
		System.out.println(rev);
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				rev=rev.substring(0,i)+" "+rev.substring(i,rev.length());
		}
		System.out.println(rev);
		
		//anagram
		
		String st="woood",st1="doowk";boolean flag=true;int count=0;
		char[] ch=st.toCharArray();Arrays.sort(ch);
		char[] ch1=st1.toCharArray();Arrays.sort(ch1);
		if(ch.length==ch1.length)
		{
			int j=0;
			for(int i=0;i<ch.length;i++)
			{
				   
				   if(ch[i]==ch1[j])
	            	   count++;
                 j++;
				                
			}
			if(count==ch.length)
				System.out.println("Anagram");
			else
				System.out.println("Not anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
		
    }

}
