package sanjaySirProgram;

public class CountCharacter {

	public static void main(String[] args)
	{

		String s="aweexxyyyyy";//output: a1w1e2x2y5
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='#';
				}
			}
			if(count>=1 && ch[i]!='#')
				System.out.print(ch[i]+""+count);
		}
		
	}

}
