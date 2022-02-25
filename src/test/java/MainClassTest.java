import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MainClassTest {

    @Test
    public void testGetFood(){
        Fauna.faunaInit();
        String name = "Панда";
        ArrayList<String> props = Fauna.fauna.get(name);
        String expectedFood = "Eст " + props.get(0).trim();
        Animal animal = new Animal(name);
        String result = animal.getFood().trim();
        assertEquals(result,expectedFood,String.format("Exp: %s Res: %s",result,expectedFood));
    }
}
