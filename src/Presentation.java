
import java.util.Scanner;


public class Presentation {
	
		public static void main(String args[]) {
		
			
			Scanner sc=new Scanner(System.in);		
			System.out.print("Enter two numbers");
			double x=sc.nextDouble();
			Data.setx(x);
			double y=sc.nextDouble();
			Data.sety(y);
			System.out.println("Enter the operation(+,-,/,*)");
			char o=sc.next().charAt(0);
				System.out.printf("Your outputs is:%f ",Service.result(o));
				sc.close();
	}
}