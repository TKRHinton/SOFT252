
package PatientManagmentSystem;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;




public class PatientManagmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        

         FileWriter writer = new FileWriter("accounts.txt", true);
         writer.write("A2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("123");
         writer.write(System.getProperty("line.separator"));
         writer.write("James");
         writer.write(System.getProperty("line.separator"));
         writer.write("23 James Street");
         writer.write(System.getProperty("line.separator"));
         writer.close();
         

         
          //FileReader fread = new FileReader("accounts.txt");
         //   BufferedReader bread = new BufferedReader(fread);
                  
           //     String id = bread.readLine();
           //     String password = bread.readLine();
            //    String name = bread.readLine();
            //    String address = bread.readLine();
                
            //    System.out.println(id);
            //    System.out.println(password);
            //    System.out.println(name);
            //    System.out.println(address);
          //  bread.close();
         //   fread.close();
         
        
    
        LoginPage mr=new LoginPage();
        mr.setVisible(true);   
        
        
    }
    
}
