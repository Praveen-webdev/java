public class Chicken extends Bird {

    public Chicken(int ageOld, String gender, int weight, boolean isSleeping, boolean isEating) {
        super(ageOld, gender, weight, isSleeping, isEating);
                
    }

    protected void consume() {
        System.out.println("feeding cereals");
    }

}
