package homeWork.Seminar3;

/* Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, 
при подаче массива другого размера необходимо 
бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, 
и просуммировать. Если в каком-то элементе массива преобразование не удалось 
(например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, 
с детализацией в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и 
MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив). */

public class Task {
    public static void main(String[] args) {
        String [][] arrString = new String[][]{{"1", "2", "3", "0"}, {"0", "7", "2", "o"}, {"0", "7", "2", "o"}, {"0", "7", "2", "0"}};
        String [][] arrString2 = new String[][]{{"1", "2", "3", "0"}, {"0", "7", "2", "0"}, {"0", "7", "2", "0"}, {"0", "7", "2", "0"}};
        String [][] arrString1 = new String[][]{{"0", "7", "2", "p"}, {"0", "7", "2", "p"}, {"0", "7", "2", "p"}};
        try {
            SumToIntFromString(arrString2);
            //SumToIntFromString(arrString);
            IsSquareStringArray(arrString1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void IsSquareStringArray(String [][] arrString) {
        if (arrString.length != 4) {
            throw new MyArraySizeException();
        }    
    }

    public static void SumToIntFromString(String [][] array) {
        int sum = 0;
        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Неверные данные в ячейке: " +i, +j));                    
                }                
            }        
        }
        System.out.println("Сумма чисел массива: " + sum);      
    }

    public static void printArray(String [][] array) {
        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
