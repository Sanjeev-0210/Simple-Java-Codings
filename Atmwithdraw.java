class Atmwithdraw{

    public static void Amntwithdraw(double Amount,int pin){
        // Amount=10000.00;
         //pin = 1234;
        double withdraw=2000.00;
        double Total_bal=Amount-withdraw;
        if(pin==1234 && Amount>=withdraw){
            System.out.println("Withdraw amount" +" "+withdraw+" " +"successfully!!!");
            System.out.println("Remaining Balance" +" "+Total_bal);
        }
        else{
            System.out.println("Incorrect Pin or Insufficient balance. Try again!!!");
            System.out.println("Total balance"+" "+Amount);
        }
    }
    public static void main(String[] args) {
        Amntwithdraw(10000.00,1234);
    }
        
    
}


