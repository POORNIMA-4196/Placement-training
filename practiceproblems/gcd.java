public class gcd{
    public static int g(int a, int b) {
       int gcdm=1;
     for(int i=1;i<=Math.min(a,b);i++)
     {
         if (a%i==0&&b%i==0)
         {
             gcdm=i;
         }
         
     }
    
    return gcdm;
}
public static void main(String args[])
{
System.out.println(g(20,28));
}
}