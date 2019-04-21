import java.util.Scanner;
class Main{
    public static void main(String args[])
    { int temp=0;
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[]= new int[n];
      for(int i=0;i<n;i++)
      {arr[i]=in.nextInt();}
     int k= in.nextInt();
      for(int i=0;i<n;i++)
      {
        for( int j=i+1;j<n;j++)
        {
          if (arr[i] < arr[j])
          {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
      }
     //for(int i=0;i<n;i++)
     System.out.println(arr[k-1]);
    }   
}