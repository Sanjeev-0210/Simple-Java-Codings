class FindStringIndexUsingNumberFactor{
    public static void main(String[] args) {
        String s="Hello how are you";
        int n=48;
        for(int i=1;i<s.length();i++){
            if(n%i==0){
               System.out.print(s.charAt(i));
            }
        }
    }
}