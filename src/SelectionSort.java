public class SelectionSort {
    void sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 2, 4, 3};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
    }
}
