public class Race {

    public static void winner(Car[] cars) {

        int m = 0;
        for (int i = 1; i <= (cars.length - 1); i++) {
            if (cars[i].velocity > cars[m].velocity) {
                m = i;
            }
        }
        System.out.println("Победитель: " + cars[m].name);

    }
}
