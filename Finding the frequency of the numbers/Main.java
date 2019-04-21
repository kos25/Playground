import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int Arr[]= new int[n];
      for(int i=0;i<n;i++)
      {Arr[i]=in.nextInt();}
      int frq[] = new int[k];
    
      for(int i=1;i<=k;i++)
      {  
        int count =0;
        for(int j=0;j<n;j++)
        {
          if(i==Arr[j])
            count++;
        }
        frq[i-1]=count;
      }
      for(int i=0;i<k;i++)
      { System.out.println(i+1+" "+ frq[i]);}
      
    }
}