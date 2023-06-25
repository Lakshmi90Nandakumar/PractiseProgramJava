package sanjaySirProgram;

public class ReverseStrngAndOrder {

	public static void main(String[] args)
	{

		String s="My name is ok";//output:ko si eman yM
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
		//using split and reverse each string
		
		System.out.println();
		String[] st=s.split(" ");
		for(int i=st.length-1;i>=0;i--)
		{
			String str=st[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
