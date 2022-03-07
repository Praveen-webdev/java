package Association;

public class Vehicle {
    String model;
    int manufacturingYear;
    Driver driver; // Vehicle owns a driver
    //* Compostite association if vehicle class ends Driver object ceased
    public Vehicle(String model,int manufacturingYear,Driver driver){
        this.model=model;
        this.manufacturingYear=manufacturingYear;
        this.driver=driver; // assigning this driver to the giver driver object ;
    }

    public void status(){
        System.out.println(model+" , manufactured in "+manufacturingYear+" driven by "+driver.toString());
    }


   public  void accelarate(){
        System.out.println("accelerating... "+model);
    }
    void brake(){
        System.out.println("applying brakes... for"+model);
    }
   public void turbo(){
        System.out.println( "Turning on turbo...");
    }
}
