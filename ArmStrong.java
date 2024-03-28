class ArmStrong{
    static int Count(int number){
        int count=0;
        while(number!=0){
            number=number/10;
            count++;
        }
        return count;
    }
    static int pow(int base,int exp){
        int pow=1;
        for(int i=1;i<=exp;i++){
            pow=pow*base;
        }
        return pow;
    }
    
    public static void main(String[] args) {
          int sum=0,number=153;int n1=number;
        int exp=Count(number);
      
        while(number!=0){
            int rem=number%10;
           sum=sum+pow(rem,exp);
            number=number/10;
        }
        System.out.println(sum);

        
        if(sum==n1){
            System.out.println("Armstrong Number!!!");
        }
        else{
            System.out.println("Not a ArmStrong Number!!!");
        }
    }
}
