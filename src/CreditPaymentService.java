public class CreditPaymentService {
    public int calculate(double p, int s, int t) {
        double k = s * ((((p / 12) / 100) * Math.pow(1 + ((p / 12) / 100), (t * 12))) / (Math.pow(1 + ((p / 12) / 100), (t * 12)) - 1));
        int b = (int) k;
        return b;

    }
}
