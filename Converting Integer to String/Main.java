import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count =0;
    int temp =n;
    if(n<0)
    {
      n = n*(-1);
      while(n>0)
      {
        count++;
          n = n/10;
      }
      }
      if(n>0)
      {
         while(n>0)
      {
        count++;
          n = n/10;
      }
        
      }
    int t=count;
    char str[] = new char[count];
    count = count -1;
    if(temp<0)
    {
      temp = temp *(-1);
      while(temp>0)
      {   
        int rev = temp%10;
        char ch = (char)(rev +'0');
        str[count]=ch;
        temp /= 10;
        --count;
        
      }
    
      System.out.print("-");
      System.out.print(str);
    }
       if(temp>0)
    {
      //temp = temp *(-1);
      while(temp>0)
      {   
        int rev = temp%10;
        char ch = (char)(rev +'0');
        str[count]=ch;
        temp /= 10;
        --count;
        
      }
         // for(int i=0;i<t;i++)
      System.out.print(str);
    }
      
        
  }
}