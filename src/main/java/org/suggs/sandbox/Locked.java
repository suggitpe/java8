package org.suggs.sandbox;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locked {

    private static Lock lock = new ReentrantLock();

    protected static void setLock(Lock aLock) {
        lock = aLock;
    }

    public static void runInLock(Runnable runnable) {
        lock.lock();
        try {
            runnable.run();
        } finally {
            lock.unlock();
        }
    }
}
