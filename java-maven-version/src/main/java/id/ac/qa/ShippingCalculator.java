package id.ac.qa;

public class ShippingCalculator {
    public static Object calculateShipping(int subtotal, int distance, boolean isMember) {
        if (subtotal <= 0) {
            return "INVALID_ORDER";
        }
        if (distance > 20) {
            return "OUT_OF_COVERAGE";
        }
        if (subtotal >= 500000) {
            return 0;
        }
        if (isMember) {
            return 10000;
        }
        return 20000;
    }
}
