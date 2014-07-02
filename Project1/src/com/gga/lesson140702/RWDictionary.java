package com.gga.lesson140702;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.gga.lesson140528.Utils;

public class RWDictionary {
    private final Map<String, String> m = new TreeMap<String, String>();
    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock r = rwl.readLock();
    private final Lock w = rwl.writeLock();

    public String get(String key) {
    	System.out.println(Thread.currentThread().getName() + " is trying to read");
        r.lock();
        try {
        	System.out.println(Thread.currentThread().getName() + " has started reading");
        	Utils.pause(2000);
        	return m.get(key);
        } finally {
        	System.out.println(Thread.currentThread().getName() + " finished");
        	r.unlock();
        }
    }
    
    public String put(String key, String value) {
    	System.out.println(Thread.currentThread().getName() + " --< is trying to write >--");
     	w.lock();
    	try { 
    	    System.out.println(Thread.currentThread().getName() + " --< has started writing >--");
    	    return m.put(key, value);
    	} finally { 
    	    System.out.println(Thread.currentThread().getName() + " --< finished writing >--");
    	    w.unlock();
    	}
    }
    
    public String[] allKeys() {
        r.lock();
        try { return m.keySet().toArray(); }
        finally { r.unlock(); }
    }

    public void clear() {
        w.lock();
        try { m.clear(); }
        finally { w.unlock(); }
    }
    
    static class Writer implements Runnable {

		@Override
		public void run() {
		    
			
		}
    	
    }
    
    public static void main(String[] args) {
		System.out.println();
	}
}


