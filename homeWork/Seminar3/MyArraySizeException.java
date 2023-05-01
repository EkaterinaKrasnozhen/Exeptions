package homeWork.Seminar3;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Размер двумерного массива не 4*4");
    }
}
