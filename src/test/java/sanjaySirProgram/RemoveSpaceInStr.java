package sanjaySirProgram;

public class RemoveSpaceInStr {

	public static void main(String[] args)
	{

		//using for loop method
		
		String s="My name is abc";//output:Mynameisabc
		String res="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				res=res+s.charAt(i);
		}
		System.out.println(res);
		
		//Using split method
		
		String[] st=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]);
		}
		
	}

}
