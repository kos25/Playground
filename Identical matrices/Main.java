import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r =in.nextInt();
    int c = in.nextInt();
    int arr1[][]= new int[r][c];
    int arr2[][]= new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {arr1[i][j]=in.nextInt();}
    }
     for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {arr2[i][j]=in.nextInt();}
    }
    int flag =1;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(arr1[i][j] != arr2[i][j])
        {flag=0;
        break;}
      }
    }
    if(flag==1)
      System.out.println("Yes");
      else
        System.out.println("No");
  }
}