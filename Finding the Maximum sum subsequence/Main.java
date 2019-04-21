import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    for(int i=0;i<arr_size;i++)
    {arr[i]=in.nextInt();}
    int sql[]= new int[2*arr_size];
    int start_idx=0;
    int sql_idx=0;
    for(int i=0;i<arr_size-1;i++)
    {
      if(arr[i]>arr[i+1])
      {
        sql[sql_idx]=start_idx;
        sql_idx++;
        sql[sql_idx]=i;
        sql_idx++;
        start_idx=i+1;
     }
         
    }
   
    if(start_idx!=arr_size-1)
    {
      sql[sql_idx]=start_idx;
      sql_idx++;
      sql[sql_idx]=arr_size-1;
      sql_idx++;
    }
    if(start_idx==arr_size-1)
    {
      sql[sql_idx]=start_idx;
      sql_idx++;
      sql[sql_idx]=arr_size-1;
      sql_idx++;
    }
     //for(int j=0;j<2*arr_size-1;j++)
    //{System.out.print(sql[j]);}
    int max =0;
         
     for(int i=0;i<sql_idx-1;i+=2)
     {
       start_idx=sql[i];
       //System.out.print(start_idx);
       int end =sql[i+1];
      // System.out.print(end);
         int sum =0;

       for(int j=start_idx;j<=end;j++)
       {sum =sum +arr[j];}
       if(sum>max)
         max=sum;
     }
    System.out.print(max);
   
  
  }
}