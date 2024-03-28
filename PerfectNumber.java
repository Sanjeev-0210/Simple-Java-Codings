class PerfectNumber{
    static boolean check(int number){
        int sum=1;
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
               if( i*i!=number){
                sum=sum+i+number/i;
               }
               else{
                sum=sum+i;
               }
            }
        }
          if(sum==number&&number!=1){
                return true;
            }
        return false;
    }
    public static void main(String[] args) {
        int n=28;
        if(check(n)){
            System.out.println("perfect");
        }
    }
}