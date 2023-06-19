package javaPractise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PrintCmnValIn3Array {

	public static void main(String[] args) 
	{

		int[] a= {5,3,35,4,23,54,54,9};
		int[] b= {1,4,4,7,43,54,54,55};
		int[] c= {4,45,54,22,56,54,34,5};
		
		//Insantiation of hashset 
		
		HashSet<Integer> hs=new HashSet<Integer>();
		HashSet<Integer> hs1=new HashSet<Integer>();
		HashSet<Integer> hs2=new HashSet<Integer>();
		
		//To add element in hashset
		
		for(int i=0;i<a.length;i++)
         {
			hs.add(a[i]);
			hs1.add(b[i]);
			hs2.add(c[i]);
	
         }
		
		//to sort an array
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		//Compare element in hashset
		
		for(int i:hs)
		{
			for(int j:hs1)
			{
				for(int k:hs2)
				{
					if(i==j && j==k)
					{
						System.out.println(i);
					}
				}
			}
			
		}
		
	}

}
