import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
    Scanner in= new Scanner(System.in);
     int n = in.nextInt();
      int Arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
        Arr[i]=in.nextInt();
      }
      int p=1;
     
     while(p<=n)
     {
        int flag =0;
       for( int i=0;i<n;i++)
       {
         if(p==Arr[i])
         {
           flag =1;
           break;
         }
       }
       if(flag==0)
         System.out.print(p);
       p++;
     }
      
    }
}