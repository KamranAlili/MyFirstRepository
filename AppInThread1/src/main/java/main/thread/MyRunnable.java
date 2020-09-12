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
public class MyRunnable implements Runnable{
    private int index;
    public MyRunnable(int index) {
       this.index = index;
    }
    
    @Override
    public void run() {
       doIt();
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
