package sanjaySirProgram;

import org.apache.poi.util.SystemOutLogger;

public class ReverseWrdInStr {

	public static void main(String[] args) 
	{

		String s="I love programming";//ouptu:I evol gninnargorp
		String[] st=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			String str=st[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
		
		//Another Way
		
		int i=0;String strng="";
		while(i<=s.length()-1)
		{
			
			if(s.charAt(i)!=' ')
			{
				if(i!=s.length()-1)
				{
					 strng=strng+s.charAt(i);
					  i++;					
				}
				else
				{
					strng=strng+s.charAt(i);
					for(int j=strng.length()-1;j>=0;j--)
					{
						System.out.print(strng.charAt(j));
					}
			        i++;
				}
			}
			else
			{
				for(int j=strng.length()-1;j>=0;j--)
				{
					System.out.print(strng.charAt(j));
				}
				strng="";
				System.out.print(" ");
				i++;
			}
			
		}
	}

}
