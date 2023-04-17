package me.whiteship.chapter01.item01.my;

import java.util.Optional;
import java.util.ServiceLoader;

public class NewHelloServiceFactory {

    public static void main(String[] args) {
        //예시1 - 구현체 명시 X
        //코드가 구현체에 의존적이지 않음
        //어떤 구현체가 올지 모르지만, 어차피 인터페이스에 명시된 규약대로만 코딩하면 됨
        ServiceLoader<NewHelloService> loader = ServiceLoader.load(NewHelloService.class); //NewHelloService 인터페이스의 모든 등록된 구현체를 가져옴
        Optional<NewHelloService> newHelloService = loader.findFirst();
        newHelloService.ifPresent(h -> System.out.println(h.hello()));

        //예시2 - 구현체 명시 O
        //코드가 구현체에 의존적임
        NewHelloService helloService = new NewHelloServiceImpl();
        System.out.println(helloService.hello());

        //궁금한 점
        //스프링에서도 ServiceLoader의 역할을 수행하는 별도의 클래스가 존재하는 것인가?
        //DI 프레임워크 (스프링 등)이 ServiceLoader 의 동작방식을 바탕으로 좀더 고도화된 프레임워크이다 라고 보면 될 듯!
    }
}
