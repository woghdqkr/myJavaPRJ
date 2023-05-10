package org.example;

public class Ex10_1 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[2] = 100 / 0;
            aa[3] = 100;
          } catch (ArrayIndexOutOfBoundsException e){
              System.out.println("배열 첨자가 배열 크기보다 커요");
              System.out.println("오류 메시지 : " + e);
          } catch (ArithmeticException e){
              System.out.println("0으로 나눠서 에러가 발생해요");
              System.out.println("오류 메시지 : " + e);
          } catch (Exception e){
                    System.out.println("자바에서 발생되는 모든 에러를 다 잡을 수 있어요.");
                    System.out.println("오류 메시지 : " + e);
        }
        finally {
            System.out.println("정상동작하던지, 오류가 나던지 finally는 무조건 실행됩니다.");
        }
    }
}
