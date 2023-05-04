package me.whiteship.chapter01.item08.cleaner_as_a_safetynet.my;

class State implements Runnable {

    int numJunkPiles;

    State(int numJunkPiles) {
        this.numJunkPiles = numJunkPiles;
    }

    //close 메서드나 cleaner가 호출함
    @Override
    public void run() {
        System.out.println("방 청소");
        this.numJunkPiles = 0;
    }
}