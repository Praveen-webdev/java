package zoho.Round3;

import java.util.*;

public class App {
    public static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Item> items = new ArrayList<>();

        boolean end = false;
        while (!end) {
            System.out.println("Press 1 :CREATE new customer");
            System.out.println("Press 2 :CREATE items");
            System.out.println("Press 3 :CREATE bill");
            System.out.println("Press 4 :GET customers list");
            System.out.println("Press 5 :GET Item list");
            System.out.println("Press 6 :GET bills of customer");
            int input = Integer.parseInt(in.nextLine());
            switch (input) {
                case 1:
                    System.out.println("Enter Name");
                    String name = in.nextLine();
                    System.out.println("Enter phone number");
                    String ph = in.nextLine();
                    Customer newCustomer = new Customer(name, ph);
                    System.out
                            .println("Customer - " + name + " successfully created with ID of " + newCustomer.getId());
                    customers.add(newCustomer);
                    break;
                case 2:
                    System.out.println("Enter product name");
                    String prodName = in.nextLine();
                    System.out.println("Enter price of the product");
                    double price = Double.parseDouble(in.nextLine());
                    System.out.println("Enter Quantity of the product");
                    double quantity = Double.parseDouble(in.nextLine());
                    Item newItem = new Item(prodName, price, quantity);
                    items.add(newItem);
                    System.out.println("Product - " + newItem.name);
                    System.out.println("Total quantity - " + newItem.quantity);
                    System.out.println("Price  - " + newItem.price);
                    break;
                case 3:
                    System.out.println("Enter customer ID");
                    int id = Integer.parseInt(in.nextLine());
                    Bill newBill = new Bill();
                    Customer currentCustomer = null;
                    currentCustomer=findCustomer(customers, id);
                    newBill.setCustomer(currentCustomer);
                    if (newBill.currentCustomer == null) {
                        System.out.println("Customer not found!");
                        break;
                    }
                    try {
                        boolean purchase = true;
                        while (purchase) {
                            printInventory(items);
                            System.out.println("Enter: 1 to sell item , 2 to checkout");
                            int purchase_preference = Integer.parseInt(in.nextLine());
                            switch (purchase_preference) {
                                case 1:
                                    Item currentItem = null;
                                    System.out.println("Enter item id : ");
                                    int itemId = Integer.parseInt(in.nextLine());
                                    for (Item item : items) {
                                        if (item.getId() == itemId) {
                                            currentItem = item;
                                        }
                                    }
                                    if (currentItem != null) {
                                        newBill.createCart(currentItem, in);
                                    } else {
                                        System.out.println("Invalid item id!");
                                    }
                                    break;
                                case 2:
                                    if(!newBill.items.isEmpty()){
                                    newBill.print();
                                    currentCustomer.bills.add(newBill);
                                    currentCustomer.billNos++;
                                    purchase = false;
                                    }else{
                                        System.out.println("Cart is empty");
                                    }
                                    break;
                                default:
                                    System.out.println("Enter valid input!");
                                    break;
                            }
                        }
                    } catch (Error err) {
                        System.out.println("Error");
                    }
                    break;
                case 4:
                printCustomer(customers);
                break;
                case 5:
                printInventory(items);
                break;
                case 6:
                System.out.println("Enter customer ID");
                int customerId = Integer.parseInt(in.nextLine());
                fetchBills(findCustomer(customers, customerId));
                break;
                default:
                    System.out.println("Enter valid input");
                    break;
            }
        }
        in.close();
    }
    private static void printInventory(ArrayList<Item> items){
        System.out.println("------Current inventory------");
                            System.out.println("Name:\t\tID\t\tPrice:\t\tQuantity:");
                            for (Item item : items) { // printing inventory
                                System.out.println(
                                        item.name + "\t\t" + item.getId() + "\t\t" + item.price + "\t\t"
                                                + item.quantity);
                            }
                            System.out.println();
    }
    private static Customer findCustomer(ArrayList<Customer> customers,int id){
        for (Customer customer : customers) { // finding customer
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
    private static void printCustomer(ArrayList<Customer> customers){
        System.out.println("---CUSTOMERS LIST---");
        System.out.println("Name\t\t Id\t\tPhone.no\t\tNo. of bills\t\t");
        for (Customer customer : customers) { // finding customer
            customer.print();
        }
        System.out.println();
    }
    private static void fetchBills(Customer customer){
        if(customer==null){
            System.out.println("Invalid customer id");
        }else{
            customer.getBills();
        }
    }

}
