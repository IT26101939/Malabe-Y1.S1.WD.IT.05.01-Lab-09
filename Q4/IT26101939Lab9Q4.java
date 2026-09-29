import java.util.Scanner;

public class IT26101939Lab9Q4 {

    
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-15.2f %s%n", name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nEnter details for Student " + i);

            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter assignment mark: ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter exam mark: ");
            double examMark = input.nextDouble();

            input.nextLine(); 

            double finalMark = calcFinalMark(assignmentMark, examMark);
            char grade = findGrades(finalMark);

            if (i == 1) {
                System.out.println("\nName            Final Mark      Grade");
            }

            printDetails(name, finalMark, grade);
        }

        input.close();
    }
}