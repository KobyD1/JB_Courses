package ObjectOrientedHomeWork;

public class AnimalTestMain {

    public static void main(String[] args) {
        Cat myCat1 = new Cat(true, "Mizi");
        Dog myDog1 = new Dog(4, "Rexi");
        myCat1.goToEat();
        myCat1.makeNoise();
    }
}
