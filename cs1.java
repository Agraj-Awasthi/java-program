
import java.util.Scanner;


public class cs1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name=sc.nextLine();

        System.out.print("Enter marks of subject 1: ");
        int sub1=sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        int sub2=sc.nextInt();

        System.out.print("Enter marks of subject 3: ");
        int sub3=sc.nextInt();

        System.out.print("Enter marks of subject 4: ");
        int sub4=sc.nextInt();

        System.out.print("Enter marks of subject 5: ");
        int sub5=sc.nextInt();

        Student s1=new Student(name, sub1, sub2, sub3, sub4, sub5);

        s1.calculateResult();

        sc.close();

        
    }
}

class Student{
    String name;
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    int sub5;

    //Constructor
    Student(String n, int s1, int s2, int s3, int s4, int s5){
        name=n;
        sub1=s1;
        sub2=s2;
        sub3=s3;
        sub4=s4;
        sub5=s5;
    }

    void calculateResult() {
        int total=sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = total/5.0;

        System.out.println("\n----- Student -----");

        System.out.println("Name: "+name);
        System.out.println("Total marks "+total);
        System.out.println("Percentage: "+percentage+"%");

        if(percentage>=90){
            System.out.println("Grade: A");
        }
        else if(percentage>=80){
            System.out.println("Grade: A");
        }
        else if(percentage>=70){
            System.out.println("Grade: B");
        }
        else if(percentage>=60){
            System.out.println("Grade: C");
        }
        else if(percentage>=50){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }

        if(percentage>=50){
            System.out.println("Result: Pass");
        }else{
            System.out.println("Result: Fail");
        }
    }

}