import java.util.Scanner;
class Main{
    public static void main(String args[]){
         Scanner in = new Scanner(System.in);
      String str = new String();
      str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int l = sb.length();
      int stat[] = new int[26];
      for(int i =0;i<26;i++)
      {stat[i]=0;}
      for(int i=0;i<l;i++)
      {
        if( sb.charAt(i)>='a'&& sb.charAt(i)<='z')
        {
          int off = str.charAt(i)-'a';
          stat[off]++;
        }
        else if( sb.charAt(i)>='A'&& sb.charAt(i)<='Z')
        {int off=str.charAt(i)-'A';
        stat[off]++;}
      }
      for(int i=0;i<26;i++)
      {
        if(stat[i]==0)
        { 
          char ch =(char)(i+'a');
          System.out.print(ch +" ");}
        
      }
    }
}