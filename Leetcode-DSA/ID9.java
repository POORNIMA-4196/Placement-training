/*  ✅ Problem Title: Palindrome
    📄 One-line Description: Given a signed 32-bit integer x, return true if is palindrome.
    
    💡 Approach: Digit reversal
    ⏰ Time Complexity: O(log₁₀ N)
    🧠 Space Complexity: O(1)   */
    public class ID9 {
   public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int rev=0;
        int n=x;
        while(x!=0)
        {
            int last=x%10;
           

            rev=rev*10+last;
            x=x/10;

        }
        return rev==n;
    }
}
