import java.util.Scanner;
public class Main{
  public static void GCD( int a, int b, int c)
  {
    int hcf=1;
    for( int i =1; i<=a; i++)
    {
      if(a%i==0 && b%i==0 && c%i==0)
        hcf=i;
    }
    System.out.println(hcf);
  }
	public static void main (String[] args)
	{
	  Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      GCD(n1,n2,n3);
            

      
      
      
	}
}