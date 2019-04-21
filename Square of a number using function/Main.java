import java.util.Scanner;
class Main
{
  public static void Square(int a)
  {
    int Sq=0;
   int  sq= a*a;
    System.out.println(sq);
  }
	public static void main (String[] args)
    {
	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Square(n);
	} 
}