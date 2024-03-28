public class RecursionStarPattern{

    static void col(int n){
        if(n>=1){
            System.out.print("* ");
            col(n-1);
        }
    }
    static void row(int n){
        if(n>=1){
            col(5);
            System.out.println("* ");
            row(n-1);
        }
    }
    public static void main(String[] args) {
        row(5);
    }
}