package arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] array = {9, 2, 6, 8, 4, 3, 5, 1, 7, 10};

        System.out.println("=========== Array QuickSort ============");

        QuickSort.sort(array);
        for (int item : array) {
            System.out.println(item);
        }

        System.out.println("=========== Array MergeSort ============");
        MergeSort.sort(array);
        for (int item : array) {
            System.out.println(item);
        }

        System.out.println("=========== Array BubbleSort ============");
        BubbleSort.sort(array);
        for (int item : array) {
            System.out.println(item);
        }

        System.out.println("=========== Rotate Left ============");
        final int[] result = Rotate.left(3, array);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        System.out.println("=========== Rotate Right ============");
        final int[] result2 = Rotate.right(3, array);

        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }
    }
}
