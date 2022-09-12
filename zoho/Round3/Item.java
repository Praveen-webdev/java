package zoho.Round3;

public class Item {
    static int Id=1;
  private  int itemId=Id;
    String name;
    double price;
    double quantity;
    public Item(String name ,double price,double quantity){
        this.price=price;
        this.name=name;
        this.quantity=quantity;
        Id++;
    }
    public  int getId(){
        return itemId;
    }
    
}
