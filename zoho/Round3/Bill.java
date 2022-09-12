package zoho.Round3;

import java.util.*;

public class Bill {
    static int id = 1;
    int billId = id;
    Customer currentCustomer = null;
    ArrayList<Cart> items = new ArrayList<>();
    int total;

    public void setCustomer(Customer cst) {
        currentCustomer = cst;
    }

    public void createCart(Item item, Scanner sc) {
        while (true) {
            System.out.println("Enter quantity: ");
            int qty = Integer.parseInt(sc.nextLine());
            if (qty <= item.quantity) {
                Cart newCart = new Cart(item.name, item.getId(), qty, item.price);
                items.add(newCart);
                total += newCart.getTotal();
                item.quantity -= qty;
                System.out.println("Item successfully added to cart!");

                break;
            } else {
                System.out.println("Invalid quantitiy,Try again!");
            }
        }
    }

    public void print() {
        System.out.println("Customer name : " + currentCustomer.name);
        System.out.println("Bill number : " + billId);
        System.out.println("Item-Id\t\tItem name\t\t" + "Price\t\t" + "Quantity\t\tSub-total");
        for (Cart item : items) {
            System.out.println(item.id + "\t\t" + item.productName + "\t\t" + item.price + "\t\t" + item.quantity
                    + "\t\t" + item.getTotal());
        }
        System.out.println("Checkout price : " + total);
    }

    public void printBills() {
        System.out.println("___  Bill number : " + billId + "  ____");
        for (Cart item : items) {
            System.out.println(item.id + "\t\t" + item.productName + "\t\t" + item.quantity + "\t\t" + item.quantity
                    + "\t\t" + item.getTotal());
        }
        System.out.println("Checkout price : " + total);
        System.out.println();
    }

}
