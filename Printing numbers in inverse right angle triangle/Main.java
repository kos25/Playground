import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int num=n ;
    for(int i =1 ; i<=n; i++)
    { 
      for( int j =1 ; j<=n-i+1; j++)
      {
        
        System.out.print(num);
       num--;
      }
      num= n-i;
      System.out.print("\n");
    }
                          
  }
}