package javaPractise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mysql.cj.util.StringUtils;

import freemarker.template.utility.StringUtil;

public class GetNumUsngDefaultMthd {

	public static void main(String[] args) 
	{

		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String[] st=s.split(" ");
		
		
		for(int i=0;i<st.length;i++)
		{
			String str=st[i];
            Pattern p=Pattern.compile("\\dt");
            Matcher match=Pattern.matches(str);
            
     
			
			
		}
		
		*String regex = "[^\\d]+";

        String[] str = line.split(regex);
        String required = "";
        for(String st: str){
            System.out.println(st);
        }
*/
		
        String line = "Hi wel2co3me hi32354 are 343434you 43411 I am OK?";
                
        HashSet<String> hs=new HashSet<String>();
        String[] st=line.split(" ");
        for(int i=0;i<st.length;i++)
        {
        	String s=st[i],n="";
        	for(int j=0;j<s.length();j++)
        	{
        		try
        		{
        		  if((Character.isDigit(s.charAt(j)) && Character.isDigit(s.charAt(j+1))))
        			   n=n+s.charAt(j);
        		   else
        		       break;
        		 }
        		catch(Exception e) {}
        	}
        	hs.add(n);
        }
        
        System.out.println(hs);

	}

}
