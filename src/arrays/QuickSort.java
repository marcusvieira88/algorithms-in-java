package arrays;

public class QuickSort {

    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        System.out.println("index=" + index + " left=" + left + " right=" + right + " pivot=" + pivot);
        quickSort(array, left, index - 1);
        System.out.println("Right");
        quickSort(array, index, right);
    }

    private static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

//    private static void quickSortTest(int[] array, int left, int right) {
//
//        if (left >= right){
//            return;
//        }
//
//        int pivot = array[(left+right)/2];
//        int index
//
//    }

}
