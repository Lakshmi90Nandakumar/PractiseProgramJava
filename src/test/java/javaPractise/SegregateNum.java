package javaPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.inject.matcher.Matchers;
  
public class SegregateNum {

	public static void main(String[] args) 
	{

	//	String s="laks678hm890i543ch543";
		String s="*1ABC#$24abc#$%^43264";
		char[] ch=s.toCharArray();
		ArrayList<String> al=new ArrayList<String>();
		String str="";
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
			  str=str+ch[i];
			}
			else if(i==s.length()-1)
			{
				  if(str!="")
				    al.add(str);
			}
			else
			{
				if(str!="")
					  al.add(str);
					
					str="";
			
			}
		}
		System.out.println(al);
		int big=al.get(0).length();
		for(int i=0;i<al.size();i++)
		{
			int n=al.get(i).length();
			if(n>big)
			{
				big=n;
			}

		}
	   		for(int i=0;i<al.size();i++)
	   		{
				int n=al.get(i).length();
                if(n==big)
                {
                	System.out.println(al.get(i));
                }
	   			
	   		}
		
	/*	StringBuilder sb=new StringBuilder();
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		Pattern pattern=Pattern.compile("\\d+");
		 
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find())
		{
			sb.append(matcher.group()).append(",");
			if(hm.containsKey(matcher.group()))
			{
				hm.put(matcher.group(), hm.get(matcher.group())+1);
			}
		}
		System.out.println(sb.toString());*/
		
		
		
	}

}
