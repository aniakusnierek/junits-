package src;

public class WaterMelon {


    public void printColor() {

        System.out.println("Jestem czerwony melon");
    }

    public String getMelonColour() {
        return "red";
    }

    public String getMelonColour(boolean isMelonYoung) {
        System.out.println("isMelonYoung " + isMelonYoung);
        if (isMelonYoung) {
            return "green";
        } else {
            return "red";
        }
    }

    public void printTheNumberOfSeeds() {
        System.out.println("Melon ma 30 pestek");
    }
    // Dodaj nową metodę zwracającą ilość nasion melona w zależnośći od tego czy jest młody czy nie.
    // Jeśli jest dojrzały - niech metoda zwróci 10 nasion, a jeśli młody, to 0 nasion.
    // Dod napisz junit w którym testujesz ilość zwracanych nasion//

    public String getMelonSeeds(boolean isMelonYoung) {
        System.out.println("checking for the number of melon seeds " + isMelonYoung);
        if (isMelonYoung) {
            System.out.println("Melon is young - there is no seeds");
            return "no seeds";
        } else {
            System.out.println("Melon is ripe - there are ten seeds");
            return "ten seeds";
        }
    }
}
