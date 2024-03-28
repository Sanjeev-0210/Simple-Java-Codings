public class StringReplace {
    public static void main(String[] args) {
        String str="4ahriekfhr2y78";  //4ah_iek_hr2_78
        String newstr="";
        for(int i=0;i<str.length();i++){
             if((i+1)%4==0){
                newstr=newstr+"_";
            }
            else{
                newstr=newstr+str.charAt(i);
            }
        }
        System.out.println(newstr);
    }
}
