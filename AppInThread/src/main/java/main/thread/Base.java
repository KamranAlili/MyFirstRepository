
package main.thread;

/**
 *
 * @author KamranAlili
 */
public class Base {
    
   private static volatile int a = 0;
    
   public static int getA() {
      return a;
   }
   
   public synchronized static void incA() {
      a++;
   }
   
}
