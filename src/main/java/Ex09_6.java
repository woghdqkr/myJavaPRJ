public class Ex09_6 {
    public static void main(String[] args) {
        String str = "    한글      ABCD      efgh";

        System.out.println("원문자열 ==> [" + str +"]");
        System.out.println("대문자로 ==> [" + str.toUpperCase() + "]");
        System.out.println("소문자로 ==> [" + str.toLowerCase() + "]");
        System.out.println("공백제거 ==> [" + str.trim() + "]");
    }
}
