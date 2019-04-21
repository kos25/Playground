import java.util.Scanner;
class Main
  {
  public static int expo(int a , int b)
  {
    int va=1;
    for( int i =1; i<=b; i++)
    {
      va= va*a;
    }
    return va;
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b= in.nextInt();
    int value = expo(a,b);
    System.out.println(value);
    }
}