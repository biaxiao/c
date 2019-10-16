package mutiThread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者 消费者
 */
public class App1 {
    final Lock lock = new ReentrantLock();
    final Condition notEmpty = lock.newCondition();
    final Condition notFull = lock.newCondition();
    final Object[] item= new Object[100];
    //private Queue queue = new LinkedList();

    private int count,putIndex,takeIndex;

    public void put(Object o) throws InterruptedException {
        lock.lock();
        try {

            while(count==item.length){
                notFull.await();
            }
            item[putIndex]=o;
            putIndex++;
            if(putIndex==item.length) putIndex=0;
            count++;
            notEmpty.signal();
        }finally {
            lock.unlock();
        }

    }

    public Object take() throws InterruptedException {
        lock.lock();
        try {
            while(count==0){
                notEmpty.await();
            }
            Object o = item[takeIndex];
            count--;
            if(++takeIndex==item.length) takeIndex=0;
            notFull.signal();
            return o;
        }finally {
            lock.unlock();
        }

    }



}
