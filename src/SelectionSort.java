public class SelectionSort {
    
    public void sort(int[] arr){
        // go through array, keep finding min and swap with min
        // do till the whole array is sorted

        for (int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != -1){
                swap(arr, i, minIndex);
            }
        }
    }

    public void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}