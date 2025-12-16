package CodingToAnInterface;

public class AnimalTrainer {
    private active animal;   //abstrakter Typ

    //INFO: egal welches Tier, hauptsache active
    public AnimalTrainer(active animal) {
        this.animal = animal;  //jede Implementierung möglich!
    }

    public void train() {
        animal.makeSound();
    }


    public static void main(String[] args) {


        AnimalTrainer dogTrainer = new AnimalTrainer(new Dog("Ella"));
        dogTrainer.train();

        AnimalTrainer catTrainer = new AnimalTrainer(new Cat("Lisa"));
        catTrainer.train();



    }
}
