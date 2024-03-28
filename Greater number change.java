import java.util.Scanner;

class Greater_number_change {
	
    static String GreaterValue(String string){
        if (string.length() == 1) {
            return "-1";
        }
        for (int i = string.length() - 2; i >= 0; i--) {
            if (string.charAt(i) < string.charAt(i + 1)) {
                return (string.substring(0, i) + string.charAt(i + 1) +string.substring(i+2,string.length())+ string.charAt(i));
            }
        }
        return "-1";
    }
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println(GreaterValue(sc1.nextLine()));
        }
}
