class PrimeNo{
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=9,c=0;
        for(int i=2;;i++){
            if(isPrime(i)){
                //System.out.println(i);
                c++;
            }
            if(c==n){
                System.out.println(i);
                break;
            }
        }
    }
}