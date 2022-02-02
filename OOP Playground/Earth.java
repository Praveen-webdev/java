
public class Earth {
    public static void main(String[] args) {
        // * method -1:
        // Human joe=new Human();
        // joe.name="Joe";
        // joe.language="English";
        // joe.fluency="good";
        // joe.speak();
        // * method -2:
        // Animal zebra = new Animal(2, "male", 67, true, true);
        // // Animal monkey=new Animal(3, "female", 15, false, true);
        // // monkey.state();
        // zebra.state();
        //* inheritance
        // Bird kukoo = new Bird(1, "m", 1, false, true);
        // kukoo.state(); // kukoo has now access to animal
        //* Interface 
        // Chicken cuteChick=new Chicken(0, null, 0, false, false);
        // cuteChick.fly(); //! It does not exist
        // Sparrow jackSparrow=new Sparrow(0, null, 0, false, false);
        // jackSparrow.fly();
        //* Abstract class
        //? Abstract classes cannot be instantiated,but can have subclass
        //? Abstract methods are declared without implementation
        // Chicken hen=new Chicken(0, null, 0, false, false);
        // Sparrow blackWidow=new Sparrow(0, null, 0, false, false);
        // feedBird(hen);
        // feedBird(blackWidow);
      

    }
    public static void feedBird(Bird birds ){ //Bird - common for both ||polymorphism
        birds.consume();
    }
}