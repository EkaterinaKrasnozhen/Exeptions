package Seminar;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве 
//заданное значение и возвращает его индекс. При этом, например:
//если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//если вместо массива пришел null, метод вернет -3


import java.util.Scanner;

public class Seminar1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива не менее 5: ");
        int arrLength = input.nextInt();
        int [] array = new int[arrLength];
        System.out.println("Введите элементы массива через enter: ");
        for (int index = 0; index < arrLength; index++) {
            array[index] = input.nextInt();
        }
        
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        input.close();
        
        int res = (findinArray(array, 1));
        switch (res) {
            case -1:
                
                System.out.println("Длина массива менее 5");

            case -2:
                
                System.out.println("искомый элемент не найден");
            
            case -3:
                
                System.out.println("вместо массива пришел null");    
            
            default:
            System.out.printf("индекс искомого элемента %d", res);
        }
    }

    public static int findinArray(int [] arr, int a) {
        int minLength = 6;
        if (arr.length < minLength) {
            return -1;
        }
        else if (arr == null){
            return -3;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == a) {
                return index;
            }  
        }
        return -2;     
    }
}
