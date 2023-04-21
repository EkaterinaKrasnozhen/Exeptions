import java.io.File;

public class Application {
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("null")));
        System.out.println(divide(0, 0));
        System.out.println(divide2(0, 0));
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }

    public static int divide(int a, int b) {
        if (a == 0){
            return -1;
        }
        return b/a;
    }

    public static int divide2(int a, int b) {
        if (a == 0){
            throw new RuntimeException("Divide by Zero");
        }
        return b/a;
    }
}
