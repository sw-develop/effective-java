package me.whiteship.chapter01.item03.field.my;

public class FirstElvis implements IMyElvis {

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
