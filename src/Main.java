public class Main {
    public static void main(String[] args) {

        int price = 11450; // стоимость билета
        int rub = 20; // количество рублей для одной бонусной мили

        int bonus = price / rub;

        System.out.println("Начисленно бонусных миль = " + bonus);
    }
}
