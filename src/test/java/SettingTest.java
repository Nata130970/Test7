import org.testng.annotations.BeforeTest;

public class SettingTest {
    @BeforeTest
    public void startSetting(){
        Fauna.faunaInit();
    }
}
