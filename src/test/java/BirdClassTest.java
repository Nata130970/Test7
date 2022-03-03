import org.testng.annotations.Test;
import java.util.ArrayList;
import static org.testng.Assert.assertNotEquals;

public class BirdClassTest extends SettingTest{

    @Test
    public void testGetFood(){

        String name = "Курица";
        ArrayList<String> props = Fauna.fauna.get(name);
        String expectedFood = "Eст " + props.get(0).trim();
        Bird bird = new Bird(name);
        String result = bird.getFood().trim();
        assertNotEquals(result,expectedFood,String.format("%s Exp: %s Res: %s",name,result,expectedFood));
    }

    @Test
    public void testHabbit(){

        String name = "Пингвин";
        ArrayList<String> props = Fauna.fauna.get(name);
        String expectedHabitat = "Живет " + props.get(1).trim();
        Bird bird = new Bird(name);
        String result = bird.whereLive().trim();
        assertNotEquals(result,expectedHabitat,String.format("%s Exp: %s Res: %s",name,result,expectedHabitat));
    }
    @Test
    public void testMove(){

        String name = "Страус";
        ArrayList<String> props = Fauna.fauna.get(name);
        String expectedHabitat =  "Ходит " + props.get(2).trim();
        Bird bird = new Bird(name);
        String result = bird.move().trim();
        assertNotEquals(result,expectedHabitat,String.format("%s Exp: %s Res: %s",name,result,expectedHabitat));
    }


}
