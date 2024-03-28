class Employee{
    int id;
    String name;
    double salary;
    void updatesalary(double sal){
        salary=sal;
    }
    void updatename(String newname){
        name=newname;
    }
    void updateid(int newid){
        id=newid;
    }
}
class MainClass14{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.updateid(12345);
        e1.updatename("Sanjeev");
        e1.updatesalary(25000.00);
        System.out.println("Employee ID:"+e1.id);
        System.out.println("Employee Name:"+e1.name);
        System.out.println("Employee Salary:"+e1.salary);
    }
}