import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n =in.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {arr[i]=in.nextInt();}
     int max1 =0; 
    int max =0;
    int count =0;
    for(int i =0;i<n;i++)
    {
      if(arr[i]==0)
      { count=0;
      }
       
      if(arr[i]==1)
      max1 =count;
      count++;
      if(max1>max)
      max=max1;
    }
    System.out.println(max+1);
  }
}