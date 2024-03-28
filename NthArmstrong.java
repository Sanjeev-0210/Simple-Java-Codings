class NthArmstrong{
    public static void main(String[] args) {
         int c=0,n=3;
    for(int i=1;;i++){
        if(ArmStrong(i)){
            c++;
        }
        if(c==n){
            System.out.println(i);
            break;
        }
    }
    }
   
}