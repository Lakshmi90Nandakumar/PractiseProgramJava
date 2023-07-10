package sanjaySirProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapAddition {

	public static void main(String[] args) 
	{
        int[] a= {7,2,13,42,12};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			hm.put(i, a[i]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key");
		int b=sc.nextInt();
		System.out.println("enter another key");
		int c=sc.nextInt();
		System.out.println("Sum is: ");
		System.out.print(hm.get(b)+hm.get(c));
		for(Map.Entry<Integer, Integer> h:hm.entrySet())
		{
			System.out.println(h.getKey()+":"+h.getValue());
		}
	}

}
