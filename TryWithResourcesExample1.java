package batcave;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample1 {

    public static void main(String[] args) {

        try(FileReader fileReader=new FileReader("file.txt")){
            int data;
            while ((data=fileReader.read())!=-1){
                System.out.println((char)data);
            }
        } catch (IOException e) {
            System.out.println("File Error: "+e.getMessage());
        }
    }
}
