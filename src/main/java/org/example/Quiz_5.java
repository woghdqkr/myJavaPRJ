package org.example;

public class Quiz_5 {
    public static void main(String[] args) {
        int i, k;                        // 데이터변수인 정수 i,k을 선언
        System.out.printf("단\n");        // 단을 출력

        for (i = 2, k = 1; k < 10; k++) {   // i의 초기값 2이고 k의 초기값은 1이다 1~10까지 반복하고 k가 증가한다
            System.out.printf("%d x %d = %d\n", i, k, i * k); // i * k를 출력
            if(k==9){         //k가 9일때
                i++;          // i증가
                k = 0;        //k = 0이다.
                System.out.printf("\n");    // 한줄을 띈다
            }
            if(i==10){        //i가 10일때
                break;   // 반복문을 종료한다
            }

        }


    }
}

