/*
Example:
a = 5;
b = 6;
c = a * 3 + b;
result = c ^ 2;
This program should print 441.
Details:
The program's valid constructs are as follows:
Variable = Expression;
X15 Interview Questions

X15 – X15 Interview Questions

Programming Exercises – 2

A Variable must match the regular expression (A-Za-z)+
An Expression can be: • Value, which is an integer matching the regular expression (1-9)(0-9)+
• Expression + Expression
• Expression - Expression
• Expression * Expression
• Expression / Expression
• Expression ^ Expression
• Variable
The final answer is the value assigned to the variable called result. If there is no variable called result, then
display an error:
Variable "result" not found.
*/

import java.util.HashMap;
import java.util.regex.*;  

public class calculator(){
  // make private hashmap string: int for storing variable values
  private HashMap<String, Integer> var_store = new HashMap<>();
  private static String letters = "[a-zA-Z]+";
  private static String digits = "[0-9]+";

  public Integer parse_expression(String exp, Integer start, Integer end){
    // if expression is a number, return it
    if (Pattern.matches(letters,exp)){
      return Integer.parseInt(exp);
    // if expression is variable, return var_map of it, after checking in varmap
    }else if (var_store.containsKey(exp)){
      return var_store.get(exp);
    }
    // else expression was not in varmap, return
    else{
      return null;
    }

  }

  // performs calculation on a single line
  public static Integer calculate(String input, Integer start, Integer end){
    // enforce order of operations, eg search for * and / first
    // then separate str on the operation, call parse on left and right
    if (input.indexOf('^') > -1){
      //int temp = parse_expression(input,) find a space before the letter? but what about if there is no space, eg example?
    if (input.indexOf('*') > -1){
      return calculate(input,start,input.indexOf('*')-1) * calculate(input,input.indexOf('*')+1,end); 
    }else if (input.indexOf('/') > -1){
      return calculate(input,start,input.indexOf('/')-1) * calculate(input,input.indexOf('/')+1,end);
    }else if (input.indexOf('+') > -1){
      return calculate(input,start,input.indexOf('/')-1) * calculate(input,input.indexOf('/')+1,end);
    }else if (input.indexOf('-') > -1){
      return calculate(input,start,input.indexOf('/')-1) * calculate(input,input.indexOf('/')+1,end);
    }
    /* Attempting to divide by zero 
        try { 
            int c = a / b; 
        } 
        catch (ArithmeticException e) { 
            e.printStackTrace(); 
        } 
        */
    




  }
  public static int main(String[] args){
    // call calculate
    // todo: if no result, return error
    // save the name part, call calc on part after equals
    // read file here
    for (int i = 0; i < input.length(); i++){
      if (input[i].indexOf('=') > -1){
        String var_name = input[i].substring(0,input.indexOf('=')).trim();
        var_store.put(var_name, calculate(input[i].substring.... ))
      }else{
        throw new RuntimeException("Invalid line, no equal sign found."); // what about multiple equals
      }
    }
    

  }




}

/* tests
divide by zero

assumptions:
spaces between vars and operations
*/