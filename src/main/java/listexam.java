import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listexam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //List 객체에 데이터 추가
        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        // List 저장된 데이터 수
        int listsize = list.size();

        System.out.println("저장된 데이터 수 : " + listsize);

        // 일반적인 반복문 (1세대) ==> 단점 : 반드시 반복의 횟수를 알고있어야 함

        System.out.println("1세대 반복문");

        for(int i = 0; i < listsize; i++){
            System.out.println("이름 : " + list.get(i));
        }

        //반복문 2세대 ==> 장점 : 1세대 반복문의 단점인 횟수를 알고있어야 하는 반복문의 문제점을 개선함
        System.out.println("2세대 반복문");

        for(String name : list){
            System.out.println("이름 : " + name);
        }

        // 반복문 3세대 ==> 장점 : 2세대보다 코딩해야할 줄 감소 , 람다식 적용
        System.out.println("3세대 반복문");
        list.forEach(name -> System.out.println("name : " + name));

        // 반복문 4세대 ==> (장점 : 3세대에 비동기식 처리 방법) (단점 : 처리 완료가 누가 먼저 될지 알수 없음, 따라서 모든 경우에 다 쓸 수 없음)

        System.out.println("4세대 반복문");
        list.parallelStream().forEach(name -> System.out.println("name : " + name));

        //while반복문 ==> for문 1세대 보다 처리 속도 빠름 단점 : 코드가 길어짐

        System.out.println("1.5세대 반복문");

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}
