package homeWork.Seminar2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Task4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            inputStream = new FileInputStream("/broken_reference"); 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
        
        } try {
            String[] strings = {"apple", "orange"};
            String strings1 = strings[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("индекс за пределами массива");
        
        } try {
            test();
        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();  
        
        } try {
            int a = 1 / 0;
        }  catch (ArithmeticException ex) {
            ex.printStackTrace();
        
        } finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }


    private static void test() throws IOException {
    File file = new File("1");    
    try (FileReader reader = new FileReader(file)) {
        file.createNewFile();
        reader.read();
    }       
    } 
}
