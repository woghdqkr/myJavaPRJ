import java.util.Scanner;

public class Ex09_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str, strRep, strSub, strAry[], strRep2;

        System.out.print("문자열을 입력하세요 :");
        str = s.nextLine();

        strRep = str.replace(" ", "$");
        strRep2 = str.replaceAll("\\s", "\\$");  //s는 스페이스
        strSub = str.substring(3,8);
        strAry = str.split(" ");

        System.out.println("입력문자열 ==>" + str);
        System.out.println("바뀐문자열 ==>" + strRep);
        System.out.println("바꾼문자열 ==>" + strRep2);
        System.out.println("일부문자열 ==>" + strSub);

        for(int i = 0; i <strAry.length; i++)
            System.out.println("분리한 문자열"+ i + "==>" + strAry[i]);
    }
}
