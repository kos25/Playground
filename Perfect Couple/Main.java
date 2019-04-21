import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int Arr[]= new int[n];
      for(int i =0;i<n;i++)
      {Arr[i]=in.nextInt();}
      int p =in.nextInt();
      int sum;
      for(int i =0;i<n;i++)
      {
        sum =0;
        for( int j=0;j<n;j++)
        {
          sum= Arr[i]+Arr[j];
          if(sum==p&& i<j)
          System.out.println( Arr[i] +", "+ Arr[j]);
        }
      }
    }
}