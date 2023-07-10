package javaPractise;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDuplicate {

	public static void main(String[] args) 
	{

		 int[] n={2,3,4,6,8,4,8,9,6,9};
		    ArrayList<Integer> al=new ArrayList<Integer>();
		    for(int i=0;i<n.length;i++)
		    {
		        int count=1;
		        for(int j=i+1;j<n.length;j++)
		        {
		            if(n[i]==n[j])
		            {
		                count++;
		            }
		        }
		        if(count>1)
		        {
		            al.add(n[i]);
		        }
		    }
		    Collections.reverse(al);
		    for(int i=0;i<2;i++)
		    {
		        System.out.println(al.get(i));
		    }

	}

}
