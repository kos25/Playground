import java.util.Scanner;
class Main{
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
       int n = in.nextInt();
    int arr[]= new int[n];
      for( int i=0;i<n;i++)
      {arr[i]= in.nextInt();}
      get_zero(arr,n);
      for( int i=0;i<n;i++)
      {System.out.print(arr[i] + " ");}
      }
  public static void get_zero(int arr[],int n)
  {
    int count=0;
    int temp;
    for( int i=0;i<n;i++)
    {
      if(arr[i]!=0)
    {
      temp= arr[i];
      arr[i]= arr[count];
      arr[count]=temp;
      count++;
    }
      else 
        arr[i]=0;
    }
  }
}