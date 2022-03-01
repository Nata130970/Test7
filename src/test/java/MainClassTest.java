import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.ArrayList;
import static org.testng.Assert.assertEquals;


public class MainClassTest extends SettingTest{


    @Test(groups = { "food" })
    public void testGetFood(){

        String name = "Панда";
        ArrayList<String> props = Fauna.fauna.get(name);
        String expectedFood = "Eст " + props.get(0).trim();
        Animal animal = new Animal(name);
        String result = animal.getFood().trim();
        assertEquals(result,expectedFood,String.format("%s Exp: %s Res: %s",name,result,expectedFood));
    }

    @Test(groups = { "habbit" })
    public void testHabbit(){

        String name = "Жираф";
        ArrayList<String> props = Fauna.fauna.get(name);
        String expectedHabitat = "Живет " + props.get(1).trim();
        Animal animal = new Animal(name);
        String result = animal.whereLive().trim();
        assertEquals(result,expectedHabitat,String.format("%s Exp: %s Res: %s",name,result,expectedHabitat));
    }
    @Test(groups = { "move" })
    public void testMove(){

        String name = "Корова";
        ArrayList<String> props = Fauna.fauna.get(name);
        String expectedHabitat = "Ходит " + props.get(2).trim();
        Animal animal = new Animal(name);
        String result = animal.move().trim();
        assertEquals(result,expectedHabitat,String.format("%s Exp: %s Res: %s",name,result,expectedHabitat));
    }

}
