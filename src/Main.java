import java.util.Random;

public class Main {
    public static int generateRandomAge(int a, int b) {
        int random = a + (int) (Math.random() * b);
        return random;
    }

    public static void main(String[] args) {
        int age = generateRandomAge(0, 100);
        int temperature = -5;

        // System.out.println(age); - чтобы выводил рандомное число в консоль.

        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            System.out.println("Идем в парк");
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            System.out.println("Идем в парк");
        } else if (/*age > 45 || */(temperature >= -10 && temperature <= 25) && age > 45) {
            System.out.println("Идем в парк");
        } else {
            System.out.println("Оставайтесь дома");
        }
    }
}