import java.util.*;

public class StringPalindrome {

    public static void main(String[] args) {
       
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter the String:");
        String str1=s1.next();
        String revstr="";
        for(int i=str1.length()-1;i>=0;i--){
            revstr=revstr+str1.charAt(i);
        }
        if(str1.toLowerCase().equals(revstr.toLowerCase())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    
    }   
}