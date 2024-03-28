public class Isomarphic{
    // s1="aabcc" s2="xxyzz" ----> Isomarphic
    // s1="ppoootjjk" s2="llhhhgddm" ----> Isomarphic
    // s1="kkllhhnn" s2="jjhhdhhh" ----> Not Isomarphic

    static String Isoma(String s){

        s=s+" ";
        String ans="";
        int count=1;
       
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                ans=ans+count;
                count=1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        String s1="aaabuu";
        String s2="xxxyzz";
        if(Isoma(s1).equals(Isoma(s2))){
            System.out.println("Isomarphic");
        }
        else{
            System.out.println("Not a Isomarphic");
        }
    }
}