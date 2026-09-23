import java.util.Scanner;

public class IT26101939Lab09Q1 {
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

        
     	System.out.print("Enter a: ");
        double a = input.nextDouble();
		
		System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();
		
		
        double x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        
        System.out.println("x = " + x);

        input.close();
    }

}
		
		
	
	
		

