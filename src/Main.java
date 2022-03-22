public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;
        double percentYears = 9.99;
        double years = 1;
        double monthlyPayment = service.calculate(credit, percentYears, years);
        int newMonthlyPayment = (int) monthlyPayment;
        System.out.println("Ваш ежемесячный платеж на 1 год составит " + newMonthlyPayment);

        years = 2;
        monthlyPayment = service.calculate(credit, percentYears, years);
        newMonthlyPayment = (int) monthlyPayment;
        System.out.println("Ваш ежемесячный платеж на 2 года составит " + newMonthlyPayment);

        years = 3;
        monthlyPayment = service.calculate(credit, percentYears, years);
        newMonthlyPayment = (int) monthlyPayment;
        System.out.println("Ваш ежемесячный платеж на 3 года составит " + newMonthlyPayment);
    }
}
