package assignment_2;

// Java program for QuickSort implementation
class QuickSort
{
	/* Pivot as last element */
	int partition(int arr[], int l, int h)
	{
		int pvt = arr[h];
		int i = (l-1); 
		for (int j=l; j<h; j++)
		{
			
			if (arr[j] <= pvt)
			{
				i++;

			
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

	
		int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;

		return i+1;
	}


	
	void sort(int arr[], int l, int h)
	{
		if (l < h)
		{
			
			int pi = partition(arr, l, h);
			sort(arr, l, pi-1);
			sort(arr, pi+1, h);
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[])
	{
		int arr[] = {11, 6, 9, 10, 2, 5};
		int n = arr.length;

		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n-1);

		System.out.println("Array resulted by quick sort is : ");
		printArray(arr);
	}
}

