import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n;i++)
    {arr[i]=in.nextInt();}
    int max1=0;
    int max =0;
    int idx=0;
    for(int i=0;i<n;i++)
    { int count=0;
      int ch = arr[i];
      for(int j=0;j<n;j++)
      { //System.out.print(arr[j]);
        if(ch==arr[j])
           count++;
      }
        max1 =count;
        if(max<max1)
        {
          max = max1;
          idx =i;
        }
    }
   

    System.out.print(arr[idx]);

   // System.out.print(arr[0]);
    
  }
}