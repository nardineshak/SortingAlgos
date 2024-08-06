public class HeapSort {

    public void sort(int[] arr){

        int size = arr.length - 1;
        maxHeap(arr);

        for (int i = arr.length - 1; i >= 0; i--){
            swap(arr, 0, i);
            heapify(arr, size, 0);
            size--;
        }
    }

    public void maxHeap(int[] arr){
        for (int i = arr.length / 2 - 1; i >= 0; i--){
            heapify(arr, arr.length - 1, i);
        }
        printArray(arr);
    }

    public  void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public void heapify(int[] arr, int size, int i){
        int index = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < size && arr[leftChild] > arr[index]){
            index = leftChild;
        }
        if (rightChild < size && arr[rightChild] > arr[index]){
            index = rightChild;
        }

        if (index != i){
            swap(arr, i, index);
            heapify(arr, size, index);
        }
    }


    public void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}


// first build max heap
// swap max with the item at the end of the array and remove it from the tree 
// call heapify to make tree max heap again 