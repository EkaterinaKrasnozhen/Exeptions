package homeWork.Seminar1;
/* *. Реализуйте метод, принимающий в качестве аргументов двумерный массив. 
Метод должен проверить что длина строк и столбцов 
с одинаковым индексом одинакова, детализировать какие строки со столбцами не требуется. */
public class Task3 {
    public static void main(String[] args) {
        int [][] matrix = {{1, 5}, {1, 2, 6}, {1, 8, 0}};
        checkQuadrArray(matrix);
    }
    
    public static void checkQuadrArray(int [][] array){
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length){
                throw new RuntimeException("массив не квадратный");
            }   
        }
        System.out.println("массив квадратный");
    }
}
