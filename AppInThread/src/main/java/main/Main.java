package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import main.thread.MyRunnable;
public class Main {
    
  public static void main(String[] args) throws InterruptedException {
       ExecutorService service = Executors.newCachedThreadPool();


    }
  
  
  public static void fixedThreadPool() {
    ExecutorService service = Executors.newFixedThreadPool(5);
         for(int i=0; i<10; i++) {
            service.submit(new MyRunnable(i));  //1 thread
         }
  }
 
  
  private static void singleThreadExecutor() {
       ExecutorService service = Executors.newSingleThreadExecutor(); //newSingleThreadExecutor-Her defe birini ishe salir
       
       Future f = service.submit(new MyRunnable(1));  //1 thread
     
       service.submit(new MyRunnable(2));  //1 thread
       service.submit(new MyRunnable(3));  //1 thread
       service.submit(new MyRunnable(4));  //1 thread
       service.submit(new MyRunnable(5));  //1 thread
 //      service.submit(new MyRunnable());  //1 thread
 
 

     }
  
}
