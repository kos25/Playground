import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {arr[i]= in.nextInt();}
    index(arr,n);
  }
  public static void index( int arr[] , int n)
  {
    int max_index=0;
    int lg=arr[0];
    for(int i=0;i<n;i++)
    {
      if(lg<arr[i])
        lg=arr[i];
      
    }
  for(int i=0;i<n;i++)
  {
    if(lg==arr[i])
      max_index=i;
  }
     System.out.println(max_index);
  }

}