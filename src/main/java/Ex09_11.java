import java.util.Scanner;

public class Ex09_11 {
    static int coffee_machine(int button) {
        System.out.printf("\n# 1.(자동으로)뜨거운 물을 준비한다\n");
        System.out.printf("#(자동으로) 종이컵을 준비한다\n");

        switch (button) {
            case 1:
                System.out.printf("#(자동으로)보통커피를 탄다\n");
                break;
            case 2:
                System.out.printf("#(자동으로)설탕커피를 탄다\n");
                break;
            case 3:
                System.out.printf("#(자동으로)블랙커피를 탄다\n");
                break;
            default:
                System.out.printf("#(자동으로)아무거나 탄다\n");
                break;
        }

        System.out.printf("#(자동으로)물을 붓는다\n");
        System.out.printf("#(자동으로)스푼으로 저어서 녹인다\n\n");

        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int coffee;
        int ret;

        System.out.println("어떤 커피 드릴까요?(1:보통, 2:설탕, 3:블랙) ");
        coffee = s.nextInt();

        ret = coffee_machine(coffee);

        System.out.printf("손님~ 커피 여기 있습니다.\n");
    }
}
