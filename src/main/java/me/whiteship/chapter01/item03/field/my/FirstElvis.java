package me.whiteship.chapter01.item03.field.my;

import java.io.Serializable;

public class FirstElvis implements IElvis, Serializable {

    public static final FirstElvis INSTANCE = new FirstElvis();

    private FirstElvis() {}

    @Override
    public void leaveTheBuilding() {
        System.out.println("my elvis leave the building");
    }

    @Override
    public void sing() {
        System.out.println("my elvis is singing");
    }
}
