package Seminar2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
         
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
            int index = 0;
            if (!scanner.hasNext()) {
                throw new IllegalArgumentException("Ошибка ввода числа");
            }
            index = scanner.nextInt();
            if (index < 0 || index > arr.length) {
                throw new IndexOutOfBoundsException("Индекс за пределами массива");
            }
            arr[index] = 1;
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка");
            e.printStackTrace();
        }
        /* for (int index1 = 0; index1 < arr.length; index1++) {
            System.out.print(arr[index1]);
        } */   
    }
}
