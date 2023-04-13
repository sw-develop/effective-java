package me.whiteship.chapter01.item03.staticfactory.my.supplier;

public class Elvis implements Singer {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() { }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    @Override
    public void sing() {
        System.out.println("singing");
    }
}
