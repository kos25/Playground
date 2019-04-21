import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[]= new int[n];
    for( int i=0;i<n;i++)
    {arr[i]=in.nextInt();}
    perfect(arr,n);
  }
  public static void perfect( int arr[], int b)
  {
    boolean is_true =true;
    int sum = arr[0]+arr[1]+arr[2];
    int s2=0;
    for( int i =3;i<b;i=i+3)
    {
      s2= arr[i]+arr[i+1]+arr[i+2];
      if(sum!=s2)
        is_true=false;     
    }
    if(is_true==true)
      System.out.println("Perfect Batch");
    else
     System.out.println("Not a Perfect Batch"); 
 }
}