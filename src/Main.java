public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500

        System.out.println ("price = 10000");
        System.out.println(miles);

        System.out.println ("price = 20");
        System.out.println (service.calculate(20));

        System.out.println ("price = 19");
        System.out.println (service.calculate(19));

        System.out.println ("price = 50");
        System.out.println (service.calculate(50));

    }
}
