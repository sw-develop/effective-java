package me.whiteship.chapter01.item03.field.my.serialization;

import me.whiteship.chapter01.item03.field.my.IElvis;

import java.io.Serializable;

public class ThirdElvis implements IElvis, Serializable {

    public static final ThirdElvis INSTANCE = new ThirdElvis();

    private static boolean created;

    private ThirdElvis() {
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

    private Object readResolve() { //역직렬화 시 기존 객체 반환 (새로운 객체 생성 방지)
        return INSTANCE;
    }
}
