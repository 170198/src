import java.util.Scanner;

public class JavaCalculator 
{

    public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Please enter an integer: ");
	    int num1 = input.nextInt();
	    
	    System.out.println("Please enter operand: ");
	    String opr = input.next();
	    
	    System.out.println("Please enter another integer: ");
	    int num2= input.nextInt();
	    
	    if (opr.equals("+"))
	    {  
	        System.out.println("Your answer is " + (num1 + num2));
	    }
	    else if (opr.equals("/"))
	    {  
	        System.out.println("Your answer is " + (num1 / num2));
	    }
	    else if (opr.equals("*"))
	    {  
	        System.out.println("Your answer is " + (num1 * num2));
	    }
	    else if (opr.equals("-"))
	    {  
	        System.out.println("Your answer is " + (num1 - num2));
	    }
	    input.close();
    } 
} 