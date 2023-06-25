package javaPractise;

public class GetLengthWthoutLen {

	public static void main(String[] args) 
	{
		String s="hilakshmi hi$$#$";
		//using try catch block without adding space
		int count=0;
		try
		{
			for(int i=0;;i++)
			{
				if(s.charAt(i)!=' ')
					count++;
			}
		}
		catch(Exception e)
		{
			System.out.println(count);
		}
		
		//including space counting the character

		int cnt=0;
		char[] ch=s.toCharArray();
		for(Character c:ch)
		{
			cnt++;
		}
		System.out.println(cnt);
		
		
		int j=0,cout=0;
		try
		{
		  while(ch[j]<128)
		   {
			 cout++;
			 j++;
		   }
		 }
		catch(Exception e) 
		{
		System.out.println(cout);
		}
	}

}
