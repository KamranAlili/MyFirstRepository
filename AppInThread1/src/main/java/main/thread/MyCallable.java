/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

import java.util.concurrent.Callable;

/**
 *
 * @author KamranAlili
 */
public class MyCallable implements Callable<Object>{
    private int index;
    public MyCallable(int index) {
       this.index = index;
    }
  
    @Override
    public Object call() throws Exception {
       doIt();
        return this;
    }
    
    private void doIt() {
      System.out.println(index+".runnable ishe dushdu ve 3 saniye gozleyecek...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
        System.out.println("runnable ishi bitirdi");
    }
    
}
