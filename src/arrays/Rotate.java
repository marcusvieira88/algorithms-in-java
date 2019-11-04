package arrays;

public class Rotate {

    public static int[] left(int n, int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[(i + (array.length - n)) % array.length] = array[i];
        }
        return result;
    }

    public static int[] right(int n, int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[(i + (array.length + n)) % array.length] = array[i];
        }
        return result;
    }
}
