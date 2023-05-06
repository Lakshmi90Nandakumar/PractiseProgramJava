package javaPractise;

public class bubbleSort {

	public static void main(String[] args) {

		int arr[]= {3,4,7,1,2,-9};
		System.out.println("Sorted Array is:  ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
			
		}
	}

}
