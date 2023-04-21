package Seminar;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве 
//заданное значение и возвращает его индекс. При этом, например:
//если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//если вместо массива пришел null, метод вернет -3

public class Seminar1 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        System.out.println(findinArray(array, 10));
    }

    public static int findinArray(int [] arr, int a) {
        int find = 0;
        try {
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] == a) {
                    find = index;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return find;
        
         
        
        
    }
}
