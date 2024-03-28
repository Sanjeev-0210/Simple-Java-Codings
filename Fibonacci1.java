class Fibonacci{
    public static void main(String[] args) {
        int i=1,n=10,n1=0,n2=1,sum=0;
        while(i<=n){
            System.out.println(n1);
            sum=n1+n2;
            n1=n2;
            n2=sum; 
            i++;
        }
    }
}