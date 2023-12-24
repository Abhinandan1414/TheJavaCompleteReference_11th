package Playground.Calculator;

public class Calculator {
    int a, b, result;
    public Calculator(int x, int y)
    {
        a = x;
        b = y;
        result = 0;
    }
    public int sum()
    {
        return a+b;
    } 
     public int sub()
    {
        return a-b;
    } 
     public int mul()
    {
        return a*b;
    } 
     public int div()
    {
        return a/b;
    } 
    
}
