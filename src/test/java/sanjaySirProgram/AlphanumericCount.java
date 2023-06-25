package sanjaySirProgram;

public class AlphanumericCount {

	public static void main(String[] args) 
	{

		String input="aaabbcdddf";//output: a3b2cg3f
		for(int i=0;i<input.length();i++)
		{
			int count=1;
			for(int j=i+1;j<input.length();j++)
			{
				if(input.charAt(i)==input.charAt(j))
				{
					count++;
					i++;
				}
				else
				{
					break;
				}
			}
			if(count>1)
				System.out.print(input.charAt(i)+""+count);
			else if(count==1)
				System.out.print(input.charAt(i));
		}
		
	}

}
