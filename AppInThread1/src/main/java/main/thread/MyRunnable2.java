/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

/**
 *
 * @author KamranAlili
 */
public class MyRunnable2 implements Runnable{
    private int index;
    public MyRunnable2(int index) {
       this.index = index;
    }
    
    @Override
    public void run() {
        System.out.println(index+".runnable ishe dushdu ve 3 saniye gozleyecek...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
        System.out.println("runnable ishi bitirdi");
    }
    
}
