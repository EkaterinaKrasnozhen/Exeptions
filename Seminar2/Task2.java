package Seminar2;

public class Task2 {
    public static void main(String[] args) {
        int sum = sum2d(new String[][]{{"1", "2", "3", "4", "j", "6"}, {"1", "w"}, {"2", "7"} });
        System.out.println(sum);
        }
        
    private static int sum2d(String[][] arr) {
    int sum = 0;
    try {
        if(arr == null){
            throw new NullPointerException("массив null");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val = 0;
                try {
                    val = Integer.parseInt(arr[i][j]);           
                }catch (NumberFormatException e){
                    e.printStackTrace(); // код пошел дальше, буквы будут 0 в рассчете
                }
                sum += val;
            }
        }
    } catch (Exception e) {
        throw new RuntimeException("ошибка" + e.getMessage());
       //сумма уже не выйдет
    }
    return sum;
    }
}
