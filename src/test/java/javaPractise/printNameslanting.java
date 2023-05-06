package javaPractise;

public class printNameslanting {

	public static void main(String[] args) {

		String name="lakshmi chitra";
		for(int i=0;i<name.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			System.out.print(name.charAt(i));
			System.out.println();
		}
	}

}
