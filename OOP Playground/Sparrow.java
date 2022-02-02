public class Sparrow extends Bird implements Flyable{
    String name="Sparrow";
    public Sparrow(int ageOld, String gender, int weight, boolean isSleeping, boolean isEating) {
        super(ageOld, gender, weight, isSleeping, isEating);
    }

    public void fly() {
        System.out.println(name+" is flying...");        
    }

    @Override
    public void consume() {
        System.out.println("feeding worms");
    }
    
    
}
