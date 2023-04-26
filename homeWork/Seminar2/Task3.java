package homeWork.Seminar2;


public class Task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 1;
            System.out.println(a/b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
            if (b == 0) {
                throw new ArithmeticException();
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("индекс за пределами массива ");
            ex.getMessage();
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
            ex.getMessage();
        } 
    }
    
    public static void printSum(Integer a, Integer b) {
        try {
            System.out.println(a + b);
        } catch (Exception e) {
            e.getMessage();
            e.getStackTrace();
        }    
    }         
}
