import java.util.Scanner;

public class ba2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        int x = s.nextInt();

        for(int i = 0; i <n; i++){
            arr[i] = s.nextInt();
        }
        for(int i =0; i < n; i++){
            if(arr[i] < x){
                System.out.print(arr[i]);
            }
        }
    }
}
