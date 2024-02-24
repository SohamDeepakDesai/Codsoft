import java.util.*;
public class StudentGradeCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int totalmarks=0;
        
        System.out.print("Enter the Number of Subject : ");
        int numSub = sc.nextInt();
        System.out.println();

        //input the marks
        for(int i=1;i<=numSub;i++){
            int marks;
            System.out.print("Enter the marks for subject "+i+" :");
            marks =sc.nextInt();

            // check the marks is in a valid range
            if(marks < 0 || marks > 100 ){
                System.out.println("The invalid marks are entered");
                return;
            }
            totalmarks += marks;
            System.out.println();
        }
        double AverageP= totalmarks / numSub;
        // find the grade 
        String grade="N";
        if(AverageP >= 90){
            grade = "A+";
        }
        else if(AverageP >=80){
            grade ="A";
        }
        else if(AverageP >= 70){
            grade ="B";
        }
        else if(AverageP >= 60){
            grade ="C";
        }
        else if(AverageP >= 50){
            grade ="D";
        }
        else if(AverageP < 50){
            grade ="F";
        }

        //Display result
        System.out.println("Total marks in "+numSub+" subject is "+totalmarks);
        System.out.println("Average percentage is "+AverageP+"%");
        System.out.println("The corresponding Grade is "+ grade);
        
        sc.close();
    }
    
}