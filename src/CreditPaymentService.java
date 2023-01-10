public class CreditPaymentService {
    public int calculate(double percent, int sum, int time) {
        double payment = sum * ((((percent / 12) / 100) *
                Math.pow(1 + ((percent / 12) / 100), (time * 12))) /
                (Math.pow(1 + ((percent / 12) / 100), (time * 12)) - 1));
        int paymentI = (int) payment;
        return paymentI;

    }
}
