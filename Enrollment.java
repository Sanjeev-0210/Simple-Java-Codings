import java.util.Scanner;
class Enrollment{
    String Name;
    long phnno;
    String emailid;
    String Degree;


Enrollment( String Name,long phnno,String Degree){
   this.Name=Name;
   this.phnno=phnno;
   this.Degree=Degree;
   
    }


    public Enrollment(String Name, String emailid, String Degree) {
       this.Name =Name;
       this.emailid = emailid;
       this.Degree=Degree;
   }
    void display(){
        System.out.println("Student Name: "+Name);
        System.out.println("Phone Number: "+phnno);
        System.out.println("EmailId: "+emailid);
        System.out.println("Degree: "+Degree);
    }
   
}
 class Register{
    public static void main(String[] args) {
        Scanner d1= new Scanner(System.in);
        System.out.println("Enter 'P' to register using Phone number:");
        System.out.println("Enter 'E' to register using Phone number:");
        char Choice=d1.next().charAt(0);
        switch(Choice){
            case'p':
            System.out.println("Enter Student Name:");
            String s_name=d1.next();
            System.out.println("Enter Phone Number:");
            long phn_no=d1.nextLong();
            System.out.println("Enter Degree:");
            String dgre=d1.next();
            Enrollment s1= new Enrollment(s_name,phn_no,dgre);
            s1.display();
            break;

            case'e':
             System.out.println("Enter UserName:");
            String uname=d1.next();
            System.out.println("Enter Email ID:");
            String email=d1.next();
            System.out.println("Enter Degree:");
            String d_gre=d1.next();
            Enrollment s2= new Enrollment(uname,email,d_gre);
            s2.display();
            break;

            default:
            System.out.println("Invalid Choice!!!!");
        }
        
        
    }
 }