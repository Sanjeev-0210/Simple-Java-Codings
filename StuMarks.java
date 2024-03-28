import java.util.Scanner;
class StuMarks{
    public static void Grade(double[] arr1){
        
    for(i=0;i>=arr1.length;i++){
        double marks = arr1[i];
        if(marks>=80.00){
            System.out.println("Excellent");
        }
        else if(marks>=70.00){
            System.out.println("Very Good");
        }
        else if(marks>=60.00){
            System.out.println("Good");
        }
        else{
            System.out.println("Bad");
        }
    }
    }
    public static string main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        double[] arr1 = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
          System.out.print("Enter the marks for student " + (i+1) + ": ");
          arr1[i] = scanner.nextDouble();
        }
        String[] grades = Grade(arr1);
        for (int i = 0; i < numStudents; i++) {
          System.out.println("Grade for student " + (i+1) + ": " + grades[i]);
        

    }
}
}
    
