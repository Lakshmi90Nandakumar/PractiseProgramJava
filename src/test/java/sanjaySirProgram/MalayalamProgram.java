package sanjaySirProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MalayalamProgram {

	public static void main(String[] args) 
	{

		String s="Malayalam";//output:m2a4l2y1
		s=s.toLowerCase();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		for(Character c:hs)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(c==s.charAt(i))
				{
					count++;
				}
			}
			System.out.print(c+""+count);
		}
		
	}

}
