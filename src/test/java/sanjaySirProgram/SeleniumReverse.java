package sanjaySirProgram;

public class SeleniumReverse {

	public static void main(String[] args)
	{

		String s="I am selenium";//output: m ui neleseamI
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
				rev=rev+s.charAt(i);
		}
		for(int i=0;i<rev.length();i++)
		{
			if(s.charAt(i)==' ')
				rev=rev.substring(0,i)+" "+rev.substring(i,rev.length());
		}
		System.out.println(rev);
	}

}
