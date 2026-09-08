package batcave;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader=new FileReader("green.txt"); //can't find this text file named 'green'
    }
}
