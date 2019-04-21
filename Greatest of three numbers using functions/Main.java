import java.util.Scanner;
class Main{
  public static void great( int a, int b , int c)
  {
    if(a>b && a>c)
      System.out.println(a);
    else if (b>a && b>c)
      System.out.println(b);
    else
       System.out.println(c);
  }
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      great(n1,n2,n3);
	}
}