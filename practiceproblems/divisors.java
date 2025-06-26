public class divisors {
    public static  int div(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {  
                count++;
            System.out.println(i); 
            }
           
           
        }
        return count;
    }
    public static void main(String args[])
    {
        int a=12;
        System.out.println(div(a));
    }
}
