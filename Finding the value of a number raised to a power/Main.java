import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int expo = in.nextInt();
        int b = base;
      while(expo>1)
      {
        base = base*b;
        expo--;
      }
      System.out.println(base);
      
    }
}