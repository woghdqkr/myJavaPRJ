package org.example;

public class 과제2 {
    public static void main(String[] args) {

        int i =2, k=0;

        while (i < 10) {
            k++;
            System.out.printf("%dX%d=%d\n", i, k, i * k);

            if (k == 9) {
                i++;
                k = 0;
                System.out.printf("\n");
            }
        }
    }
}
