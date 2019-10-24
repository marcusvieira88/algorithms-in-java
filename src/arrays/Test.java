package arrays;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int n = 10;
        z: while (n-- > 0) {
            char [] a = "abcdeftg".toCharArray();
            char [] b = "nnbbvcghvghce".toCharArray();

            Arrays.sort(b);
            for(char c : a){
                if( Arrays.binarySearch(b , c) >= 0){

                    System.out.println("YES");
                    continue z;
                }
            }
            System.out.println("NO");

        }
    }

}
