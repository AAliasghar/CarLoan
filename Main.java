public class Main {
    public static void main(String[] args) {
        CarrLoan loan = new CarrLoan(10000,3,5,1000);
        loan.rateCheck();
        int remaining = loan.remainingBalance();
        System.out.println("Remaining = " +remaining );
        CarrLoan loan1 = new CarrLoan(10000,2,3,2000);
        loan1.rateCheck();
        int remaining1 = loan1.remainingBalance();
        System.out.println("Remaining1 = " +remaining1 );
        double monthlyPayment1 = loan1.remainingBalanceMonthly();
        System.out.println("Monthly Payment "+monthlyPayment1);
        CarrLoan loan2 = new CarrLoan(10000,0,0,3000);
        loan2.rateCheck();
        int remaining2 = loan2.remainingBalance();
        System.out.println("Remaining2 = " +remaining2 );
        double monthlyPayment2 = loan2.remainingBalanceMonthly();
        System.out.println("Monthly Payment "+monthlyPayment2);
        CarrLoan loan3 = new CarrLoan(4500,0,0,900);
        loan3.rateCheck();
        int remaining3 = loan3.remainingBalance();
        System.out.println("Remaining3 = " +remaining3 );
        double monthlyPayment3 = loan3.remainingBalanceMonthly();
        System.out.println("Monthly Payment "+monthlyPayment3);
    }
}