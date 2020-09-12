/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

import java.util.concurrent.ThreadFactory;

/**
 *
 * @author KamranAlili
 */
public class MyCustomThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        if(r instanceof MyRunnable) {
           Thread t = new Thread(r);
           t.setDaemon(true);
        } else {
           Thread t = new Thread(r);
           t.setDaemon(false);
           return t;
        }
       return null;

    }
    
}
