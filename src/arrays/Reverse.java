package arrays;

public class Reverse {

    public static int[] reverse(int[] array) {

        int changes = array.length / 2;
        for (int i = 0; i < changes; i++) {
            int aux = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = aux;
        }
        return array;
    }
}
