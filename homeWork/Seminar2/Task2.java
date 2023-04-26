package homeWork.Seminar2;

public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 1;
            int [] intArray = new int[8];
            double catchedRes1 = intArray[7] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
         
    }
}
