package zoho.Round3;

public class Cart {
 double quantity;
  public int id;
  String productName;
   double price;

  public  Cart(String name,int id,double quantity,double price){
      this.productName=name;
      this.id=id;
      this.quantity=quantity;
      this.price=price;
  }
  public double getTotal(){
     return quantity*price;
  }
}
