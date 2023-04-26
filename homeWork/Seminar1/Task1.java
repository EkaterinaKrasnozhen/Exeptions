package homeWork.Seminar1;
/* Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить” */
public class Task1 {
    public static void main(String[] args) {
       Object [] arr = {1, null, 4, null, 4};
       
       checkArray(arr);
       
    }

    public static void checkArray(Object[] array) {
        String indexes = "";
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null){
                indexes += index + " ";
            }           
        }
        if (indexes != "") {
            throw new NullPointerException("значение null под индексами: " + indexes);
        }
    }
}
