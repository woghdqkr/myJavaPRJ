public class Ex09_9_01 {
    public static void main(String[] args) {
        String log ="123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";

        String ip[] = log.split(" ");             // 공백자리
        System.out.println("ip는 : " + ip[0]);          //IP 출력
        ip = log.split(" ");

        String time;
        System.out.println("시간 : "+ ip[3]);     //시간 : [12/Apr/2018:17:03:50 +0900]

        time = ip[3].replace("[", "");
        System.out.println("시간 : "+ time);

    }
}
