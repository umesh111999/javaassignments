package one;

public class Assignment17 {

	public static void main(String[] args) {
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	    for (int i=0;i<arr.length-1;i++)
	    {
		for (int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>arr[j+1])
			{ 
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
			
			 
			}
			System.out.println(arr[i]);
}
}

	}

}
