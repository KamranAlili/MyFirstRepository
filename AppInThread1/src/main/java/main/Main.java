    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import main.thread.MyCallable;
import main.thread.MyRunnable;


public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("run/...");
           ExecutorService service = Executors.newSingleThreadExecutor();
           MyCallable [] arr = new MyCallable[3];
           arr[0] = new MyCallable(1);
           arr[1] = new MyCallable(2);
           arr[2] = new MyCallable(3);
           
           List<Future<Object>> list = service.invokeAll(Arrays.asList(arr));
           
           Future f = list.get(0);
           
           service.shutdown();
           service.awaitTermination(1, TimeUnit.DAYS);
           System.out.println("terminated");
         
    }
    
    private static void scheduledThreadPool() {
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(1);
           
        ex.schedule(new MyRunnable(1), 0, TimeUnit.SECONDS);
        ex.schedule(new MyRunnable(1), 0, TimeUnit.SECONDS);
    }
    
    private static void cachedThreadPool() {
        ExecutorService service1 = new ThreadPoolExecutor(10, 15, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));
        ExecutorService service2 = Executors.newCachedThreadPool(); //10 3
    }

    private static void fixedThreadPool() {
       ExecutorService service = Executors.newFixedThreadPool(5);
       for(int i=0; i<10; i++) {
          service.submit(new MyRunnable(i)); //1 thread
      } 
       service.shutdown();
    }
    
    private static void singleThreadExecutor() {
       ExecutorService service = Executors.newSingleThreadExecutor();
       
       Future f = service.submit(new MyRunnable(1)); //1 thread
       
       service.submit(new MyRunnable(2)); //1 thread
       service.submit(new MyRunnable(3)); //1 thread
       service.submit(new MyRunnable(4)); //1 thread
       service.submit(new MyRunnable(5)); //1 thread
//       service.submit(new MyRunnable()); //1 thread
    }
}
