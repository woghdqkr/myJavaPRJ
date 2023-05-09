package org.example;

public class 과제_예시 {

    public static void main(String[] args) {
        int a,b;

        for(a=1, b=2; b<10; a++){
            if(a < 10){
                System.out.printf("%d X %d = %d\n",b,a,b*a);
            }
            else{
                System.out.printf("\n");
                a=0;
                b++;
            }
        }
    }
}
