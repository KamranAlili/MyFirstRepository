package main.thread;

public class MyRunnable2 implements Runnable {
    
    private int index;
    public MyRunnable2(int index) {
      this.index = index;
    }

    @Override
    public void run() {
        System.out.println(index+".Runnable ishe dushdu ve 3 saniye gozleyecek...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
        System.out.println("Runnable ishi bitirdi");
    }
    
}
