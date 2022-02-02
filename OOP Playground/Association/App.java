package Association;

public class App {
    public static void main(String[] args) {
        //* ralationship between the classes is known as association
        //? Dependency association
        // Vehicle raceCar=new Vehicle();
        // Driver raceDriver=new Driver();
        // raceDriver.drive(raceCar);
        //*Creating driver objects
        Driver driver1=new Driver("Praveen",21);
        Driver driver2=new Driver("Aravind",19);
        //*Creating vehicle objects
        Vehicle vehicle1=new Vehicle("Tesla",2022,driver1);
        Vehicle vehicle2=new Vehicle("Benz",2021,driver2);
        Vehicle vehicle3=new Vehicle("Audi",2022,driver1);
        Vehicle vehicle4=new Vehicle("Jaguar",2021,driver1);
        vehicle1.status();
        vehicle2.status();
        vehicle3.status();
        vehicle4.status();
    }
}
