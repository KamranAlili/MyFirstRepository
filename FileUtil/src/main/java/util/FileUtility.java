package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author KamranAlili
 */
public class FileUtility {
    
   public static void writeBytes(byte[] data, String fileName) throws Exception {
       FileOutputStream  fop = new FileOutputStream(fileName);
       //get the content in bytes
       fop.write(data);
       fop.flush();
       fop.close();
       
       System.out.println("Done");
   }
   
   public static byte[] readBytes(String fileName) throws Exception {
     File file = new File(fileName);
     
     try(FileInputStream fileInputStream = new FileInputStream(file);) {
     
     byte[] bytesArray = new byte[(int) file.length()];
     
     //read file into bytes[]
     fileInputStream.read(bytesArray);
     return bytesArray;
             
     }
   
   }
    
}
