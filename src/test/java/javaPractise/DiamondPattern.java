package javaPractise;

public class DiamondPattern {

	public static void main(String[] args)
	{


		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i+j)==4||(i+j)==6||(i+j)==8)
				{
					if((i+j)==6)
					{
						if(i==5 || j==5)
						{
							System.out.print("  ");
						}
						else
							System.out.print(" *");						
					 }
					else
					{
						System.out.print(" *");
					}
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
