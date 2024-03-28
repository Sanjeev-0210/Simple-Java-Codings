import java.util.Scanner;
public class Simplecalci{
    static int add(int n1,int n2){
        return(n1+n2);
    }
    static int sub(int n1,int n2){
        return(n1-n2);
    }
    static int mul(int n1,int n2){
        return(n1*n2);
    }
    static int div(int n1,int n2){
        return(n1/n2);
    }
    static int mod(int n1,int n2){
        return(n1%n2);
    }
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("------Simple Calci------");
        while(true){
            System.out.println("------MENU------");
            System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Mod\n6.Exit");
            System.out.println("------Enter your option------");
            int op=ip.nextInt();
            int n1=0,n2=0;
            if(op>=1&&op<=5){
                System.out.println("Enter the value for n1: ");
                n1=ip.nextInt();
                System.out.println("Enter the value for n2: ");
                n2=ip.nextInt();
            }
            switch (op) {
                case 1:
                System.out.println("Add: "+add(n1,n2));
                    break;
                case 2:
                    System.out.println("Sub: "+sub(n1,n2));
                        break;
                case 3:
                    System.out.println("Mul: "+mul(n1,n2));
                        break;
                case 4:
                    System.out.println("Div: "+div(n1,n2));
                        break;
                case 5:
                    System.out.println("Mod: "+mod(n1,n2));
                        break;
                case 6:
                System.out.println("Thank You Visit Again!!!");
                        System.exit(0);
                default:
                System.out.println("Invalid Choice!!!");
                    break;
            }
        }
    }
}

