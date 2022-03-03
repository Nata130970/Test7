import org.testng.annotations.Test;
import java.util.ArrayList;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FishClassTest extends SettingTest {

    @Test
    public void testFishFood(){

        String name = "Кит";
        ArrayList<String> props = Fauna.fauna.get(name);
        String expectedFood = props.get(0).trim();
        Fish fish = new Fish(name);
        String result = fish.getFood().trim();
        assertTrue(result.contains(expectedFood),String.format("%s Exp: %s Res: %s",name,result,expectedFood));
    }

    @Test
    public void testHabbit(){

        String name = "Сом";
        ArrayList<String> props = Fauna.fauna.get(name);
        String expectedHabitat = props.get(1).trim();
        Fish fish = new Fish(name);
        String result = fish.whereLive().trim();
        assertTrue(result.contains(expectedHabitat),String.format("%s Exp: %s Res: %s",name,result,expectedHabitat));
    }
    @Test
    public void testAboutFish(){

        String name = "Анчоус";
        ArrayList<String> props = Fauna.fauna.get(name);
        String expectedHabitat = props.get(2).trim();

        Fish fish = new Fish(name);
        String result = fish.aboutFish().trim();
        assertTrue(result.contains(expectedHabitat),String.format("%s Exp: %s Res: %s",name,result,expectedHabitat));
    }

}
