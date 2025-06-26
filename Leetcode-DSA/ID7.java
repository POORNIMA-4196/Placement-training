/*  ✅ Problem Title: Fibonacci Number
    📄 One-line Description: Given a signed 32-bit integer x, return x with its digits reversed.
    
    💡 Approach: Digit Extraction
    ⏰ Time Complexity: O(log₁₀ N)
    🧠 Space Complexity: O(1)   */
public class ID7 {
   public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int last = x % 10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && last > 7))
                return 0;

            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && last < -8))
                return 0;

            rev = (rev * 10) + last;
            x = x / 10;
        }
        return rev;
    }  
}
