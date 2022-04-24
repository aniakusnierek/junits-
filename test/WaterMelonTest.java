package test;


import org.junit.Assert;
import org.junit.Test;
import src.WaterMelon;

public class WaterMelonTest {

    @Test
    public void test() {

        WaterMelon melon = new WaterMelon();
        String colourOfMelon = melon.getMelonColour();
        System.out.println("Melon ma kolor " + colourOfMelon);

        Assert.assertEquals("red", colourOfMelon);


        Assert.assertEquals("green", melon.getMelonColour(true));

        Assert.assertEquals("red", melon.getMelonColour(false));

    }

    @Test
    public void testNumberOfSeeds() {

        WaterMelon melon = new WaterMelon();
       // String seedsOfMelon = melon.getMelonSeeds();
        //ystem.out.println("A melon has got " + seedsOfMelon);

        System.out.println("Testing an unripe melon");
        Assert.assertEquals("no seeds", melon.getMelonSeeds(true));

        System.out.println("Testin a ripe melon");
        Assert.assertEquals("ten seeds", melon.getMelonSeeds(false));
    }
}
