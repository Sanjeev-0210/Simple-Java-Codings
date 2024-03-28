class Fibonacci{
    //nth number
    public static void main(String[] args) {
        int n=8;
        int n1=0,n2=1,sum=0;
    int i=1;
    while(i<=n){
        if(i==n){
            System.out.println(n1);
        }
       // System.out.println(n1);
        sum=n1+n2;
        n1=n2;
        n2=sum;
        i++;
    }

    }
  
}
