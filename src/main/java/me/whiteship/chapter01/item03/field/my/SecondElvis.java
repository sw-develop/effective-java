package me.whiteship.chapter01.item03.field.my;

/*
리플렉션 예외 상황 방지 코드 추가
 */
public class SecondElvis implements IMyElvis {

    public static final SecondElvis INSTANCE = new SecondElvis();

    private static boolean created;

    private SecondElvis() {
        if (created) {
            throw new UnsupportedOperationException("생성자로 객체 생성 불가");
        }
        created = true;
    }

    @Override
    public void leaveTheBuilding() {
        System.out.println("my elvis leave the building");
    }

    @Override
    public void sing() {
        System.out.println("my elvis is singing");
    }
}
