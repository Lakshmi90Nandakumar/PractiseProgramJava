package javaPractise;

public class anagramPrgm
{
	public static boolean flag;

	public static void main(String[] args)
	{
		/*String s="acte",s1="ccat";

		if(s.length()==s1.length())
		{
		   for(int i=0;i<s.length();i++)
	     	{
			   flag=false;
			   for(int j=0;j<s1.length();j++)
                 {
                	 if(s.charAt(i)==s1.charAt(j))
                	 {
                		 flag=true;
                		 break;
                	 }
                 }
			   if(flag==true)
			   {
				   continue;
			   }
			   else
			   {
				   break;
			   }
			  
		    }
		   if(flag)
		   {
			   System.out.println("Anagram");
		   }
		   else
			   System.out.println("Not anagram");
		}
		else
			System.out.println("Not anagram");
	}*/
	
	String s1="Listen";
	String s2="Silent";
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	if(s1.length()==s2.length())
	{
		int sum1=0;
		int sum2=0;
		for(int i=0;i<s1.length();i++)
		{
			int asci1=s1.charAt(i);
			sum1=sum1+asci1;
	        int asci2=s2.charAt(i);
	        sum2=sum2+asci2;
		}
		System.out.println(sum1);
        if(sum1==sum2)
        	System.out.println("Two Strings are anagram");
        else
        	System.out.println("Not anagram");
	}
	else
		System.out.println("Not an anagram");
	}

}
