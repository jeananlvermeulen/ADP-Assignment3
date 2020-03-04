package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuestTest {

    Volkswagen volkswagen;
    Airplane airplane;
    Vehicle boat;

    @Before
    public void setup() throws Exception
    {
        volkswagen = new Volkswagen();
        airplane = new Airplane();
        boat= new Boat();

    }

    @After
    public void teardown()throws Exception
    {

    }

    @Test
    public void testInherit()
    {
        Assert.assertEquals("Volkswagen", volkswagen.getClass(), volkswagen.getClass());
        System.out.println(volkswagen.getClass());
        System.out.println(volkswagen.vechName());
        System.out.println("---------------------");
        Assert.assertEquals("Airplane", airplane.getClass(), airplane.getClass());
        System.out.println(airplane.getClass());
        System.out.println(airplane.vechName());

    }

    @Test
    public void testPoly()
    {
        System.out.println(boat.getClass());
        System.out.println(boat.move());
        Assert.assertSame("Drive on water", boat.move());

    }
}
