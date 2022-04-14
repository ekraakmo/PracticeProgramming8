package kraakmo.learningjava;

import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args) {
        String color = ranColor();
        String animal = ranAnimal();
        String colorAgain = ranColor();
        int weight = ranInt(5,200);
        int distance = ranInt(10,20);
        int number = ranInt(10000,20000);
        int time = ranInt(2,6);

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", " +
                weight + "lb miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " popies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
        + "let me tell you!");
    }

    public static String ranColor(){
        Random colorGenerator = new Random();

        int colorNum = colorGenerator.nextInt(5);
        String color;

        if (colorNum == 4) {
           color = "Red";
        } else if (colorNum == 3) {
            color = "Blue";
        } else if (colorNum == 2) {
            color = "Green";
        } else if (colorNum == 1) {
            color = "Yellow";
        } else {
            color = "Purple";
        }
    return color;
    }

    public static String ranAnimal(){
        Random animalGenerator = new Random();

        int animalNum = animalGenerator.nextInt(5);
        String animal;

        if (animalNum == 4) {
            animal = "Giraffe";
        } else if (animalNum == 3) {
            animal = "Wolf";
        } else if (animalNum == 2) {
            animal = "Snake";
        } else if (animalNum == 1) {
            animal = "Monkey";
        } else {
            animal = "Tiger";
        }
        return animal;
    }

    public static int ranInt(int min,int max) {
        Random numGenerator = new Random();
        return numGenerator.nextInt(min,max+1);
    }
}
