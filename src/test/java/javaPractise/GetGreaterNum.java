package javaPractise;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetGreaterNum {

	public static void main(String[] args)
	{

		String s="*1ABC#$24abc";
		
		Pattern pattern=Pattern.compile("\\d+");
		Matcher matches=pattern.matcher(s);
		
		ArrayList<String> al=new ArrayList<String>();
		while(matches.find())
		{
			al.add(matches.group());
		}
		
		System.out.println(al.toString());
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<al.size();i++)
		{
			a.add((Integer.parseInt(al.get(i))));
		}
	    
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
		
		{
			if(a.get(i)>a.get(j))
			{
             int temp=a.get(i);
			}
		}
		}
	}

}
