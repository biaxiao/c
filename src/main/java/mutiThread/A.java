package mutiThread;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class A {
    public static void main(String[] args) {
        Runnable r= ()->{
            System.out.println("ss");
        };
        ReentrantReadWriteLock lock =new ReentrantReadWriteLock();
        //lock.writeLock().newCondition();
        lock.readLock().newCondition();
    }
}
