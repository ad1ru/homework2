public class Main {
    public static void main(String[] args) {
        // System.out.println(generateRandomAge()); - чтобы выводил рандомное число в консоль.
        ageAndTemperature(33, -10);
        ageAndTemperature(10, 10);
        ageAndTemperature(17, -1);
        ageAndTemperature(46, -11);
        ageAndTemperature(49, 21);

        ageAndTemperature(generateRandomAge(), -20);
    }

    public static void ageAndTemperature(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            System.out.println("Идем в парк");
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            System.out.println("Идем в парк");
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            System.out.println("Идем в парк");
        } else {
            System.out.println("Оставайтесь дома");
        }
    }

    public static int generateRandomAge() {
        int random = 0 + (int) (Math.random() * 100);
        return random;
    }
}
