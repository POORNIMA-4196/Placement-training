/*  ✅ Problem Title: Fibonacci Number
    📄 One-line Description: Return the nth Fibonacci number using recursion (0-based indexing).
    
    💡 Approach: Simple recursion
    ⏰ Time Complexity: O(2^n)
    🧠 Space Complexity: O(n) — Recursion stack space */

public class ID509{
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fib(n - 1);      
        int slast = fib(n - 2);    
        return last + slast;        
    }
    public static void main(String args[])
    {
        int n=6;
        System.out.println(fib( n));
    }
}