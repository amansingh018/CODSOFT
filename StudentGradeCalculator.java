import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int totalMarks = 0;
        int n = sc.nextInt();

        int marks[] = new int[n];
        for (int i =0; i<n; i++){
            System.out.println("Enter the marks of subject: ");
            marks[i] = sc.nextInt();
        }

        for (int i=0; i<marks.length; i++){
            totalMarks+=marks[i];
        }

        float percentage = (float) totalMarks/n;
        char grade;
        if (percentage>=90){
            grade = 'A';
        } else if (percentage>=80) {
            grade = 'B';
        } else if (percentage>=70) {
            grade = 'C';
        } else if (percentage>=60) {
            grade = 'D';
        }else {
            grade = 'F';
        }

        System.out.println("Total Marks: "+ totalMarks);
        System.out.println("Percentage: "+ percentage);
        System.out.println("Grade: "+grade);

    }
}
