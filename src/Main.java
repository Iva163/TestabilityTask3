public class Main {
    public static void main(String[] args) {
        CreditPaymentService paymentService = new CreditPaymentService();
        System.out.println("Ежемесячный платеж при сумме кредита 1_000_000, сроке 1 год, ставке 9,99%: " + paymentService.calculate(9.99, 1_000_000, 1) + " руб");
        System.out.println("Ежемесячный платеж при сумме кредита 1_000_000, сроке 2 года, ставке 9,99%: " + paymentService.calculate(9.99, 1_000_000, 2) + " руб");
        System.out.println("Ежемесячный платеж при сумме кредита 1_000_000, сроке 3 года, ставке 9,99%: " + paymentService.calculate(9.99, 1_000_000, 3) + " руб");
    }
}