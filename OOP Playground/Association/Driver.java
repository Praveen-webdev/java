package Association;

public class Driver {
    String name;
    int age;

    public Driver(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return (name+" age "+age);
    }


    //* Driver depends on vehicle to drive ;
    //* Dependency association is formed in terms of the scope of the operation and not on the class
     void drive(Vehicle raceCar){
        raceCar.accelarate();
        raceCar.turbo();
    }
    void stop(Vehicle raceCar){
        raceCar.brake();
    }

    
}
