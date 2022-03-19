package uk.axone.devintest.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {

    //Handling the exception adding a try/catch block
    public void readFileHandle(){
        try {
            FileInputStream fis = new FileInputStream("C:/docucment/readme.txt");
            fis.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //propagating an exception by using the 'Throws' clause
    public void readFilePropagate() throws IOException, FileNotFoundException {
        FileInputStream fis = new FileInputStream("readme.txt");
        fis.read();
    }

}
