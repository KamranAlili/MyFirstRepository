package main.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object> {
    
    private int index;
    public MyCallable(int index) {
      this.index = index;
    }

    public void run() {
        System.out.println(index+".Runnable ishe dushdu ve 3 saniye gozleyecek...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
        System.out.println("Runnable ishi bitirdi");
    }

    @Override
    public Object call() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
