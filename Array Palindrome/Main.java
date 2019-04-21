import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int Arr[]= new int[n];
        int rev[]= new int[n];
        for(int i=0;i<n;i++)
        {
        Arr[i]=in.nextInt();
        rev[i]=0;
        }
      int j =n-1;
        for(int i=0;i<n;i++)
        {
       
        rev[j]=Arr[i];
          j--;
       
        }
     // for(int i=0;i<n;i++)
     // {System.out.print(rev[i]);}
        
        if(Arrays.equals(Arr, rev)==true)
        System.out.println("Yes");
        else
         System.out.println("No");
        
    }
}