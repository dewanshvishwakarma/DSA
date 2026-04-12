package OOPS_IN_JAVA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ReadWrite{
    void ReadFile() throws FileNotFoundException{
        FileInputStream fes=new FileInputStream("ram.txt");
    }
}
public class Exception5 {
    static void main(String[] args) {
            ReadWrite rw=new ReadWrite();
            try {

            rw.ReadFile();
            }
            catch (FileNotFoundException e){
                System.out.println(" ka hal chal");
                e.printStackTrace();
            }
    }
}
