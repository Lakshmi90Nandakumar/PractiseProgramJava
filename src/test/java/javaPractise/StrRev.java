package javaPractise;

public class StrRev {

	public static void main(String[] args) {

		// using length
		String s="Reverse Me";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//rev=rev.
		
		System.out.println("with same Space as given string");
	    String rev1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				rev1=rev.substring(0,i)+" "+rev.substring(i,rev.length());
			}
		}
		System.out.println(rev1);
		
		//another way 
		System.out.println("Another way:");
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
