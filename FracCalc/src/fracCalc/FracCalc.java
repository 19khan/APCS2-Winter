package fracCalc;
import java.util.*;

public class FracCalc {
	
    public static void main(String[] args){
    	
    	Scanner userInput = new Scanner (System.in);
		System.out.println("Give equation");
    	String inputEquation = userInput.nextLine();

    	
    	if (!inputEquation.equals("quit")){
    		System.out.println(produceAnswer(inputEquation));
    	}
    	while (!inputEquation.equals("quit")){
    		System.out.println("Give equation");
    		inputEquation = userInput.nextLine();
    		System.out.println(produceAnswer(inputEquation));
    		if (inputEquation.equals("quit")){
    			break;
    		}
    	}

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
    public static String produceAnswer(String equation){ 
        // TODO: Implement this function to produce the solution to the input
        String [] inputSplit = equation.split (" ");
        String equation1 = inputSplit[0];
        String operant = inputSplit[1];
        String equation2 = inputSplit[2];    	
        
        String wholeNum1 = "";
        String frac1 = "";
        String [] equation1Split = equation1.split("_");
        if (equation1Split.length <=1
        		&& Arrays.toString(equation1Split).indexOf("/") >0){
        	wholeNum1 = "0";
        	frac1 = equation1Split[0];
        }else if (equation1Split.length <=1){
        	wholeNum1 = equation1Split[0];
        	frac1 = equation1Split[0];
        }else{
        	wholeNum1 = (equation1Split[0]);
        	frac1 = equation1Split[1];
        }
        
        String [] equation2Split = equation2.split("_");
        String wholeNum2 = "";
        String frac2 = "";
        if (equation2Split.length <=1
        		&& Arrays.toString(equation2Split).indexOf("/") >0){
        	wholeNum2 = "0";
        	frac2 = equation2Split[0];
        }else if (equation2Split.length <=1){
        	wholeNum2 = equation2Split[0];
        	frac2 = equation2Split[0];
        }else{
        	wholeNum2 = (equation2Split[0]);
        	frac2 = equation2Split[1];
        }
        
        String numerator1 = "";
        String denominator1 = "";
        String [] frac1Split = frac1.split("/");
        if (frac1Split.length <=1){
        	numerator1 = "0";
        	denominator1 = "1";
        }else{
        	numerator1 = frac1Split[0];
        	denominator1 = frac1Split[1];
        }
        
        String numerator2 = "";
        String denominator2 = "";
        String [] frac2Split = frac2.split("/");
        if (frac2Split.length <=1){
        	numerator2 = "0";
        	denominator2 = "1";
        }else{
        	numerator2 = frac2Split[0];
        	denominator2 = frac2Split[1];
        }
        
        if (operant == "+"){
        
        }else if (operant == "-"){
        	
        }else if (operant == "*"){
        	
        }else if (operant == "/"){
        	
        }
        return ("whole:" +wholeNum2+ " numerator:" +numerator2+ " denominator:" +denominator2);
    }
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
