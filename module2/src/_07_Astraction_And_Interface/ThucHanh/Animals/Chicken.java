package _07_Astraction_And_Interface.ThucHanh.Animals;

public class Chicken extends  Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken:CUC-TAC, CUC-TAC";
    }

    @Override
    public String howToEat() {
        return "could be friend";
    }
}
