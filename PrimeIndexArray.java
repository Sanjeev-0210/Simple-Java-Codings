class PrimeIndexArray{
    //check the given array should be prime array or not.If the array is said to be prime then the array contains prime number in prime indexes
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
    static boolean isPrimeArray(int[] arr){
        for(int i=2;i<arr.length;i++){
            if(isPrime(i)&&!isPrime(arr[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,3,17,23,6,72,8,9};
        
             if(isPrimeArray(arr)){
            System.out.println("ArrayIndexIsPrime");
        }
        else{
            System.out.println("Not");
        }
        
       
    }
}