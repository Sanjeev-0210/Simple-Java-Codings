class Palindrome{
    public static void main(String[] args) {
        int rev=0,n=1251,n1=n;
        while(n!=0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println(rev);
        if(rev==n1){
            System.out.println("Palindrome!!!");
        }
        else{
            System.out.println("Not a palindrome!!!");
        }
    }
}