public class CarrLoan {
        int carLoan;
        int loanLength;
        int interestRate;
        int downPayment;
        public CarrLoan(int loanCar,int LengthLoan, int rateInterest, int paymentDown){
            this.carLoan = loanCar;
            this.loanLength = LengthLoan;
            this.interestRate = rateInterest;
            this.downPayment = paymentDown;
        }
        public boolean rateCheck(){
            if(this.loanLength <=0 || this.interestRate <=0){
                return false;
                /*System.out.println("Error! You must take out a valid car loan.");*/
            } else {
                return true;
            }
        }
        //DownPayment
        public boolean downPaymentCheck(){
            if(this.downPayment > this.carLoan){
                return true;
                /*  System.out.println("The car can be paid in full."); */
            }
            else {
                /* System.out.println("Come to the bank for your car"); */
                return false;
            }
        }
        //Remaining Balance
        public int remainingBalance(){
            boolean checkRate = rateCheck();
            boolean paymentCheckDown = downPaymentCheck();
            if(checkRate && paymentCheckDown ) {
                System.out.println("Come to the bank");
                System.out.println("The car can be paid in full."); return 1;
            } else if(!checkRate && !paymentCheckDown) {
                System.out.println("Error! You must take out a valid car loan."); return 2;
            } else {
                int remainingBalance = this.carLoan - this.downPayment;
                return remainingBalance;
            }
        }
        //Remaining Balance Monthly Payment
    public double remainingBalanceMonthly(){
        double monthlyPayment;
        double remaining = remainingBalance();
        double remainMonth = this.loanLength * 12;
        monthlyPayment = remaining /remainMonth;
        return  monthlyPayment;
    }
}

