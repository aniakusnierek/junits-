package src;

public class Main {


    public static void main(String[] args) {

        WaterMelon melon = new WaterMelon();

        melon.printColor();

        melon.printTheNumberOfSeeds();
        String colourOfMelon = melon.getMelonColour();
        System.out.println("Melon ma kolor " + colourOfMelon);
    }
}
