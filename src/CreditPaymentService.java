public class CreditPaymentService {
    public double calculate(double sumCredit, double percent, double term) {
        double munpercent = percent / 1200 + 1;
        double newterm = term * 12;
        double degree = Math.pow(munpercent, newterm);
        double result = sumCredit * (munpercent - 1) * degree / (degree - 1);
        return result;
    }

}
