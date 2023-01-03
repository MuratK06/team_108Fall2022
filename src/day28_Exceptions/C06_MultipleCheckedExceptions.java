package day28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_MultipleCheckedExceptions {
    public static void main(String[] args) {

        try {
            FileInputStream fis=new FileInputStream("src/day28_Exceptions/metin.txt");

            int k=0;
            while ((k=fis.read())!=(-1)){
                System.out.print((char) k);

            }
        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamdi");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
