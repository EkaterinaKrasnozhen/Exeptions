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
        try {
            Scanner scanner = new Scanner(System.in);         
            System.out.println("Введите дробное число: ");
            
            if (!scanner.hasNext()) {
                throw new IllegalArgumentException("Ошибка ввода числа");
            }
            userInput = scanner.nextFloat();
            if (userInput == 0.0) {
                throw new NumberFormatException("0.0 не дробное число");
            }
        } catch (Exception e){
            throw new RuntimeException("неверно введены данные " + e.getMessage());
        }
        return userInput;   
    }
}
