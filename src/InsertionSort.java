/*
 * Input:[5,1,6,2,4,3]
 * output:[1,2,3,4,5,6]
 * */
public class InsertionSort {
	void sort(int a[]) {
		for (int i = 1; i < a.length; i++)
		{
			int current = a[i];
		    int j = i-1;
		    while (j >= 0 && current < a[j]) {
		    	a[j+1] = a[j];
		    	j--;
		    }
			a[j+1] =current;
		}
		for ( int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,1,6,2,4,3};
		
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(arr);
	}
}
