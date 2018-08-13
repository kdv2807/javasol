package calculator;
import java.util.Scanner;
class CalculatorApp   {
   public static void main(String[] args) 
   {
           int num1,num2,res=0;
   Scanner numbers = new Scanner(System.in);
      Scanner operator = new Scanner(System.in);
      
       String op;
   System.out.println("Enter the 1st number");
   num1 = numbers.nextInt();
   assert(num1>0):"The number should be greater than 0.";
   System.out.println("Enter the 2nd number");
    
   num2 = numbers.nextInt();
    assert(num2>0):"The number should be greater than 0.";
   System.out.println("enter the operator");
   op = operator.nextLine();
   assert((op.equals("+"))||(op.equals("-"))||(op.equals("*"))||(op.equals("/"))):"The operator is not valid.";
   if(op.equals("+"))
   {
   res=num1+num2;
  }
   else if (op.equals("-"))
   {
   if(num1>num2)
   res=num1-num2;
   else
   res=num2-num1;
    }
   
    else if(op.equals("*"))
    {
    res=num1*num2;
    }
    else if(op.equals("/"))
    {
        res=num1/num2;	
       
    }
    else
     System.out.println("Wrong operator");
    System.out.println("The result is "+res);
    }
    
  }
