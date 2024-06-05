public class MergeSort
{
    void merger(int arr[], int start, int mid, int end)
    {
        int merged[] = new int[end - start + 1];
        
        int idx1 = start; // tracking start array
        int idx2 = mid + 1; // tracking mid+1 array
        int x = 0; // tracking merged index
        
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1 <= mid) { // corrected from idx2 to idx1
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }
        while (idx2 <= end) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }
        
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    void mergesort(int a[], int start, int end)
    {
        if (start >= end) {
            return;
        }
        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(a, start, mid);
            mergesort(a, mid + 1, end);
            merger(a, start, mid, end);
        }
    }

    void print_Array(int a[])
    {
        System.out.println("Array has:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " , ");
        }
    }

    public static void main(String args[])
    {
        int a[] = {12, 44, 22, 66, 77, 10, 89, 19};
        MergeSort obj = new MergeSort();
        obj.mergesort(a, 0, a.length - 1);
        obj.print_Array(a);
    }
}
