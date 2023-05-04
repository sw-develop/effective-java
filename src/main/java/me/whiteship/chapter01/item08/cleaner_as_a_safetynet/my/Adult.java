package me.whiteship.chapter01.item08.cleaner_as_a_safetynet.my;

/*
try-with-resources를 사용해 잘 짜인 클라이언트 코드 예시
 */
public class Adult {

    public static void main(String[] args) throws Exception {
        try (Room myRoom = new Room(7)) {
            System.out.println("안녕");
        }
    }
}
