package com.epam.patterns;

interface StrategyDesignPattern 
{  
      
    public int calculation(int a, int b);  
}


class Multiply implements StrategyDesignPattern
{  
   
    public int calculation(int a, int b) 
    {  
        return a*b;  
    }  
  
}


class Subtraction  implements StrategyDesignPattern
{  
   
    public int calculation(int a, int b)
    {  
        return a-b;  
    }  
  
}


class Pattern {  
  
       private StrategyDesignPattern operation;  
       
       public Pattern(StrategyDesignPattern operation)
	{  
          this.operation = operation;  
     }  
  
       public int patternstrategy(int num1, int num2)
       {  
          return operation.calculation(num1, num2);  
       }  
}


public class StrategyPattern
{  
      
    public static void main(String[] args)  
    {  
            
          int first=20; 
          int second=10;  
          Pattern pattern1 = new Pattern(new Multiply());          
          System.out.println("Multiply = " + pattern1.patternstrategy(first,second));  
  	      Pattern pattern2 = new Pattern(new Subtraction());       
          System.out.println("Subtraction = " + pattern2.patternstrategy(first,second));  
  
          
       }  
  
}