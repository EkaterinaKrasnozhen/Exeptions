package homeWork.Seminar1;
/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен сумме элементов 
двух входящих массивов в той же ячейке. Если длины массивов не равны, 
необходимо как-то оповестить пользователя. */

public class Task2 {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {1, 2, 3, 5};
        sumArrays(arr1, arr2);   
    }

    public static void sumArrays( int [] array1, int [] array2) {
        int [] arraySum = new int [array1.length];
        if (array1.length != array2.length){
            throw new RuntimeException("массивы не равны");
        }
        else {
            for (int index = 0; index < array1.length; index++) {
                arraySum[index] = array1[index] + array2[index];
                System.out.print(arraySum[index]);
            }
        }           
    }
}
