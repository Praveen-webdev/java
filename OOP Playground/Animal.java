public class Animal {
    int age;
    String gender;
    int weight;
    boolean isSleeping;
    boolean isEating;
    boolean isHealthy;

    public Animal(int ageOld, String gender, int weight, boolean isSleeping, boolean isEating) {
        // Assgning given attribute to this object
        this.age = ageOld; // ! monkey.ages=age(given attribute)
        this.gender = gender;
        this.weight = weight;
        this.isEating = isEating;
        this.isSleeping = isSleeping;
    }
    public void bio(){
        if(age<5&&weight<=100)
        System.out.println("Active");
        else System.out.println("Inctive");
    }
    public void state(){
        Animal zebra=new Animal(3, "female", 15, false, true); //another zebra which is in heap of state (stack)
        zebra.bio();
        String health=isSleeping&&isEating?"good":"bad";
        System.out.println("Animal is "+health+ " condition");
    }
}
