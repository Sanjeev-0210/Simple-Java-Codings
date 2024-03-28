import java.util.Scanner;
class Customer{
    String Name;
    int age;
    public Customer(String name, int age) {
        Name = name;
        this.age = age;
    }
    String getName(){
        return Name;
    }
    int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=s1.next();
        System.out.println("Enter Age:");
        int age=s1.nextInt();
       Customer c1=new Customer(name,age);
        System.out.println("Customer Name: "+c1.getName());
        System.out.println("Customer Age: "+c1.getAge());
    }
    
}