package sanjaySirProgram;

import java.util.HashMap;
import java.util.Map.Entry;

public class CombinatonOf11 {

	public static void main(String[] args)
	{

		int[] a= {1,3,4,2,6,7,3,8,5,6};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==11)
				{
					if(!hm.containsKey(a[i]))
					{
						if(!hm.containsValue(a[i]))
						{
							hm.put(a[i],a[j]);
						}
					}
				}
			}
		}

		System.out.println(hm);
		for(Entry<Integer,Integer> h:hm.entrySet())
		{
			System.out.println(h.getKey()+","+h.getValue());
		}
	}

}
