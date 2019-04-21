import java.util.Scanner;
class Main{
  public static int Sum(int a)
  {
    int m=0;
    for(int i =1; i<=a;i++)
    {
      m = m+i;
    }
   return(m);
  }
   
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int s=Sum(n);
      System.out.println(s);
                     
	}
}