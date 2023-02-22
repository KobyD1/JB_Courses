package ObjectOrientedHomeWork;

public class Cat extends Animal{

    public Cat (boolean gender, String name) {
        boolean catGender = gender;
        String  catName = name;
    }

    public void goToEat(){
        System.out.println("the cat is running to eat ");

    }

    public void makeNoise(){
        System.out.println("Miao");
    }

}
