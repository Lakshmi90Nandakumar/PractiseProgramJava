package sanjaySirProgram;

public class OccuranceOfWords {

	public static void main(String[] args)
	{

		String s="My name is rishav contains rishav and shav";//output:rishav 2
		String st[]=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			int count=1;
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].equalsIgnoreCase(st[j]))
				{
					count++;
					st[j]=" ";
				}
			}
			if(count>1 && st[i]!=" ")
				System.out.println(st[i]+":"+count);
		}
	}

}
