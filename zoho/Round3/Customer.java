package zoho.Round3;

import java.util.*;

public class Customer {
    static int ID = 1;
    private int id = ID;
    String name;
    String phoneNo;
    int billNos = 0;
    ArrayList<Bill> bills = new ArrayList<>();

    Customer(String name, String ph) {
        this.name = name;
        this.phoneNo = ph;
        ID++;
    }

    public int getId() {
        return id;
    }

    public void print() {
        System.out.println(name + "\t\t" + getId() + "\t\t" + phoneNo + "\t\t" + billNos);
    }

    public void getBills() {
        System.out.println("---CUSTOMER DETAILS---");
        System.out.println("Name\t\t Id\t\tPhone.no\t\tNo. of bills\t\t");
        print();
        System.out.println();
        System.out.println("--- CUSTOMER BILLS---");
        System.out.println("Item-Id\t\tItem name\t\t" + "Price\t\t" + "Quantity\t\tSub-total");
        for (Bill bill : bills) {
            bill.printBills();
        }
    }
}
