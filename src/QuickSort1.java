
public class QuickSort1 {
	 int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		
		for (int j = low; j < arr.length; j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}
	
	void sort(int[] arr, int low, int high){
		if(low<high) {
			int pivot = partition(arr, low, high);
			sort(arr, low, pivot-1);
			sort(arr, pivot+1, high);
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,3,6,7,4,9,2,9,8,8};
		
		QuickSort1 quickSort1 = new QuickSort1();
		quickSort1.sort(arr, 0, arr.length-1);
	}
}
