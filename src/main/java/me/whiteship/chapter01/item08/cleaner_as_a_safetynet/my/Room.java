package me.whiteship.chapter01.item08.cleaner_as_a_safetynet.my;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {
    private static final Cleaner cleaner = Cleaner.create();

    private final State state;

    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles) {
        this.state = new State(numJunkPiles);
        this.cleanable = cleaner.register(this, state); //클리너를 적용할 객체와 어떤 메서드를 호출할지 등록
    }

    @Override
    public void close() throws Exception {
        this.cleanable.clean();
    }
}
