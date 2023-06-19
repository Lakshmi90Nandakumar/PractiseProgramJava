package javaPractise;

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
            
     
			
			
		}*/
		
        String line = "Hi welcome hi32354 are 343434you 43411 I am OK?";
        String regex = "[^\\d]+";

        String[] str = line.split(regex);
        String required = "";
        for(String st: str){
            System.out.println(st);
        }

	}

}
