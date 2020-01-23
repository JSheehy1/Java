//ProblSolving1Qd.java
/*Reading in large mathematical float values that are "too big" and yet getting no runtime exception
 *on the call to nextFloat()*/
 
 import java.util.Scanner;
 
 public class ProbSolving1Qd{
 	public static void main(String args[])
 	{			
 		float number;
 			
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Please enter a number: ");
 		number = input.nextFloat();
 		
 		/*100000000000000000000000000000000000000   - this number should be okay to fit in a float variable, it is 1E38 in Scientific Notation format
 		  500000000000000000000000000000000000000   - this number is too big to fit in a float variable, so the word 
 		                                            - "Infinity" gets displayed instead
 		                                            
 		  For further information see https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html#nextFloat() 
 		  
 		  and also https://stackoverflow.com/questions/20504712/storing-value-infinity-to-a-variable*/
 		                                            		                                        
 		
 		System.out.println("\nThe number you entered was " + number);		
 	}	
 }

