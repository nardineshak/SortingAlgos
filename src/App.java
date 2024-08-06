public class App {
    public static void main(String[] args) throws Exception {
       SelectionSort selectionSort = new SelectionSort();
       HeapSort heapSort = new HeapSort();

       int[] arr = new int[]{8, 4, 39, 28, 1, 9, 2, 5, 99, 6};

       heapSort.sort(arr);
        printArray(arr);

    }


    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
