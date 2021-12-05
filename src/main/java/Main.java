public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registred = true;
        long expected = 30;

        long actual = service.calculate(amount,registred);


        boolean passed = expected == actual;

        System.out.println(passed);
    }
}
