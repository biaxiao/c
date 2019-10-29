package mutiThread;

import java.util.concurrent.ArrayBlockingQueue;

public class App {

    public static void main(String[] args) {
        int capcacity=100;
        ArrayBlockingQueue queue = new ArrayBlockingQueue(capcacity);
        new Thread(()->{
            try {
                while (true){
                    queue.put(new Object());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();

        new Thread(()->{
            try {
                while (true){
                    Object o = queue.take();
                    System.out.println(o);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"B").start();

    }

}
