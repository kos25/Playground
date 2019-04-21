import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[]=new int[5];
      int j = -1;
        int k= -1;
       for(int i =0;i<arr_size; i++)
       {
         arr[i]= in.nextInt();
       }
       int element_1_index = in.nextInt();
       int element_2_index = in.nextInt();
      for( int i =0;i<arr_size; i++)
      {
        if(arr[i]==element_1_index)
        j =i;
       // else if(
           //System.out.println(-1);
      }
      for( int i =0;i<arr_size; i++)
      {
        if(arr[i]==element_2_index)
           k =i;
       // else
          // System.out.println(-1);
      }
         System.out.println(j);
         System.out.println(k);
      
      
    }
}