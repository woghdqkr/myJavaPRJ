package org.example;

public class arrayExam {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i <arr.length; i++ ){
            System.out.print(arr[i] = (int)(Math.random() * 10));
        }
        System.out.println();

        for ( int i = 0; i < arr.length - 1; i++){
            boolean changed = false;  //자리바꿈이 발생 했는지 체크

            for (int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    changed = true;        // 자리바꿈이 발생해서 changed를 true로 된다.
                }
            }
            if (!changed) break;        // 자리 바꿈이 없으면 반복문에서 벗어남

            for (int k = 0; k < arr.length; k++)
                System.out.print(arr[k]); // 정렬된 결과를 출력
            System.out.println();
        }
    }
}
