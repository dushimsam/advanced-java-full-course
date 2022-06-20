public class Multithreading {

    public static void main(String[] args) throws Exception {

        for (int i = 1; i < 3; i++) {
            MultithreadingThing thing = new MultithreadingThing();
            thing.start();
        }
    }
}
