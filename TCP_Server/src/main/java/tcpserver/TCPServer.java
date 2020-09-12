package tcpserver;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import util.FileUtility;

/**
 *
 * @author KamranAlili
 */
public class TCPServer {

    public static void main(String[] args) throws Exception, Throwable {
        readAsByte();
       
    }
    
    public static void readAsByte() throws Exception, Throwable {
       ServerSocket ourFistServerSocket = new ServerSocket(6789); //localhost, 127.0.0.1
        
       while(true) {
         System.out.println("Yeni socket uchun ve ya bashqa sozle desek yeni mushteri uchun gozleyirem...");
          Socket connection = ourFistServerSocket.accept(); //accept(); gozleyecek.
 //         System.out.println("Urrra yeni mushteri geldi...");
         
          DataInputStream dataStream = new DataInputStream(connection.getInputStream());
     
          String result = readReguest(dataStream);
          System.out.println(result);
         
          
        OutputStream outputStream = connection.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        
 //       byte[] bytes = FileUtility.readBytes("C:\\Users\\User\\Downloads\\photo-of-audi-parked-near-trees-1402787.jpg");
          writeResponse(dataOutputStream, "Hey I am Working");  //Socketi close edirik yeni ozumu close edirem.
 //         System.out.println("message length2="+arr.length); //500 byte-da olmalidir.
 //         FileUtility.writeBytes(arr, "C:\\Users\\User\\Desktop\\photo-of-audi-parked-near-trees-1402787.jpg"); 
        connection.close();        
   }
       
  }
    
    
    
    private static void  writeResponse(OutputStream out, String s) throws Throwable {
       String response = "HTTP/1.1 200 OK\r\n"
 //              +"Server: YarServer/2009-09-09\r\n"
 //              +"Content-Type: text/html\r\n"
 //              +"Content-Length: " +s.length() + "\r\n"
               +"Connection: close\r\n\r\n";
       String result = response +s;
       out.write(result.getBytes());
       out.flush();

    }
    
    
    private static String readReguest(InputStream sin) throws IOException{
       InputStreamReader isr = new InputStreamReader(sin);
       BufferedReader reader = new BufferedReader(isr);
       String msg = "";
       while(true) {
         String s = reader.readLine();
         if(s == null || s.trim().length() == 0) {
             break;
        } else {
          msg = msg + s + "\r\n";
        }
           System.out.println("Server request : " + s);
           
           System.out.println();
    }
        return msg;
    
    }
    
    
    public static byte[] readMessage(DataInputStream din) throws Exception {
        int msgLen = din.readInt();  //readInt uzunluqunu verir.
 //       System.out.println("message length1="+msgLen); //500 byte yaziram meselen
        byte[] msg = new byte [msgLen];
        din.readFully(msg); //Hamisini oxu demekdir.
        return msg;
        
    }
    
    
    public static void readAsString() throws Exception {
       ServerSocket ourFistServerSocket = new ServerSocket(6789); //localhost, 127.0.0.1
        
       while(true) {
          System.out.println("Yeni socket uchun ve ya bashqa sozle desek yeni mushteri uchun gozleyirem...");
          Socket connection = ourFistServerSocket.accept(); //accept(); gozleyecek.
          System.out.println("Urrra yeni mushteri geldi...");
          InputStream is = connection.getInputStream();
          
          InputStreamReader reader = new InputStreamReader(is); //In-yeni icerideyem. Iceridekini oxuyub cole atiriq
          
          BufferedReader bReader = new BufferedReader(reader); //Data hisse-hisse gelir, onu toplayiriq.
          
          String messageFromClient = bReader.readLine();
          System.out.println("Mushteri deyir ki:" + messageFromClient);
        }
    }

    
}
