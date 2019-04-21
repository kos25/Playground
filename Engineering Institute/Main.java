 import  java.util.Scanner;

class Faculty
{
   int salary;
  Faculty(int salary)
  {this.salary=salary;}
  public void salary()
  {
    System.out.println("Base Salary: " + salary);
  }
}
class CSE
{
   int cs=0;
  public void salary( int s)
  { 
    cs = s+3000;
    System.out.println("CSE Faculty: " + cs);
  }
}
class IT
{ int is=0;
  public void salary( int s)
  {
    is = s+5000;
 System.out.println("IT Faculty: " + is);
  }
}
class ECE
{
  int es=0;
  public void salary(int s)
  {
    es=s+4500;
  System.out.println("ECE Faculty: " + es);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
      int s = sc.nextInt();
      Faculty obj1 = new Faculty(s);
      CSE obj2= new CSE();
      IT obj3= new IT();
      ECE obj4 = new ECE();
       obj1.salary();
       obj2.salary(s);
       obj3.salary(s);
       obj4.salary(s);
  }
}