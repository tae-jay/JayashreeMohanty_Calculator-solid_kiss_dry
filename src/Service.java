
public class Service {
	

		 public static double result (char o)
		{

		double first=Data.getx();
		double second=Data.gety();
		switch(o)
		{
		    case '+':
		        return (double)first + second;
		      
		    case '-':
		        return (double)first - second;

		    case '*':
		        return (double)first * second;
		    case '/':
		        return (double)first / second;
		    default:
		      throw new IllegalStateException();
		}

			 	
		}

		 
		
}
