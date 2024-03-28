import java.util.Scanner;
//Strong number or not
class Factorial{
    public static int Fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc1.nextInt();
        int sum=0,n1=n;
        while(n!=0){
            int rem=n%10;
            sum=sum+Fact(rem);
            n=n/10;
        }
        if(sum==n1){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }
}