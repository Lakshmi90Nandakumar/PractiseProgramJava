package javaPractise;

import java.util.*;

import org.apache.poi.util.SystemOutLogger;

public class WordCountSubStrng
{
	public static void main(String[] args) 
	{
	    String s="Aswini Kumar Samal Happiest Minds samal kumar";
	    String[] st=s.split(" ");
	    char[] ch=s.toCharArray();
	    List<String> l=new ArrayList<String>();
	    System.out.println(st.length);	      
	    int k=0,len=0;String str="";
	    for(int i=0;i<=s.length()-1;i++)
	    {
	    	if(ch[i]==' '|| i==s.length()-1)
	    	{
	    		if(i==s.length()-1)
	    		{
	    	      str=str+s.charAt(s.length()-1);
	    	      l.add(str);
	    	     }
	    		else
	    		{
	    			l.add(str);
	 	    	   str="";
	    		}
	    	}
	    	else
	    	{
	    		str=str+ch[i];
	    	}
	    		       
	    }
	    System.out.println(l.size());
	    for(int i=0;i<l.size();i++)
	    {
	    	int count=1;
	    	for(int j=i+1;j<l.size();j++)
	    	{
	    	if(l.get(i).equalsIgnoreCase(l.get(j)))
	    	{
	    		count++;
	    		l.set(j, "hi");
	    	}
	    	}
	    	if(count!=1 && l.get(i)!="hi")
	    	{
	    		System.out.println(l.get(i));
	    	}
	    }
	}

}
