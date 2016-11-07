package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args){
    	
    	Scanner userInput = new Scanner (System.in);
    	String inputEquation = userInput.nextLine();
    	
    	System.out.print (produceAnswer (inputEquation));
    	// TODO: Read the input from the user and call produceAnswer with an equation

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String equation)
    { 
        // TODO: Implement this function to produce the solution to the input
        String [] inputSplit = equation.split (" ");
        String equation1 = inputSplit[0];
        String operant = inputSplit[1];
        String equation2 = inputSplit[2];
        
        String [] equation1Split = equation1.split("_");
        int wholeNum1 = Integer.parseInt(equation1Split[0]);
        String frac1 = equation1Split[1];
        String [] equation2Split = equation2.split("_");
        int wholeNum2 = Integer.parseInt(equation2Split[0]);
        String frac2 = equation2Split[1];
        
        String [] frac1Split = frac1.split("/");
        int numerator1 = Integer.parseInt(frac1Split[0]);
        int denominator1 = Integer.parseInt(frac1Split[1]);
        String [] frac2Split = frac2.split("/");
        int numerator2 = Integer.parseInt(frac2Split[0]);
        int denominator2 = Integer.parseInt(frac2Split[1]);
        
        return equation2;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
