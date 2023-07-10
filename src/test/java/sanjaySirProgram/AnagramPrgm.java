package sanjaySirProgram;

public class AnagramPrgm {

	public static void main(String[] args)
	{

		String s1="acct",s2="cadt";int sum=0,sum1=0;
		for(int i=0;i<s1.length();i++)
		{
			 sum=sum+s1.charAt(i);
			 sum1=sum1+s2.charAt(i);
		}
		if(sum==sum1)
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");
		
		
	}

}
