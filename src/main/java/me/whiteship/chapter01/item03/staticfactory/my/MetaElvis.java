package me.whiteship.chapter01.item03.staticfactory.my;

public class MetaElvis<T> {

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    private MetaElvis() { }

    @SuppressWarnings("unchecked")
    public static <T> MetaElvis<T> getInstance() { //제네릭 싱글톤 팩토리 메서드
        return (MetaElvis<T>) INSTANCE;
    }

    public void say(T t) {
        System.out.println(t);
    }
}
