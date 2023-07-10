package sanjaySirProgram;

import java.util.ArrayList;

public class FindUnmatchedString {

	public static void main(String[] args) 
	{

		String s="This is fun show";   //output: This is fun
		String s1="Fun Tv show";
		
		String[] st=s.split(" ");
		String[] st1=s.split(" ");
		int count=1;
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<st.length;i++)
		{
			for(int j=0;j<st1.length;j++)
			{
				count=1;
				if(st[i].equalsIgnoreCase(st1[j]))
				{
					count++;
				}
			}
			if(count==1)
				System.out.print(st[i]+" ");
		}
		
		ArrayList<String> al1=new ArrayList<String>();
		ArrayList<String> al2=new ArrayList<String>();
		for(int i=0;i<st.length;i++)
		{
			al1.add(st[i]);
			al2.add(st1[i]);
		}
		System.out.println(al1);
		System.out.println(al2);
			for(int i=0;i<al1.size();i++)
			{
				int cnt=1;
				for(int j=0;j<al2.size();j++)
				{
				  if(al1.get(i).equalsIgnoreCase(al2.get(j)))
				  {
					  cnt++;
					  break;
					 // System.out.println(al2.get(j));
				  }
				}
				if(cnt==1)
					System.out.println(al1.get(i));
				else
					System.out.println("  ");
			}
		
	}

}
