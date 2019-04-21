import java.util.Scanner;

class Item
{
  private int price;
  Item(int price)
  {this.price=price;}
  public  int getPrice()
  {
    return price;
  }
}
   
class Customer 
{
  private String product;
  private int quantity;
  Customer(String product , int quantity)
  {
    this.product=product;
    this.quantity=quantity;
  }
  public int getQuantity()
  {
    return  quantity;
  }

}

class Bill
{
  int amunt;
  Bill(int amunt)
  {
    this.amunt=amunt;
  }
  public void display()
  {
    System.out.println("Total Price is : "+amunt);
  }
  
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String pro = in.nextLine();
    int  pri=in.nextInt();
     int qan = in.nextInt();
    
    Item i = new Item(pri);
    Customer c = new Customer(pro,qan);
    int amunt = i.getPrice()*c.getQuantity();
    Bill obj = new Bill(amunt);
    obj.display();
    
     
  }
}