public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener listener1 = System.out::println;
        Worker worker = new Worker(listener);
        Worker worker1 = new Worker(listener1);
        worker.start();
        worker1.start1();

    }
}