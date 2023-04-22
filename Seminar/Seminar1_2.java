package Seminar;

import java.util.Random;
import java.util.Scanner;

//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//Необходимо посчитать и вернуть сумму элементов этого массива.
//При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами 
//(кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
//Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
public class Seminar1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую длину двумерного массива: ");
        int firstLength = scanner.nextInt();
        System.out.println("Введите вторую длину двумерного массива: ");
        int secondLength = scanner.nextInt();
        int [][] array = new int [firstLength][secondLength];
        //System.out.println("Введите значения массива (только 0 или 1): ");
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(2);
            }
            
        }
    }
}
