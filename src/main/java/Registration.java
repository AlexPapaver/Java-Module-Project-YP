import java.util.Scanner;

public class Registration {
    public static Car[] start() {

        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];

        System.out.println("Добро пожаловать на гонки! Начинаем регистрацию участников");
        for (int i = 0; i <= 2; i++) {

            System.out.println("Введите название автомобиля " + (i + 1));
            String name = scanner.next();

            System.out.println("Введите его скорость, не может быть меньше 0 и больше 250");
            int vel = 0;
            while (vel <= 0 || vel > 250) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Ошибка! Введите целое число.");
                    scanner.next();
                }
                vel = scanner.nextInt();
                if (vel <= 0 || vel >= 250) {
                    System.out.println("Скорость за пределами возможных значений, повторите попытку");
                }
            }

            cars[i] = new Car(name, vel);
        }

        return cars;
    }
}
