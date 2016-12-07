//APCS2 Kevin Han

package fracCalc;
import java.util.*;

public class FracCalc {
	
    public static void main(String[] args){
    	
    	Scanner userInput = new Scanner (System.in);		
		System.out.println("Give expression");		//prompt scanner
    	String inputExpression = userInput.nextLine();		//set next line of string as inputExpression

    	//set up first "round" of calculation before "quit' is called
    	if (!inputExpression.equals("quit")){
    		System.out.println(produceAnswer(inputExpression));
    	}
    	//while loop to have the calculator running until "quit" is called
    	while (!inputExpression.equals("quit")){		//if imputExpression is not "quit" keep asking for more expressions
    		System.out.println("");
    		System.out.println("Give new expression");
    		inputExpression = userInput.nextLine();
    		if (inputExpression.equals("quit")){		//if "quit" is inputed, terminate program
    			break;
    		}
    		System.out.println(produceAnswer(inputExpression));
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
    public static String produceAnswer(String expression){ 
        // TODO: Implement this function to produce the solution to the input
        //splitting equation by " ".
    	
    	String [] operandsAndOperator = new String [3];
    	parseInput (expression, operandsAndOperator);		//parse the input expression
    	
    	String frac1 = operandsAndOperator[0];
    	String operator = operandsAndOperator[1];
    	String frac2 = operandsAndOperator[2];
    	
    	int [] frac1Elements = new int [2];
    	parseOperands(frac1, frac1Elements);		//use separated operands and parseOperands method to split each element into 2 different array.
    	
    	int [] frac2Elements = new int [2];
    	parseOperands(frac2, frac2Elements);
    	
    	int [] fracAnswer = new int [2];		//an array that will be containing the answer in a improper fraction.
    	if (operator.equals("+")		//use multiples of else if statements to check the operator and call to appropriate method
    		|| operator.equals("-")){		//+ and - practically have same process, so use addFrac for both.
    		addFrac (frac1Elements, frac2Elements, operator, fracAnswer);
    		
    	}else if (operator.equals("*")){
    		multiplyFrac (frac1Elements, frac2Elements, fracAnswer);
    	
    	}else if (operator.equals("/")){
    		divideFrac (frac1Elements, frac2Elements, fracAnswer);
    	}
    	
    	return finalAnswer(fracAnswer);	//return answer from the operations above
    }
    
    public static void parseInput (String userInput, String [] operands){
    	String [] inputSplit = userInput.split(" ");		//split using " " in order to separate the operands and the operators
    	for (int i = 0; i < 3; i++){
    		operands[i] = inputSplit[i];		//index 0 is first operand, index 1 is operator, index 2 is second operand
    	}
    }
    
    public static void parseOperands (String operand, int [] elements){
    	String fraction = "";
    	int whole;
    	int numerator;
    	int denominator;
    	String [] operandSplit = operand.split("_");		//split operand using "_" in order to separate whole number.
    	if (operandSplit.length <= 1		//instances where the whole number doesn't exist
    			&& Arrays.toString(operandSplit).indexOf("/") > 0){		//but the fraction exists
    		whole = 0;
    		fraction = operandSplit[0];
    	}else if (operandSplit.length <= 1){		//if the whole number exists
    		whole = Integer.parseInt(operandSplit[0]);		//use Integer.parseInt to turn "number" into an real usable number
    		fraction = operandSplit[0];
    	}else{
    		whole = Integer.parseInt(operandSplit[0]);		//otherwise, whole number will be index of 0 and the rest index of 1
    		fraction = operandSplit[1];
    	}
    	
    	String [] fractionSplit = fraction.split("/");		//split the fraction, without the whole number using "/" to separate the numerator
        if (fractionSplit.length <= 1){		//if there is no "/", or the fraction is nonexistent, automatically set numerator to 0 and denominator to 1
        	numerator = 0;
        	denominator = 1;
        }else{
        	numerator = Integer.parseInt(fractionSplit[0]);		//otherwise, index 0 will be numerator, and index 1 will be denominator.
        	denominator = Integer.parseInt(fractionSplit[1]);
        }
        toImproperFrac (whole, numerator, denominator, elements, operand);		//use toImproperFrac to turn the mixed fraction into a easier-to-operate improper fraction
    }
    
    public static void addFrac (int [] frac1, int [] frac2, String operator, int [] answer){
    	int newFrac1Numerator;
    	int newDenominator;
    	int newFrac2Numerator;
    	
    	if (operator.equals("-")){		//if the operator is "-" instead of "+"
    		frac2[0] = frac2[0]*(-1);		//multiply -1 to the numerator of the second fraction to compensate
    	}
    	
    	if (frac1[1] == frac2[1]){		//in addition/subtraction, the denominator must be same.
    		answer[0] = frac1[0] + frac2[0];
    		answer[1] = frac1[1];
    	}else{		//if denominators are different, just multiply the denominator of both sides and multiply accordingly to the numerator.
    		newFrac1Numerator = frac1[0] * frac2[1];
    		newDenominator = frac1[1] * frac2[1];
    		
    		newFrac2Numerator = frac2[0] * frac1[1];
    		
    		answer[0] = newFrac1Numerator + newFrac2Numerator;		//once the denominators are equal, the numerators can be easily added.
    		answer[1] = newDenominator;
    	}
    }
    
    public static void multiplyFrac (int [] frac1, int [] frac2, int [] answer){
    	int newNumerator = frac1[0] * frac2[0];		//multiply top and bottom.
    	int newDenominator = frac1[1] * frac2[1];
    	
    	answer[0] = newNumerator;
    	answer[1] = newDenominator;
    }
    
    public static void divideFrac (int [] frac1, int [] frac2, int [] answer){
    	int newNumerator = frac1[0] * frac2[1];		//same as multiplyFrac, except that we must find the reciprocal of the second operand.
    	int newDenominator = frac1[1] * frac2[0];		//multiply numerator to denominator, denominator to numerator... same thing as multiplying reciprocal
    	
    	answer[0] = newNumerator;
    	answer[1] = newDenominator;
    }
    
    public static void toImproperFrac(int whole, int numerator, int denominator, int [] elementsTemp, String fraction){
    	if (whole > 0
    			&& fraction.indexOf("_") < 0){		//if whole number does not exist, no need to calculate new numerator.
    		elementsTemp [0] = whole;
    		elementsTemp [1] = 1;
    	}else if (whole == 0
    			&& fraction.indexOf("_") > 0){
    		elementsTemp [0] = numerator;
    		elementsTemp [1] = denominator;
    	}else if (whole <0
    			&& fraction.indexOf("_") > 0){
    		elementsTemp [0] = whole*denominator + numerator*-1;		//new numerator will be the whole * denominator + numerator
    		elementsTemp [1] = denominator;    	
    	}else {
    		int newNumerator = whole*denominator + numerator;
    		elementsTemp [0] = newNumerator;
    		elementsTemp [1] = denominator;
    	}
    }
    
    public static String finalAnswer (int [] improperAnswer){		//used to turn arrays of information from operation methods into usable string answers.
    	int whole;
    	int denominator = improperAnswer[1];
    	int numerator = improperAnswer[0];
    	
    	if (denominator<0
    			&& numerator<0){		//instances when both numerator and denominator are negative
    		denominator = denominator *-1;		//the negatives cancel out.
    		numerator = numerator * -1;
    	}else if (denominator<0
    			&& numerator >0){		//instances when the denominator is negative but numerator is positive
    		denominator = denominator * -1;		//the negative on the denominator must be moved to the numerator
    		numerator = numerator *-1;
    	}

    	int newNumerator = numerator%denominator;
    	whole = numerator/denominator;		//calculate new whole number
    	
    	
    	int gcf;
    	if (numerator<0){
    		gcf = gcf (numerator*-1, denominator);		//use method gcf to find the gcf so it can be used to simplify the fraction.
    	}else{
    		gcf = gcf (numerator, denominator);
    	}
    	int finalNumerator = newNumerator/gcf;		//process of simplifying using gcf
    	int finalDenominator = denominator/gcf;
    	
    	if (finalNumerator == 0		//series of if else statements that tests for all possible combination of whole, numerator and denominators that my alter the format in which the answer needs to be in
    			&& whole != 0){		//when whole number exists but no fraction/ fraction equals 0
    		return (""+whole);
    	}else if (whole <0
    			&& finalNumerator <0){		//when both whole number and numerator are negative
    		finalNumerator = finalNumerator*-1;		//only the whole number should have the negative sign.
    		return (whole+"_"+ finalNumerator+"/"+finalDenominator);
    	}else if (whole == 0		//when the whole number is 0 but fraction exists.
    			&& finalNumerator != 0){
    		return (finalNumerator + "/" + finalDenominator);
    	}else if (whole == 0		//when both the whole number and numerator are zero.
    			&& finalNumerator == 0){
    		return ("0");
    	}
    	else{		//all other cases
    		return (whole+ "_" + finalNumerator+"/"+finalDenominator);
    	}
    } 
    
    //methods below are all used to find the gcf of the two denominators, which is then used to simplify the fraction.
    public static int gcf (int numerator, int denominator){
    	int gcf = 1;
    	int smallNum = (Math.min(numerator, denominator));
    	for (int i = 2; i <= smallNum; i++){
    		if (isDivisibleBy (numerator, i)==true
    				&& isDivisibleBy (denominator, i)){
    			gcf = i;
    		}
    	}
    	return gcf;
    }
    
    public static boolean isDivisibleBy (int a, int b){
    	if (a%b == 0){
    		return true;
    	}else {
    		return false;
    	}
    }
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
