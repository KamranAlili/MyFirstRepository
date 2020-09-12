/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.DataOutputStream;
import java.io.OutputStream;    
import java.net.Socket;
import util.FileUtility;

/**`
 *
 * @author KamranAlili
 */
public class TCPClient {
    
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 6789);
        //Burda ise OutputStream duzeldecik, cunki coldeyik iceriye birseyler yazaciq. Stream - kanal demekdir.
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        
        byte[] bytes = FileUtility.readBytes("C:\\Users\\User\\Downloads\\photo-of-audi-parked-near-trees-1402787.jpg");
 //       byte[] bytes = "test message".getBytes();
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes); //Stringi byte-a ceviririk ve iceriye write edirik.
        socket.close();  //Socketi close edirik yeni ozumu close edirem.
        
    }
}
