package evenoddsort;

import java.util.Random;

public class evenoddsort {

    public static void oddEven(int[] array, int n) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;
            temp = 0;

            for (int i = 1; i <= n - 2; i = i + 2) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }

            for (int i = 0; i <= n - 2; i = i + 2) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }

        }

    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] rand1M = new int[100000];
        int[] rand100K = new int[100000];
        int[] rand1K = new int[1000];
        int[] rand100 = new int[100];

        for (int i = 0; i < rand1M.length; i++) {
            if (i < 100) {
                rand1M[i] = random.nextInt();
                rand100K[i] = random.nextInt();
                rand1K[i] = random.nextInt();
                rand100[i] = random.nextInt();
            } else if (i >= 100 && i < 1000) {
                rand1M[i] = random.nextInt();
                rand100K[i] = random.nextInt();
                rand1K[i] = random.nextInt();
            } else if (i >= 1000 && i < 100000) {
                rand1M[i] = random.nextInt();
                rand100K[i] = random.nextInt();
            } else {
                rand1M[i] = random.nextInt();
            }

        }
        long start = System.nanoTime();

        oddEven(rand1M, rand1M.length);
        long stop = System.nanoTime();

        System.out.println("1M Integer sorting took: " + (double) (stop - start) / 10 + " ms");
        
        
        start = System.nanoTime();
        oddEven(rand100K, rand100K.length);
        stop = System.nanoTime();
        System.out.println("100k Integer sorting took: " + (double) (stop - start) / 10 + " ms");
        
        start = System.nanoTime();
        oddEven(rand1K, rand1K.length);
        stop = System.nanoTime();
        System.out.println("1k Integer sorting took: " + (double) (stop - start) / 10 + " ms");

        
        start = System.nanoTime();
        oddEven(rand100, rand100.length);
        stop = System.nanoTime();
        System.out.println("100 Integer sorting took: " + (double) (stop - start) / 10 + " ms");


    }

}
