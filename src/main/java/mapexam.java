import java.util.HashMap;
import java.util.Map;

public class mapexam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "박재홍");
        map.put("email", "hong8011e@naver.com");
        map.put("dept", "빅데이터과");

        System.out.println("조회 결과");

        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));

        map.entrySet().forEach(entry -> {
            System.out.println((entry.getKey() + " : " + entry.getValue()));
        });
    }
}
