package homeWork.Seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 и возвращает введенное значение. Ввод текста вместо числа не должно приводить к 
 падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(getFloat());
    }

    public static float getFloat() {
        float userInput = 0;
        Scanner scanner = new Scanner(System.in);         
        System.out.println("Введите дробное число: ");
        while (true) {
            try {
                userInput = scanner.nextFloat();
                break;                
            }catch (Exception e){
                e.getMessage();
                System.out.println("Неерный формат данных. Введите дробное число: ");
                scanner.next();    
            }
        }
        return userInput;   
    }
}
