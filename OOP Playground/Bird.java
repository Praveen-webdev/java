public abstract class Bird extends Animal {

    public Bird(int ageOld, String gender, int weight, boolean isSleeping, boolean isEating) {
        super(ageOld, gender, weight, isSleeping, isEating);
    }
        
    protected abstract void consume();

}
