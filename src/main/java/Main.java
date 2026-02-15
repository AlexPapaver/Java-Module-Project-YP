public class Main {
    public static void main(String[] args) {

        Car[] car = Registration.start();
        for (int i = 0; i <= 2; i++) {
            System.out.println("Машина №" + (i + 1) + " - " + car[i].name + " проехала за 24 часа " + (car[i].velocity*24) + "км");
        }
        Race.winner(car);

    }
}