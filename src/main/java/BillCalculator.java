public class BillCalculator {
    public static double calculate(double billValue, float paymentForService) {
        return billValue + paymentForService;
    }

    public static double calculate(double billValue, float paymentForService, double discount) {
        return (billValue * discount) + paymentForService;
    }

    public static double calculate(double billValue, float paymentForService, short takeoutPack) {
        return billValue + paymentForService + takeoutPack;
    }

}
