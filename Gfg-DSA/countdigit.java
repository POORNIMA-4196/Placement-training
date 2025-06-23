

public class countdigit {
  
static int count(int n)
{
  int   cnt=0;
  while(n>0)
  {
    cnt=cnt+1;
    n=n/10;

  }
  return cnt;

}
    public static void main(String args[])
    {
        int n=1000;
        System.out.println("n:"+n);
        int digits=count(n);
        System.out.println(digits);


    }
}



